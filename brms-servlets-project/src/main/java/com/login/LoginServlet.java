package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modalclasses.AvailableModal;
import com.modalclasses.ConformationdetailsModal;
import com.modalclasses.SeatModal;
import com.modalclasses.SrcDestDate;
import com.modalclasses.UserDetailsModal;
import com.mysql.cj.jdbc.CallableStatement;

@WebServlet("/loginaccess")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uName="" ,eMail="",mblNo="",DoB="",age="",src="",dest="",busDate="",seatNo="",busRegNo="",pnrNum="";
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		System.out.println("datacomming");
		String email= req.getParameter("email");
		String pass =req.getParameter("password");
		
		System.out.println(email);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver found");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver not foundddddd");
		}
		try (Connection con =DriverManager.getConnection("jdbc:mysql://localhost/newproject","root","As@13042000")){
			
			System.out.println("cs--1");
			CallableStatement cs= (CallableStatement) con.prepareCall("{call valid_user_in_java(?,?)}");
			CallableStatement cs12= (CallableStatement) con.prepareCall("{call calling_src_dest_date()}");
			CallableStatement cs2= (CallableStatement) con.prepareCall("{call calling_seat_date()}");
			String src1=email,dest1=pass;
			System.out.println("cs--2");
			cs.setString(1, email);
			cs.setString(2, pass);
			
			System.out.println(src1+" and "+dest1);

			ResultSet rs=cs.executeQuery();
			
			
			if(rs.next())
			{
				uName=rs.getString(2);
				eMail=rs.getString(3);
				mblNo=rs.getString(4);
				DoB=rs.getString(6);
				age=rs.getString(11);
			}
			else
			{
				System.out.println("entered credentials are wrong");
			}
			
			System.out.println("AAAAAAAAAAAAAAAAAAAA");
			

			ResultSet rsset = cs12.executeQuery();
			
			if(rsset.next())
			{
				System.out.println("CCCCCCCCCCCCCCCCCCC");
				src=rsset.getString(1);
				dest=rsset.getString(2);
				busDate=rsset.getString(3);
				busRegNo=rsset.getString(4);
			}
			
			System.out.println("BBBBBBBBBBBBBBBBBB");

			ResultSet rs2 = cs2.executeQuery();
			
			if(rs2.next())
			{
				System.out.println("DDDDDDDDDDDDDDDDDD");
				seatNo=rs2.getString(1);
			}
			
			
			System.out.println("///////////////////////////");
			System.out.println(uName+" "+eMail+" "+mblNo+" "+DoB+" "+age+" "+src+" "+dest+" "+busDate+" "+seatNo+" "+busRegNo);
			
			CallableStatement book= (CallableStatement) con.prepareCall("{call bookingseat(?,?)}");
			
			book.setString(1, seatNo);
			book.setString(2,busRegNo);
			
			ResultSet booking = book.executeQuery();
			
			
			CallableStatement result= (CallableStatement) con.prepareCall("{call user_full_details(?,?,?,?,?,?)}");
			
			result.setString(1, busRegNo);
			result.setString(2, seatNo);
			result.setString(3, eMail);
			result.setString(4, src);
			result.setString(5, dest);
			result.setString(6, busDate);
			
			ResultSet ress = result.executeQuery();
			
			ArrayList<ConformationdetailsModal> cdm = new ArrayList<ConformationdetailsModal>();
			
			if(ress.next())
			{
				
				ConformationdetailsModal obj =new ConformationdetailsModal();
				obj.setBusregNo(ress.getString(1));
				obj.setSource(ress.getString(11));
				obj.setDestination(ress.getString(12));
				obj.setBoardingTime(ress.getString(14));
				obj.setDepartTime(ress.getString(15));
				obj.setSeatNo(ress.getInt(2));
				obj.setDateOfTravel(ress.getString(13));
				obj.setPassengerName(ress.getString(7));
				obj.setEmail(ress.getString(8));
				obj.setMblNum(ress.getString(9));
				obj.setTicketCharges(ress.getString(16));
				
				pnrNum = ress.getString(5);	
				cdm.add(obj);
			}
			
			System.out.println("PNR NUMBER IS "+pnrNum);
			
			CallableStatement settingPnr= (CallableStatement) con.prepareCall("{call pnr_number_updating(?)}");
			settingPnr.setString(1,pnrNum);
			
			ResultSet resspnr = settingPnr.executeQuery();
			
			System.out.println("arayabhsdbchsb"+cdm);
			
			CallableStatement resultFinal= (CallableStatement) con.prepareCall("{call user_ui(?,?,?,?,?,?)}");
			resultFinal.setString(1, busRegNo);
			resultFinal.setString(2, seatNo);
			resultFinal.setString(3, eMail);
			resultFinal.setString(4, src);
			resultFinal.setString(5, dest);
			resultFinal.setString(6, busDate);
			
			ResultSet ressFinal = resultFinal.executeQuery();
			
			RequestDispatcher rd;
					req.setAttribute("userbookeddetails", cdm);
					System.out.println("after userdata");
					ServletContext ctxt = getServletContext();
					rd =ctxt.getRequestDispatcher("/UserDetailsAfterBooked.jsp");
					rd.forward(req, res);
					
		} 
		catch(SQLException e)
		{
			e.printStackTrace();
			pw.println("<br>-----"+e.getMessage()+"----<br>");
		}
		catch (Exception e) {
			e.printStackTrace();
			pw.println("<br>-----"+e.getMessage()+"----<br>");
		}
		
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doPost(req,res);
	}

}

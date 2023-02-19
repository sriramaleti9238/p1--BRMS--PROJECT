package com.finalpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.CallableStatement;


@WebServlet("/finalpage")
public class FinalServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter pw= res.getWriter();
		String pnrNum="";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver found");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver not foundddddd");
		}
		try (Connection con =DriverManager.getConnection("jdbc:mysql://localhost/newproject","root","As@13042000")){
			
			System.out.println("cs--1");
			CallableStatement css= (CallableStatement) con.prepareCall("{call calling_pnr()}");
			
			ResultSet rss=css.executeQuery();	
			
			while(rss.next())
			{
				pnrNum=rss.getString(1);
			}
			
			CallableStatement cs= (CallableStatement) con.prepareCall("{call searching_using_pnr(?)}");
			cs.setString(1, pnrNum);
			ResultSet rs = cs.executeQuery();
			
			ArrayList<FinalModal> afm = new ArrayList<FinalModal>();
			
			while(rs.next())
			{
			FinalModal obj =new FinalModal();
			obj.setRegNo(rs.getString(1));
			obj.setSeatNo(rs.getInt(2));
			obj.setBirthType(rs.getString(3));
			obj.setStatus(rs.getString(4));
			obj.setPnr(rs.getString(5));
			obj.setReservDateTime(rs.getString(6));
			obj.setUserName(rs.getString(7));
			obj.setEmail(rs.getString(8));
			obj.setMblNo(rs.getString(9));
			obj.setAge(rs.getString(10));
			obj.setSrc(rs.getString(11));
			obj.setDest(rs.getString(12));
			obj.setDateOfTravel(rs.getString(13));
			obj.setBoardTime(rs.getString(14));
			obj.setArrivalTime(rs.getString(15));
			obj.setTicketCharges(rs.getString(16));
			
			
			afm.add(obj);
			
			}
			RequestDispatcher rd ;
			req.setAttribute("finaltickettlast", afm);
			ServletContext ctxt = getServletContext();
			rd =ctxt.getRequestDispatcher("/finalticketfull.jsp");
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
	
}

package com.seatstore;

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

import com.modalclasses.AvailableModal;
import com.modalclasses.SeatModal;
import com.modalclasses.SrcDestDate;
import com.modalclasses.UserDetailsModal;
import com.mysql.cj.jdbc.CallableStatement;

import jakarta.servlet.ServletException;

@WebServlet("/linklogiin")
public class SeatStore extends HttpServlet{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("its printing on the console");
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
	
		String seatNo = req.getParameter("seatNumber");
		
		int seatNoo = Integer.parseInt(seatNo);
		System.out.println("Seat number is "+seatNoo);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver found");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("driver not foundddddd");
		}
		try (Connection con =DriverManager.getConnection("jdbc:mysql://localhost/newproject","root","As@13042000")){
			
			System.out.println("cs--1");
			CallableStatement cs= (CallableStatement) con.prepareCall("{call seat_number_updating(?)}");
			
			cs.setInt(1, seatNoo);
			
			ResultSet rs=cs.executeQuery();	
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
		
		try {
			SeatModal sd = new SeatModal();
			ArrayList<SeatModal>  al = new ArrayList<SeatModal>();
			sd.setSeatNo(seatNoo);
			al.add(sd);
			System.out.println("seat number in try block is "+al);
			RequestDispatcher rd;
			
			req.setAttribute("SeatNumberTransfer", al);
			System.out.println("1");
			ServletContext ctxt = getServletContext();
			rd =ctxt.getRequestDispatcher("/loginpage.jsp");
			System.out.println("2");
			rd.forward(req, res);
		} catch (Exception e) {
			System.out.println("exception occured transferring seat number");
		}
	}
}

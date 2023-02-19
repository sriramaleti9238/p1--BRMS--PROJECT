package com.availablebuses;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/content")
public class AvailableBuses extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		ResultSet rs = (ResultSet)req.getAttribute("output");
		
		PrintWriter pw=res.getWriter();
		
		try {
			pw.println(rs.getString(1));
			pw.println(rs.getString(2));
			pw.println(rs.getString(3));
			pw.println(rs.getString(4));
			pw.println(rs.getString(5));
			pw.println(rs.getString(6));
			pw.println(rs.getString(7));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

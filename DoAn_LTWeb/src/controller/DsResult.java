package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ResultDAO;
import model.Result;




@WebServlet("/DsResult")
public class DsResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DsResult() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");		
	        PrintWriter out = response.getWriter();
	        System.out.println("Co xu ly");
	        String userID = (String) getServletContext().getAttribute("userID");
		try {
			List<Result> dsResults = ResultDAO.getResult(userID);
			
			if(dsResults == null)
			{
				System.out.println("Loi");
				return;
			}
			getServletContext().setAttribute("dsResults",dsResults);			
			for(Result rs: dsResults)
			out.println("<tr><td>"+rs.getSubjectName()+"</td><td>"+rs.getPoint()+"</td></tr>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

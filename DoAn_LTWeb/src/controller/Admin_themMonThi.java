package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ThemMonThiDAO;

@WebServlet("/Admin_themMonThi")
public class Admin_themMonThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Admin_themMonThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String SubjectName = (String)request.getParameter("Subject");
		
		try{
			ThemMonThiDAO themmon = new ThemMonThiDAO();
			themmon.CreateMonThi(SubjectName);
		}catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}

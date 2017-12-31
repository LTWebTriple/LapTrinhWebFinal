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
import model.*;
import DAO.*;

@WebServlet("/LoginPhanQuyen")
public class LoginPhanQuyen extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginPhanQuyen() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		Login loginBean = new Login();

		loginBean.setUserName(userName);
		loginBean.setPassword(password);

		getServletContext().setAttribute("loginBean", loginBean);
		
		List<User> user;
		LoginDAO loginDao = new LoginDAO();
		
		List<Subject> subjects;
		List<KindOfQuestion> kindofquestion;
		List<Roles> roles;
		
		RolesDAO rolesDAO = new RolesDAO();
		
		SubjectDAO subjectDao = new SubjectDAO();
		
		KindOfQuestionDAO kindofquestionDao = new KindOfQuestionDAO();
		
		try {
			roles = rolesDAO.getRoles();
			getServletContext().setAttribute("Roles", roles);
			
			} catch (SQLException e) {
				e.printStackTrace();
			}

		try {
		subjects = subjectDao.getSubject();
		getServletContext().setAttribute("Subjects", subjects);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
		kindofquestion = kindofquestionDao.getKindOfQuestion();
		getServletContext().setAttribute("KindOfQuestion", kindofquestion);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			user = loginDao.authenticateUser(loginBean);
			if (user == null) {
				request.getRequestDispatcher("./WEB-INF/LoginFail.jsp").forward(request, response);
			} else {
				User Nguoidung = user.get(0);
				getServletContext().setAttribute("userID", Nguoidung.getUserId());
				getServletContext().setAttribute("Userrrrr", user);
				
				response.sendRedirect("./ToRole");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

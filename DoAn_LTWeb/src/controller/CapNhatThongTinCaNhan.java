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

import DAO.CapNhatThongTinDAO;
import DAO.LoginDAO;
import model.Login;
import model.User;

@WebServlet("/CapNhatThongTinCaNhan")
public class CapNhatThongTinCaNhan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CapNhatThongTinCaNhan() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		String UserId = (String) getServletContext().getAttribute("userID");
		int userid = Integer.valueOf(UserId);

		String ten = request.getParameter("ten");
		String ngaysinh = request.getParameter("ngaysinh");
		String cmnd = request.getParameter("cmnd");
		String sodienthoai = request.getParameter("sodienthoai");

		try {
			CapNhatThongTinDAO temp = new CapNhatThongTinDAO();
			temp.Capnhatthongtin(userid, ten, ngaysinh, cmnd, sodienthoai);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<User> user;
		LoginDAO loginDao = new LoginDAO();

		Login loginBean = (Login) getServletContext().getAttribute("loginBean");

		try {
			user = loginDao.authenticateUser(loginBean);
			getServletContext().setAttribute("Userrrrr", user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

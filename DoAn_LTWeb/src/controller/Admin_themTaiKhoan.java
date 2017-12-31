package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.*;
import model.*;

@WebServlet("/Admin_themTaiKhoan")
public class Admin_themTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Admin_themTaiKhoan() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String UserName = request.getParameter("UserName");
		String FullName = request.getParameter("FullName");
		String Pass = request.getParameter("Pass");
		String Birth = request.getParameter("Birth");
		String CMND = request.getParameter("CMND");
		String Tel = request.getParameter("Tel");
		String RoleId = request.getParameter("RoleId");
		String SubjectId = request.getParameter("SubjectId");

		if (RoleId.equals("4")) {
			if (UserName == "" || FullName == "" || Pass == "" || Birth == "" || CMND == "" 
					|| Tel == "" || RoleId == "" || SubjectId == "") {
				out.println(1);
				return;
			}
		} else{
			if (UserName == "" || FullName == "" || Pass == "" || Birth == "" || CMND == "" 
					|| Tel == "" || RoleId == "") {
				out.println(1);
				return;
			}
		}

		try {
			ThemTaiKhoanDAO themtaikhoan = new ThemTaiKhoanDAO();
			themtaikhoan.ThemTaiKhoan(UserName, FullName, Pass, Birth, CMND, Tel);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		int userId;
		String userid = null;
		try {
			ThemTaiKhoanDAO userID = new ThemTaiKhoanDAO();
			userId = userID.getTaiKhoanVuaThem();
			userid = String.valueOf(userId);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			ThemTaiKhoanDAO themuserroles = new ThemTaiKhoanDAO();
			themuserroles.ThemUserRoles(userid, RoleId);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (SubjectId != "0") {
			try {
				ThemTaiKhoanDAO themsubjectstudent = new ThemTaiKhoanDAO();
				themsubjectstudent.ThemSubjectStudent(userid, SubjectId);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

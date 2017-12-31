package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import DAO.*;

@WebServlet("/Admin_xemTaiKhoan")
public class Admin_xemTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Admin_xemTaiKhoan() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		List<User> TK = new ArrayList<User>();
		XemTaiKhoanDAO dao = new XemTaiKhoanDAO();
		
		try {
			TK = (List<User>)dao.TaiKhoan();
			this.getServletContext().setAttribute("TK",TK);
			
			out.println("<thead><tr><th>Mã Tài Khoản</th><th>Tên Tài Khoản</th><th>Tên</th><th>Mật Khẩu</th><th>Ngày Sinh</th><th>SĐT</th><th>Quyền</th></tr></thead>");
			
			for(User rs: TK)
				out.println("<tbody><tr><td>"+ rs.getUserId() +"</td><td>"+ rs.getUserName() +"</td><td>"+ rs.getName() +"</td><td>"+ rs.getPass() +"</td><td>"+ rs.getBirth() +"</td><td>"+ rs.getTel() +"</td><td>"+ rs.getRoleName() +"</td></tr></tbody>");
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
	}

}

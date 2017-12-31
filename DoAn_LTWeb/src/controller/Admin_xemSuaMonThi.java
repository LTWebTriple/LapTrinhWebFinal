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

@WebServlet("/Admin_xemSuaMonThi")
public class Admin_xemSuaMonThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Admin_xemSuaMonThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		List<Subject> ListMonThi = new ArrayList<Subject>();
		XemSuaMonThiDAO dao = new XemSuaMonThiDAO();
		
		try {
			ListMonThi = (List<Subject>)dao.MonThi();
			this.getServletContext().setAttribute("ListMonThi",ListMonThi);
			
			out.println("<thead><tr><th>Mã Môn Thi</th><th>Tên Môn Thi</th><th></th></tr></thead>");
			
			for(Subject rs: ListMonThi)
				out.println("<tbody><tr><td>"+ rs.getSubId() +"</td><td>"+ rs.getSubName() +"</td><td><a href='./ChuyenTrangSuaMonThi?MaMon="+ rs.getSubId() +"' style='padding: 1px 6px' class='btn green-haze'>Chỉnh Sửa</a></td></tr></tbody>");
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
	}

}

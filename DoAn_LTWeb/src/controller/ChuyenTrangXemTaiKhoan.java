package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChuyenTrangXemTaiKhoan")
public class ChuyenTrangXemTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ChuyenTrangXemTaiKhoan() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Admin_xemTaiKhoan.jsp").forward(request, response);
	}
}

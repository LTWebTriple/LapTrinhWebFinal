package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ChuyenTrangXemSuaMonThi")
public class ChuyenTrangXemSuaMonThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ChuyenTrangXemSuaMonThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Admin_xemSuaMonThi.jsp").forward(request, response);
	}
}

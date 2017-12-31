package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChuyenTrangXoaLichThi")
public class ChuyenTrangXoaLichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChuyenTrangXoaLichThi() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/QLDT_xemLichThi.jsp").forward(request, response);
	}

}

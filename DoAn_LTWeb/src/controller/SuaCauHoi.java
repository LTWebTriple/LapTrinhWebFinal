package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SuaCauHoi")
public class SuaCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SuaCauHoi() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ID = request.getParameter("ID");
		getServletContext().setAttribute("IDCauHoi",ID);
		System.out.println("Da vao trang nay");
		RequestDispatcher rd = request.getRequestDispatcher("./WEB-INF/QLNHCH_SuaCauHoi.jsp");
		rd.forward(request , response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String ID = request.getParameter("ID");
		getServletContext().setAttribute("IDCauHoi",ID);
		System.out.println("Da vao trang nay");
		RequestDispatcher rd = request.getRequestDispatcher("./WEB-INF/QLNHCH_SuaCauHoi.jsp");
		rd.forward(request , response);*/
	}

}

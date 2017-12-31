package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Student_ToLichThi")
public class Student_ToLichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Student_ToLichThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Student_Schedule.jsp").forward(request, response);
	}
}

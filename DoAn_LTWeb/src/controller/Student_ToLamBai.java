package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.KiemTraSoLanThiDAO;

@WebServlet("/Student_ToLamBai")
public class Student_ToLamBai extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Student_ToLamBai() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().setAttribute("TestId", request.getParameter("TestId"));
		getServletContext().setAttribute("UserId", request.getParameter("UserId"));
		getServletContext().setAttribute("SubjectId", request.getParameter("SubjectId"));
		getServletContext().setAttribute("Time_Test", request.getParameter("Time_Test"));
		int solanlambai = 0;
		
		try {
			solanlambai = KiemTraSoLanThiDAO.kiemTraSoLanThi(Integer.valueOf(request.getParameter("UserId")), Integer.valueOf(request.getParameter("SubjectId")), Integer.valueOf(request.getParameter("TestId")));
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(solanlambai == 0)
			this.getServletContext().getRequestDispatcher("/WEB-INF/Student_DoingExam.jsp").forward(request, response);
		else
			this.getServletContext().getRequestDispatcher("/WEB-INF/Student_Schedule.jsp").forward(request, response);
		
	}

}

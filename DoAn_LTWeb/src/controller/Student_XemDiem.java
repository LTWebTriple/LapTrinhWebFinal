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

import DAO.XemDiemDAO;
import model.Subject;

@WebServlet("/Student_XemDiem")
public class Student_XemDiem extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Student_XemDiem() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 		
		PrintWriter out = response.getWriter();
		String userId = (String)getServletContext().getAttribute("userID");
		try {
			List<model.PhieuDiem> BangDiem = XemDiemDAO.geBangDiem(Integer.valueOf(userId));
			
			if(BangDiem == null)
			{
				System.out.println("Loi");
				return;
			}
			
			for(model.PhieuDiem rs: BangDiem)
				if(Float.valueOf(rs.getPoint()) >= 5)
					out.println("<tr><td>"+ rs.getTestName() +"</td><td>"+ rs.getDate() +"</td><td>"+ rs.getTrueAnswer()+"/"+ rs.getAnswerSize()+ "</td><td>"+ rs.getPoint() + "</td><td style='text-align:center;'><input type='checkbox' checked disabled></td></tr>");
				else
					out.println("<tr><td>"+ rs.getTestName() +"</td><td>"+ rs.getDate() +"</td><td>"+ rs.getTrueAnswer()+"/"+ rs.getAnswerSize()+ "</td><td>"+ rs.getPoint() + "</td><td style='text-align:center;'><input type='checkbox' disabled></td></tr>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

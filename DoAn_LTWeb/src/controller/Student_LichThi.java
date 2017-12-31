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

import DAO.LichThiDAO;

@WebServlet("/Student_LichThi")
public class Student_LichThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Student_LichThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		PrintWriter out = response.getWriter();
		 String userID = (String) getServletContext().getAttribute("userID");
		try {
			List<model.LichThi> dsLichThi = LichThiDAO.getLichThi(Integer.valueOf(userID));
			
			if(dsLichThi == null)
			{
				System.out.println("Loi");
				return;
			}
			
			System.out.println(request.getContextPath());
			
			for(model.LichThi rs: dsLichThi)
				if(rs.getInTest() != 1)
					out.println("<tr><td>"+ rs.getTestName() +"</td><td>"+ rs.getDate() +"</td><td>"+ rs.getTime_Start()+"-"+ rs.getTime_Close()+ "</td><td>"+ rs.getTime_Test() + " phút" + "</td><td style='text-align: center;'>" + "<a href='" + request.getContextPath() + "/Student_ToLamBai?TestId="+ rs.getTestId() + "&UserId=" + rs.getUserId() + "&SubjectId=" + rs.getSubjectId() +"&Time_Test=" + rs.getTime_Test()+"' class='btn green-haze'>Làm bài</a>" + "</td></tr>");
				else
					out.println("<tr><td>"+ rs.getTestName() +"</td><td>"+ rs.getDate() +"</td><td style='color: red;'>"+ rs.getTime_Start()+"-"+ rs.getTime_Close()+ "</td><td>"+ rs.getTime_Test() + " phút" + "</td><td>" + "<a href='" + request.getContextPath() + "/Student_ToLamBai?TestId="+ rs.getTestId() + "&UserId=" + rs.getUserId() + "&SubjectId=" + rs.getSubjectId() +"&Time_Test=" + rs.getTime_Test()+"' class='btn green-haze'>Làm bài</a>" + "</td></tr>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

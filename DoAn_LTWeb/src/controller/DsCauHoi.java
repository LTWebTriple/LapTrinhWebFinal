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

import DAO.LayCauHoiDAO;
import model.NoiDungCauHoi;
import model.ThemCau;


@WebServlet("/DsCauHoi")
public class DsCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DsCauHoi() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");		
	     PrintWriter out = response.getWriter();
	     List<NoiDungCauHoi> DsCauHoi = new ArrayList<NoiDungCauHoi>();
	     try {
			DsCauHoi = LayCauHoiDAO.getDsCauHoi();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     getServletContext().setAttribute("DsCauHoi", DsCauHoi);
			
			for(NoiDungCauHoi rs : DsCauHoi)
			{				
				out.println("<tr><td>"+rs.getQuestionId()+"</td><td>"+ rs.getQuestionContent() +"</td><td>"+ rs.getKindName()+"</td></tr>");				
			}
	}

}

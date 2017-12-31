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
import DAO.LayCauTraLoiDAO;
import model.CauTraLoi;
import model.NoiDungCauHoi;

/**
 * Servlet implementation class LoadNoiDungCauTraLoi
 */
@WebServlet("/LoadNoiDungCauTraLoi")
public class LoadNoiDungCauTraLoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadNoiDungCauTraLoi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");		
	     PrintWriter out = response.getWriter();
	     String IDCauHoi = (String)getServletContext().getAttribute("IDCauHoi");
	     List<CauTraLoi> dsCauTraLois = new ArrayList<CauTraLoi>();
	     try {
	    	 dsCauTraLois = LayCauTraLoiDAO.getCauTraLoi(Integer.valueOf(IDCauHoi));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     getServletContext().setAttribute("dsCauTraLois", dsCauTraLois);
			System.out.print("Co vao trang noi dung cau tra loi");
			for(CauTraLoi rs : dsCauTraLois)
			{				
				if(rs.getIsTrue()==1)
				{
					out.println("<tr><td>"+rs.getAnswerId()+"</td><td>"+ rs.getAnswerContent() +"</td><td>"+ "True"+"</td></tr>");
				}
				else {
					out.println("<tr><td>"+rs.getAnswerId()+"</td><td>"+ rs.getAnswerContent()+"</td><td>"+ "False"+"</td></tr>");
				}				
			}
	}

}

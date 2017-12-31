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

import DAO.LayCauTraLoiDAO;
import DAO.XoaCauTraLoiDAO;
import model.*;

/**
 * Servlet implementation class QLNHCH_CapNhatXoaCauTraLoi
 */
@WebServlet("/QLNHCH_CapNhatXoaCauTraLoi")
public class QLNHCH_CapNhatXoaCauTraLoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLNHCH_CapNhatXoaCauTraLoi() {
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
		int IDCauTraLoi= Integer.valueOf(request.getParameter("IDCauTraLoi"));
		int MaCauHoi = Integer.valueOf(request.getParameter("ID"));
		XoaCauTraLoiDAO a = new XoaCauTraLoiDAO();
		try {
			a.XoaCauTraLoi(IDCauTraLoi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<CauTraLoi>  dscauTraLoi = new ArrayList<CauTraLoi>(); 
		try {
			dscauTraLoi = LayCauTraLoiDAO.getCauTraLoi(MaCauHoi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		getServletContext().setAttribute("dsCauTraLoiThemVao", dscauTraLoi);
		
		for(CauTraLoi rs : dscauTraLoi)
		{
			
			if(rs.getIsTrue()==1)
			{
				out.println("<tr><td>"+rs.getAnswerId()+"</td><td>"+ rs.getAnswerContent() +"</td><td>"+ "True"+"</td></tr>");
			}
			else {
				out.println("<tr><td>"+rs.getAnswerId()+"</td><td>"+ rs.getAnswerContent() +"</td><td>"+ "False"+"</td></tr>");
			}
			
			
		}
	}

}

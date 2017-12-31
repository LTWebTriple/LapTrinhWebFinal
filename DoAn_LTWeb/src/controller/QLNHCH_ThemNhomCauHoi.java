package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ThemNhomCauHoiDAO;

/**
 * Servlet implementation class QLNHCH_ThemNhomCauHoi
 */
@WebServlet("/QLNHCH_ThemNhomCauHoi")
public class QLNHCH_ThemNhomCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLNHCH_ThemNhomCauHoi() {
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
	     String NoiDung= request.getParameter("NoiDung");
	     if(NoiDung==null )
	     {
	    	 out.println(1);
	    	 return;
	     }
	     ThemNhomCauHoiDAO a = new ThemNhomCauHoiDAO();
	     try {
			a.ThemNhomCauHoi(NoiDung);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

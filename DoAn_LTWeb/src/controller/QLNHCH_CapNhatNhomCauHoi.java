package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CapNhatCauHoiDAO;
import DAO.CapNhatNhomCauHoiDAO;

/**
 * Servlet implementation class QLNHCH_CapNhatNhomCauHoi
 */
@WebServlet("/QLNHCH_CapNhatNhomCauHoi")
public class QLNHCH_CapNhatNhomCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLNHCH_CapNhatNhomCauHoi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		int MaNhomCauHoi = Integer.valueOf(request.getParameter("ID"));
		String NDNhomCauTraHoi= request.getParameter("NoiDung");		
		
		CapNhatNhomCauHoiDAO a = new CapNhatNhomCauHoiDAO();
		try {
			a.CapNhatNhomCauHoi(MaNhomCauHoi, NDNhomCauTraHoi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher=this.getServletContext().getRequestDispatcher("/WEB-INF/QLNHCH_SuaNhomCauHoi.jsp");
		dispatcher.forward(request, response);
	}

}

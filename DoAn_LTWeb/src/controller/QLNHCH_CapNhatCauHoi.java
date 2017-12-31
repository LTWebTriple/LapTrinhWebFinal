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

import DAO.CapNhatCauHoiDAO;
import DAO.CapNhatCauTraloiDAO;
import DAO.LayCauTraLoiDAO;
import model.CauTraLoi;

/**
 * Servlet implementation class QLNHCH_CapNhatCauHoi
 */
@WebServlet("/QLNHCH_CapNhatCauHoi")
public class QLNHCH_CapNhatCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLNHCH_CapNhatCauHoi() {
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
		int MaCauHoi = Integer.valueOf(request.getParameter("ID"));
		String NDCauTraHoi= request.getParameter("NoiDung");
		int MaLoai = Integer.valueOf(request.getParameter("MaLoai"));
		int flag=1;
		if( NDCauTraHoi=="") {
			out.println("1");
			return;
		}
		CapNhatCauHoiDAO a = new CapNhatCauHoiDAO();
		try {
			a.CapNhatCauHoi(MaCauHoi, NDCauTraHoi,MaLoai);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

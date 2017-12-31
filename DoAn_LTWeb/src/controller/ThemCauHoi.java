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
import DAO.ThemCauHoiDAO;
import DAO.ThemCauTraLoiDAO;
import model.NoiDungCauHoi;
import model.ThemCau;


@WebServlet("/ThemCauHoi")
public class ThemCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ThemCauHoi() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");		
	     PrintWriter out = response.getWriter();
	     String NoiDung= request.getParameter("NoiDung");
	     int MaLoai= 0;
	     MaLoai = Integer.valueOf(request.getParameter("MaLoai"));	
	     int MaCauHoi;
	     if(NoiDung==null || MaLoai == 0)
	     {
	    	 out.println(1);
	     }
	     ThemCauHoiDAO a = new ThemCauHoiDAO();
	     try {
			a.ThemCauHoi(NoiDung, MaLoai);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    List<NoiDungCauHoi> DsCauHoi = new ArrayList<NoiDungCauHoi>();
	    try {
			DsCauHoi = LayCauHoiDAO.getDsCauHoi();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    int SoLuongCau = DsCauHoi.size()-1;
	    System.out.println(SoLuongCau);
	    MaCauHoi = DsCauHoi.get(SoLuongCau).getQuestionId();
	    List<ThemCau> dscauTraLoi = new ArrayList<ThemCau>();
		dscauTraLoi= (List<ThemCau>) getServletContext().getAttribute("dsCauTraLoiThemVao");
		for(ThemCau rs : dscauTraLoi )
		{
			ThemCauTraLoiDAO b = new ThemCauTraLoiDAO();
			try {
				b.ThemCauTraLoi(rs.getNoiDung(),MaCauHoi , rs.getDapAn());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		dscauTraLoi = new ArrayList<ThemCau>();
		getServletContext().setAttribute("dsCauTraLoiThemVao", dscauTraLoi);
		out.println(2);
	}

}

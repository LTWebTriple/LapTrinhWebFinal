package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;


@WebServlet("/ChuyenTrangSuaMonThi")
public class ChuyenTrangSuaMonThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ChuyenTrangSuaMonThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mamon = request.getParameter("MaMon");
		
		try {
			List<Subject> ListMonThi = (List<Subject>) getServletContext().getAttribute("ListMonThi");
			
			List<Subject> ListMonThiCanSua = new ArrayList<Subject>();
			
			for (Subject rs : ListMonThi)
			{
				if (rs.getSubId().equals(mamon))
				{
					ListMonThiCanSua.add(rs);
				}
			}
			getServletContext().setAttribute("ListMonThiCanSua", ListMonThiCanSua);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Admin_suaMonThi.jsp").forward(request, response);
		
	}
}

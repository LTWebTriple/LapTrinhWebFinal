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

import DAO.CapNhatCauTraloiDAO;
import DAO.LayCauTraLoiDAO;
import DAO.ThemCauTraLoiDAO;
import model.CauTraLoi;
import model.ThemCau;

/**
 * Servlet implementation class QLNHCH_CapNhatLaiCauTraLoi
 */
@WebServlet("/QLNHCH_CapNhatLaiCauTraLoi")
public class QLNHCH_CapNhatLaiCauTraLoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLNHCH_CapNhatLaiCauTraLoi() {
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
		int MaCauHoi = Integer.valueOf(request.getParameter("ID"));
		String NDCauTraLoi= request.getParameter("CauTraLoi");
		int DapAn = Integer.valueOf(request.getParameter("dapAn"));	
		int MaCauTraLoi = Integer.valueOf(request.getParameter("IDCauTraLoi"));
		int flag=1;
		if( NDCauTraLoi=="") {
			out.println("1");
			return;
		}
		List<CauTraLoi>  dscauTraLoi = new ArrayList<CauTraLoi>(); 
		try {
			dscauTraLoi = LayCauTraLoiDAO.getCauTraLoi(MaCauHoi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(dscauTraLoi == null)
		{		
			out.println("2");
		}
		else {
			if(DapAn==1)
			{
				for(int j=0;j<dscauTraLoi.size();j++)
				{
					if(dscauTraLoi.get(j).getIsTrue()==1 && dscauTraLoi.get(j).getAnswerId()!=(MaCauTraLoi))
					{
						out.println("3");
						return;
					}
				}
				CapNhatCauTraloiDAO a = new CapNhatCauTraloiDAO();
				try {
					a.CapNhatCauTraLoi(MaCauTraLoi, NDCauTraLoi, MaCauHoi, DapAn);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				CapNhatCauTraloiDAO a = new CapNhatCauTraloiDAO();
				try {
					a.CapNhatCauTraLoi(MaCauTraLoi, NDCauTraLoi, MaCauHoi, DapAn);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			dscauTraLoi = LayCauTraLoiDAO.getCauTraLoi(MaCauHoi);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*getServletContext().setAttribute("dsCauTraLoiThemVao", dscauTraLoi);*/
		
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

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
import DAO.ThemCauTraLoiDAO;
import model.*;


@WebServlet("/QLNHCH_CapNhatThemCauTraLoi")
public class QLNHCH_CapNhatThemCauTraLoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public QLNHCH_CapNhatThemCauTraLoi() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		int MaCauHoi = Integer.valueOf(request.getParameter("ID"));
		String NDCauTraLoi= request.getParameter("CauTraLoi");
		int DapAn= Integer.valueOf(request.getParameter("dapAn"));	
		
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
			ThemCauTraLoiDAO t = new ThemCauTraLoiDAO();
			try {
				t.ThemCauTraLoi(NDCauTraLoi, MaCauHoi, DapAn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			if(DapAn==1)
			{
				for(CauTraLoi rs : dscauTraLoi)
				{
					if(rs.getIsTrue()==1)
					{
						out.println("2");
						return;
					}
				}
				if(flag==1)
				{
					ThemCauTraLoiDAO t = new ThemCauTraLoiDAO();
					try {
						t.ThemCauTraLoi(NDCauTraLoi, MaCauHoi, DapAn);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else {
				ThemCauTraLoiDAO t = new ThemCauTraLoiDAO();
				try {
					t.ThemCauTraLoi(NDCauTraLoi, MaCauHoi, DapAn);
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

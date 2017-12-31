package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ThemCau;

@WebServlet("/QLNHCH_XoaCauTraLoi")
public class QLNHCH_XoaCauTraLoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public QLNHCH_XoaCauTraLoi() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		int STT= Integer.valueOf(request.getParameter("STT"));
			
		List<ThemCau> dscauTraLoi ;
		dscauTraLoi= (List<ThemCau>) getServletContext().getAttribute("dsCauTraLoiThemVao");
		
		dscauTraLoi.remove(STT-1);
		getServletContext().setAttribute("dsCauTraLoiThemVao", dscauTraLoi);
		int i=1;
		for(ThemCau rs : dscauTraLoi)
		{
			
			if(rs.getDapAn()==1)
			{
				out.println("<tr><td>"+i+"</td><td>"+ rs.getNoiDung() +"</td><td>"+ "True"+"</td></tr>");
			}
			else {
				out.println("<tr><td>"+i+"</td><td>"+ rs.getNoiDung() +"</td><td>"+ "False"+"</td></tr>");
			}
			i++;
			
		}
	}

}

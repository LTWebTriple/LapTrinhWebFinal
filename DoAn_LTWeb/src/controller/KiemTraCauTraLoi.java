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

@WebServlet("/KiemTraCauTraLoi")
public class KiemTraCauTraLoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public KiemTraCauTraLoi() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String CauTraLoi= request.getParameter("CauTraLoi");
		int DapAn= Integer.valueOf(request.getParameter("dapAn"));	
		
		int flag=1;
		if( CauTraLoi=="") {
			out.println("1");
			return;
		}
		List<ThemCau> dscauTraLoi ;
		dscauTraLoi= (List<ThemCau>) getServletContext().getAttribute("dsCauTraLoiThemVao");
		if(dscauTraLoi == null)
		{
			dscauTraLoi = new ArrayList<ThemCau>();
			dscauTraLoi.add(new ThemCau(CauTraLoi, DapAn));
		}
		else {
			if(DapAn==1)
			{
				for(ThemCau rs : dscauTraLoi)
				{
					if(rs.getDapAn()==1)
					{
						out.println("2");
						return;
					}
				}
				if(flag==1)
				{
					dscauTraLoi.add(new ThemCau(CauTraLoi, DapAn));
				}
			}
			else {
				dscauTraLoi.add(new ThemCau(CauTraLoi, DapAn));
			}
		}
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

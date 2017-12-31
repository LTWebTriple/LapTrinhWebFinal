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

import com.google.gson.Gson;

import DAO.LayCauHoiDAO;
import model.NoiDungCauHoi;

/**
 * Servlet implementation class LoadNoiDungCauHoi
 */
@WebServlet("/LoadNoiDungCauHoi")
public class LoadNoiDungCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadNoiDungCauHoi() {
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
		response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
		
        String IDCauHoi = (String)getServletContext().getAttribute("IDCauHoi");	
        System.out.println(IDCauHoi);
        List<NoiDungCauHoi> DsCauHoi=new ArrayList<NoiDungCauHoi>();
		try {
			DsCauHoi = LayCauHoiDAO.getDsCauHoi();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
        NoiDungCauHoi CauHoi = new NoiDungCauHoi();
        for(NoiDungCauHoi rs : DsCauHoi)
        {
        	if(rs.getQuestionId()==Integer.valueOf(IDCauHoi))
        	{
        		CauHoi = rs;
        		System.out.println("Co gia tri");
        		break;
        	}
        }
		if(IDCauHoi == null)
		{
			System.out.println("Loi");
			return;
		}
		Gson gson = new Gson();
		String objectToReturn = gson.toJson(CauHoi);
		out.write(objectToReturn);
		out.flush();
	}

}

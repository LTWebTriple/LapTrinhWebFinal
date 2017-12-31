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
import model.KindOfQuestion;
import model.NoiDungCauHoi;

/**
 * Servlet implementation class LoadNoiDungNhomCauHoi
 */
@WebServlet("/LoadNoiDungNhomCauHoi")
public class LoadNoiDungNhomCauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadNoiDungNhomCauHoi() {
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
		
        String KindId = (String)getServletContext().getAttribute("KindId");
        String KindName = (String)getServletContext().getAttribute("KindName");
        
        KindOfQuestion a = new KindOfQuestion(KindId, KindName);
        System.out.println(a.getKindId());
        System.out.println(a.getKindName());
        List<KindOfQuestion> b = new ArrayList<KindOfQuestion>();
        b.add(new KindOfQuestion(KindId, KindName));
		Gson gson = new Gson();
		String objectToReturn = gson.toJson(a);
		out.write(objectToReturn);
		out.flush();
	}

}

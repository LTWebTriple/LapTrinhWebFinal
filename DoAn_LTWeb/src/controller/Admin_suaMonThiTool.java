package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.*;
import DAO.*;


@WebServlet("/Admin_suaMonThiTool")
public class Admin_suaMonThiTool extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Admin_suaMonThiTool() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String SubjectName = request.getParameter("SubjectName");
		String SubjectId;
		
		try {
			List<Subject> ListMonThiCanSua = (List<Subject>)getServletContext().getAttribute("ListMonThiCanSua");
			
			if(ListMonThiCanSua.size() == 0)
			{
				out.println(1);
				return;
			}
			SubjectId = ListMonThiCanSua.get(0).getSubId();
			
			SuaMonThiDAO dao = new SuaMonThiDAO();
			dao.SuaMonThi(SubjectId, SubjectName);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}

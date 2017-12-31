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

@WebServlet("/Admin_suaMonThi")
public class Admin_suaMonThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Admin_suaMonThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        
		try {
			List<Subject> ListMonThiCanSua = (List<Subject>)getServletContext().getAttribute("ListMonThiCanSua");
			
			if(ListMonThiCanSua.size() == 0)
			{
				out.println(1);
				return;
			}
					
			Gson gson = new Gson();
            String objectToReturn = gson.toJson(ListMonThiCanSua);
            out.write(objectToReturn);
            out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}

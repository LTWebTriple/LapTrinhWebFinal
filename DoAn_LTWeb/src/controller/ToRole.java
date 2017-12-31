package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@WebServlet("/ToRole")
public class ToRole extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ToRole() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> user = (List<User>)getServletContext().getAttribute("Userrrrr");
		String userID = (String)getServletContext().getAttribute("userID");
		User Nguoidung = user.get(0);
		String ROLEID = Nguoidung.getRoleId();
		int Role = Integer.parseInt(ROLEID);
		if (Role == 1) {
			request.getRequestDispatcher("./WEB-INF/Admin_info.jsp").forward(request, response);// forwarding
																								// the request
		} else {
			if (Role == 2) {
				request.getRequestDispatcher("./WEB-INF/QLNHCH_info.jsp").forward(request, response);// forwarding
																										// the
																										// request
			} else {
				if (Role == 3) {
					request.getRequestDispatcher("./WEB-INF/QLDT_info.jsp").forward(request, response);// forwarding
																										// the
																										// request
				} else {
					request.getRequestDispatcher("./WEB-INF/Student_info.jsp").forward(request, response);// forwarding
																											// the
																											// request
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}

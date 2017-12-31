package controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DoiAvatarDAO;
import DAO.LoginDAO;
import model.Login;
import model.User;

@WebServlet("/DoiAvatar")
public class DoiAvatar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DoiAvatar() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json; charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String UserId = (String)getServletContext().getAttribute("userID");
		String FileHinh = request.getParameter("FileHinh");
		byte[] HinhAnh = readFile(FileHinh);

		 String realContextPath = getServletContext().getRealPath("");
		try {
			DoiAvatarDAO temp = new DoiAvatarDAO();
			temp.DoiAvatar(UserId, HinhAnh);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<User> user;
		LoginDAO loginDao = new LoginDAO();

		Login loginBean = (Login) getServletContext().getAttribute("loginBean");

		try {
			user = loginDao.authenticateUser(loginBean);
			getServletContext().setAttribute("Userrrrr", user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static byte[] readFile(String fileHinh) {
		try {
			byte[] imageInByte;
			BufferedImage originalImage = ImageIO.read(new File(fileHinh));

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try {
				ImageIO.write(originalImage, "jpg", baos);
			} catch (Exception e) {
			}

			try {
				ImageIO.write(originalImage, "png", baos);
			} catch (Exception e) {
			}

			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();
			return imageInByte;
		} catch (IOException ex) {
			return null;
		}
	}
}

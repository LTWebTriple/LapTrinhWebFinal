package controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.User;

@WebServlet("/ThongTinCaNhan")
public class ThongTinCaNhan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ThongTinCaNhan() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String realContextPath = getServletContext().getRealPath("");
		try {
			List<User> Users = (List<User>) getServletContext().getAttribute("Userrrrr");

			for (User rs : Users)
				if (rs.getAvatar() != null)
					rs.setAvatarPath(ToImage(rs.getAvatar(), rs.getUserId(), realContextPath));

			if (Users == null) {
				return;
			}
			Gson gson = new Gson();
			String objectToReturn = gson.toJson(Users);
			out.write(objectToReturn);
			out.flush();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String ToImage(byte[] imageBytes, String UserId, String realContextPath)
			throws IOException, ClassNotFoundException {
		String path = realContextPath + File.separator + "HinhAnh" + File.separator + UserId + ".jpg";
		String pathh = "HinhAnh/" + UserId + ".jpg";
		InputStream in = new ByteArrayInputStream(imageBytes);
		BufferedImage bImageFromConvert = ImageIO.read(in);
		ImageIO.write(bImageFromConvert, "jpg", new File(path));
		return pathh;
	}
}

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class LoginDAO {
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; databaseName=OnlineTest; user=user; password=123;";

	public List<User> authenticateUser(Login loginBean) throws SQLException {
		String USERID, FULLNAME, PASS, BIRTH, CMND, TEL, ROLEID;
		byte[] AVATAR = new byte[4000];
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String userName = loginBean.getUserName(); // Keeping user entered values in temporary variables.
		String userPassword = loginBean.getPassword();
		String userNameDB = "";
		String passwordDB = "";
		try {
			Class.forName(DRIVER_JDBC);
			conn = DriverManager.getConnection(URL_DB);
			System.out.println("Connected successfully ...");
		} catch (SQLException e) {
			System.out.println("Error connection " + e);
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "select Users.UserId, Users.UserName, Users.FullName, Users.Pass, Users.Birth, Users.CMND, Users.Tel, Users.Avatar, User_Roles.RoleId from Users, User_Roles Where Users.UserId = User_Roles.UserId";
		st = conn.createStatement();

		rs = st.executeQuery(sql);
		
		List<User> ThongTin = new ArrayList<User>();
		while (rs.next()) {
			userNameDB = rs.getString("UserName"); // fetch the values present in database
			passwordDB = rs.getString("Pass");
			if (userName.equals(userNameDB.trim()) && userPassword.equals(passwordDB.trim())) {
				USERID = rs.getString("UserId");
				FULLNAME = rs.getString("FullName");
				PASS = rs.getString("Pass");
				BIRTH = rs.getString("Birth");
				TEL = rs.getString("Tel");
				CMND = rs.getString("CMND");
				ROLEID = rs.getString("RoleId");
				AVATAR = rs.getBytes("Avatar");
				ThongTin.add(new User(USERID, FULLNAME, PASS, BIRTH, CMND, TEL, ROLEID, AVATAR));
			}
		}
		if(ThongTin.isEmpty())
		{
			return null;
		}
		conn.close();
		st.close();
		rs.close();

		return ThongTin;
	}
}

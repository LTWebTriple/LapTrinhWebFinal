package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class XemTaiKhoanDAO {
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; databaseName=OnlineTest; user=user; password=123;";

	public List<User> TaiKhoan() throws SQLException {
		String UserId;
		String UserName;
		String FullName;
		String Pass;
		String Birth;
		String CMND;
		String Tel;
		String RoleName;
		String SubjectName;
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER_JDBC);
			conn = DriverManager.getConnection(URL_DB);
			System.out.println("Connected successfully ...");
		} catch (Exception e) {
			System.out.println("Error connection " + e);
			return null;
		}
		String sql = "select Users.UserId, Users.UserName, Users.FullName, Users.Pass, Users.Birth, Users.CMND, Users.Tel, Roles.RoleName "
				+ "From Users, Roles, User_Roles "
				+ "Where Users.UserId = User_Roles.UserId "
				+ "and Roles.RoleId = User_Roles.RoleId";
		
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		
		List<User> TK = new ArrayList<User>();
		
		while (rs.next()) {
			UserId = rs.getString("UserId");
			UserName = rs.getString("UserName");
			FullName = rs.getString("FullName");
			Pass = rs.getString("Pass");
			Birth = rs.getString("Birth");
			CMND = rs.getString("CMND");
			Tel = rs.getString("Tel");
			RoleName = rs.getString("RoleName");
			
			TK.add(new User(UserId, UserName, FullName, Pass, Birth, CMND, Tel, RoleName));
		}
		try {
			if (conn != null) {
				conn.close();
			}
			if (st != null) {
				st.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return TK;
	}
}

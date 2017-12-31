package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoiAvatarDAO {
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123;";

	public void DoiAvatar(String UserId, byte[] HinhAnh) throws SQLException {
		Connection conn = null;
		PreparedStatement cstmt = null;

		try {
			Class.forName(DRIVER_JDBC);
			conn = DriverManager.getConnection(URL_DB);
			System.out.println("Connected successfully ...");
		} catch (SQLException e) {
			System.out.println("Error connection " + e);
            return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String sql = "{call dbo.spDoiAvatar(?,?)}";
		cstmt = conn.prepareStatement(sql);
		
		int userid = Integer.valueOf(UserId);

		cstmt.setInt(1, userid);
		cstmt.setBytes(2, HinhAnh);
		
		int temp = cstmt.executeUpdate();
	}
}

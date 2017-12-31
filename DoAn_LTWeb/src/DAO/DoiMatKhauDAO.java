package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoiMatKhauDAO {
	public int DoiMatKhau(String UserId ,String OldPass, String NewPass) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn = null;
		PreparedStatement cstmt = null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return 0;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql = "{call dbo.spDoiMatKhau(?,?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			int userid = Integer.valueOf(UserId);
			
			cstmt.setInt(1, userid);
			cstmt.setString(2, OldPass);
			cstmt.setString(3, NewPass);
			
			int temp = cstmt.executeUpdate();
			return temp;
	}
}

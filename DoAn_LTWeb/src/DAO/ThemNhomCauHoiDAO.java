package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ThemNhomCauHoiDAO {
	public void ThemNhomCauHoi(String KindName) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn=null;
		PreparedStatement cstmt=null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			int t=1;
			String sql= "{call dbo.spThemNhomCauHoi(?)}";
			cstmt=conn.prepareStatement(sql);
	
			cstmt.setString(1,KindName);
							
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}

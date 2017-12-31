package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CapNhatThongTinDAO {
	public void Capnhatthongtin(int UserId,String FullName,String Birth,String CMND,String Tel) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn = null;
		PreparedStatement cstmt = null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spCapNhatThongTinCaNhan(?,?,?,?,?)}";
			cstmt=conn.prepareStatement(sql);
	
			cstmt.setInt(1,UserId);
			cstmt.setString(2,FullName);
			cstmt.setString(3, Birth);
			cstmt.setString(4,CMND);
			cstmt.setString(5,Tel);
			
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}

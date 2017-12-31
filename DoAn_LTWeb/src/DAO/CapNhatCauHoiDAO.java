package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CapNhatCauHoiDAO {
	public void CapNhatCauHoi(int QuestionId,String QuestionContent, int KindID) throws SQLException {
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
			
			String sql= "{call dbo.spCapNhatCauHoi(?,?,?)}";
			cstmt=conn.prepareStatement(sql);
	
			cstmt.setInt(1,QuestionId);
			cstmt.setString(2,QuestionContent);	
			cstmt.setInt(3,KindID);
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}

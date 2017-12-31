package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CapNhatCauTraloiDAO {
	public void CapNhatCauTraLoi(int AnswerId,String AnswerContent, int QuestionId, int IsTrue) throws SQLException {
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
			String sql= "{call dbo.spCapNhatCauTraLoi(?,?,?,?)}";
			cstmt=conn.prepareStatement(sql);
	
			cstmt.setInt(1,AnswerId);
			cstmt.setString(2,AnswerContent);
			cstmt.setInt(3,QuestionId);		
			cstmt.setInt(4,IsTrue);	
			int temp = cstmt.executeUpdate();
			
			cstmt.close();
			conn.close();
	}
}

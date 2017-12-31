package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LuuKetQuaLamBaiDAO {
	public int LuuKetQuaLamBai(int True_Answer, int Answer_Size, int TestId, int UserId, int SubjectId) throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn=null;
		PreparedStatement cstmt=null;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return 0;
	        } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spLuuKetQuaLamBai(?,?,?,?,?)}";
			cstmt=conn.prepareStatement(sql);
			
			cstmt.setInt(1, True_Answer);
			cstmt.setInt(2, Answer_Size);
			cstmt.setInt(3, TestId);
			cstmt.setInt(4, UserId);
			cstmt.setInt(5, SubjectId);
			
			int temp = cstmt.executeUpdate();
			return temp;
	}
}

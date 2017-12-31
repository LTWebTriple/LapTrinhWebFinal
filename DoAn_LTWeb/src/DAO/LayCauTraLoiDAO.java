package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CauTraLoi;

public class LayCauTraLoiDAO {
	public static List<CauTraLoi> getCauTraLoi(int qid) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest;user=user;password=123";
		Connection conn=null;
		CallableStatement cstmt=null;
		int AnswerId, QuestionId, IsTrue;
		String AnswerContent;
		
		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 conn=DriverManager.getConnection(dbURL);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return null;
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sql= "{call dbo.spCauTraLoi(?)}";
			cstmt=conn.prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			cstmt.setInt(1, qid);
			
			ResultSet kq=cstmt.executeQuery();
			
			List<CauTraLoi> dsCauTraLoi= new ArrayList<CauTraLoi>();
			while(kq.next()) {
				AnswerId = kq.getInt("AnswerId");
				AnswerContent = kq.getString("AnswerContent");
				QuestionId = kq.getInt("QuestionId");
				IsTrue = kq.getInt("IsTrue");
				dsCauTraLoi.add(new CauTraLoi(AnswerId, AnswerContent, QuestionId, IsTrue));
			}			
			
			kq.close();
			cstmt.close();
			conn.close();
			
			return dsCauTraLoi; 
	}
}

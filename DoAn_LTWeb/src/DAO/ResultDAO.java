package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Result;

public class ResultDAO {
	public static List<Result> getResult(String UserId) throws SQLException
	{
		String dbURL = "jdbc:sqlserver://localhost:1433;" +  
		         "databaseName=BanMyPham;integratedSecurity=true";  

		      // Declare the JDBC objects.  
		      Connection conn = null;  
		      Statement st	 = null;  
		      ResultSet rs = null;  
		      String url = "jdbc:sqlserver://localhost:1433;databaseName=OnlineTest";
		      String user = "user";
		      String password = "123";
		      String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		      String ResultId,Point,SubjectId,SubjectName;
		  	  
		try {
			 Class.forName(driverClass);
			 conn=DriverManager.getConnection(url,user,password);
	        }catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return null;
	        } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			String sql= "select * from Result_Test,Subjects Where Result_Test.SubjectId = Subjects.SubjectId AND Result_Test.UserId = "+ UserId;
			 st = conn.createStatement();

			 rs = st.executeQuery(sql);
			
			List<Result> dsResult= new ArrayList<Result>();
			while(rs.next()) {
				
				ResultId = rs.getString("ResultId");
				Point = rs.getString("Point");
				SubjectId = rs.getString("SubjectId");
				SubjectName = rs.getString("SubjectName");				
				dsResult.add(new Result(ResultId, UserId, Point, SubjectId, SubjectName));
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
			
			return dsResult; 
	}
}

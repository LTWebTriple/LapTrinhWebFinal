package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class KindOfQuestionDAO {
	private static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL_DB = "jdbc:sqlserver://localhost:1433; instance=MSSQLSERVER; databaseName=OnlineTest; user=user; password=123;";

	public static List<KindOfQuestion> getKindOfQuestion() throws SQLException {
		String kindId;
		String kindName;
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
		String sql = "select * From KindOfQuestion";
		st = conn.createStatement();

		rs = st.executeQuery(sql);
		List<KindOfQuestion> LoaiCauHoi = new ArrayList<KindOfQuestion>();
		while (rs.next()) {
				kindId = rs.getString("KindId");
				kindName = rs.getString("KindName");
				LoaiCauHoi.add(new KindOfQuestion(kindId, kindName));
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
		return LoaiCauHoi;
	}
}

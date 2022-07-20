package example;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Chapter15_03 {

	// 以下のプロシージャを登録しておく
	//	CREATE PROCEDURE ProcedureLanguage(IN i INT)
	//	BEGIN
	//	SELECT * FROM Language WHERE ID = i;
	//	END
	public static void main(String[] args) {
		String procedure = "{call ProcedureLanguage(?)}";
		String url = "jdbc:mysql://localhost:3306/demodb?"
				+ "allowPublicKeyRetrieval=true"
				+ "&useSSL=false"
				+ "&serverTimezone=JST";
			try (Connection con = DriverManager.getConnection(url, "demouser", "demouser&pass01");
					CallableStatement clsmt = con.prepareCall(procedure);){
				clsmt.setInt(1, 1);
				clsmt.executeQuery();
				print(clsmt.getResultSet());
				System.out.println();
			} catch (SQLException e) {
				e. printStackTrace();
			}
	}

	public static void print(ResultSet rs) throws SQLException {
		while(rs.next()){
			System.out.print("ID=" + rs.getInt(1));
			System.out.print(",");
			System.out.print("MSG=" + rs.getString(2));
			System.out.println();
		}
	}
}

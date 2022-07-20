package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Chapter15_01 {

	public static void main(String[] args) {
		// データベースの指定
		String url = "jdbc:mysql://localhost:3306/demodb?"
				+ "allowPublicKeyRetrieval=true"
				+ "&useSSL=false"
				+ "&serverTimezone=JST";
		try (Connection con = DriverManager.getConnection(url, "demouser", "demouser&pass01");){

		} catch (SQLException e) {
			e. printStackTrace();
		}
	}

}

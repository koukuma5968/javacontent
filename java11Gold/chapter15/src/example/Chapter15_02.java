package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Chapter15_02 {

	public static void main(String[] args) {
		String selsql = "SELECT * FROM Language";
		String inssql = "INSERT INTO Language (MSG) VALUES ('jdbc')";
		String url = "jdbc:mysql://localhost:3306/demodb?"
				+ "allowPublicKeyRetrieval=true"
				+ "&useSSL=false"
				+ "&serverTimezone=JST";
			try (Connection con = DriverManager.getConnection(url, "demouser", "demouser&pass01");
					PreparedStatement pstmt = con.prepareStatement(selsql);){
				try (ResultSet rs =  pstmt.executeQuery();) {
					print(rs);
				}
				pstmt.executeUpdate(inssql);
				System.out.println();
				try (ResultSet rs =  pstmt.executeQuery();) {
					print(rs);
				}
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

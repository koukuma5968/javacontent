package problem.code.no03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Chap15_no03_A {
	public static void main(String[] args) {
		var sql = "select count(id) from smp where id < ?";
		try (Connection con = DriverManager.getConnection(
				"jdbc:derby://localhost:1527/data/Sample");
				var ps = con.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

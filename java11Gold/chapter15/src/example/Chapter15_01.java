package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Chapter15_01 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT dept_ code, dept_ name FROM department";
			try {
				// ②データベースの指定
				String url = "jdbc: mysql://localhost:3306/golddb?"
						+ "verifyServerCertificate=false"
						+ "&useSSL=false"
						+ "&serverTimezone=JST";
				con = DriverManager. getConnection( url, "root", "training");
				pstmt = con. prepareStatement( sql);
				// ⑤SQL文の実行
				rs = pstmt. executeQuery();
				// ⑥ 結果の取得と処理
				while( rs. next()){
					System. out. println(" dept_ code : " + rs. getInt( 1));
					System. out. println(" dept_ name : " + rs. getString( 2));
				}
			} catch (SQLException e) {
				e. printStackTrace();
				// ⑦接続のクローズ
			} finally {
				try {
					if( rs != null) rs. close();
					if( pstmt != null) pstmt. close();
					if( con != null) con. close();
				} catch (SQLException e) {
					e. printStackTrace();
				}
			}

	}

}

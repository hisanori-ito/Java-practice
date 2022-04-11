package Exception;

import java.sql.SQLException;

public class Exception5 {
	public static void main(String[] args) {
		
		try {
			int array[] = { 1, 2, 3 };
			Exception5.vaildIndex(array, 2);
			Exception5.vaildIndex(array, 3);
			
			System.out.println("vaildIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}
		
		try {
			Exception5.throwSQLException();
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		} finally {
			System.out.println("throwSQLExceptionの呼び出し終了");
		}
		
		System.out.println("mainメソッド終了");
	}
	
	public static void vaildIndex(int[] array, int index) {
		if (array.length <= index) {
			throw new IllegalArgumentException(index + " はサイズの範囲外です"); 
		}
		System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}

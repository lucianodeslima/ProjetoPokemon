package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection getConexao() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pokemon?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=America/Sao_Paulo",
					"root", "");

		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
}

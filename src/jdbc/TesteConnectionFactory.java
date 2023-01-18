package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConnectionFactory {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = ConnectionFactory.getConnection();
		Statement stmt = conexao.createStatement();
		
		stmt.execute("DROP DATABASE IF EXISTS just_test");
		
		System.out.println("Banco dropado");
		conexao.close();
	}
}

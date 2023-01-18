package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		// Ao não especificar a porta, assume-se a porta padrão do mysql: 3306
		// Se o banco estiver rodando em outra porta, posso especificar
		// Ex.: jdbc:mysql://localhost:3307
		final String stringDeConexao = 
				"jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "";

		Connection conexao = DriverManager
				.getConnection(stringDeConexao, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso");
		conexao.close();
	}
}

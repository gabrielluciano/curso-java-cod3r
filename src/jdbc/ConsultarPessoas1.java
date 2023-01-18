package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = conexao.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String nome = rs.getString("nome"); 
			pessoas.add(new Pessoa(id, nome));
		}
		
		pessoas.stream().forEach(System.out::println);
		
		stmt.close();
		conexao.close();
	}
}

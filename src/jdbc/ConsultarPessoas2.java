package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome da pessoa: ");
		String nome = sc.nextLine();
		
		sc.close();
		
		Connection conexao = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + nome + "%");
		ResultSet rs = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(rs.next()) {
			pessoas.add(new Pessoa(
				rs.getInt("id"),
				rs.getString("nome")
			));
		}
		
		pessoas.stream().forEach(System.out::println);
		
		stmt.close();
		conexao.close();
	}
}

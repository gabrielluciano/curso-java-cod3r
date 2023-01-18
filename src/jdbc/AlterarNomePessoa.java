package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		
		final String select = "SELECT id, nome FROM pessoas WHERE id = ?";
		final String update = "UPDATE pessoas SET nome = ? WHERE id = ?";
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o id da pessoa: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		Connection conexao = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			Pessoa p = new Pessoa(rs.getInt(1), rs.getString(2));
			System.out.println(p);
			
			System.out.print("Digite o novo nome: ");
			String novoNome = sc.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);
			stmt.execute();
			
			System.out.println("Nome alterado com sucesso");
		} else {
			System.out.println("Pessoa não encontrada");
		}
		
		stmt.close();
		conexao.close();
		sc.close();
	}
}

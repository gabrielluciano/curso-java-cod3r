package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o id: ");
		int id = sc.nextInt();
		
		Connection conexao = ConnectionFactory.getConnection();
		String sql = "DELETE FROM pessoas WHERE id = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		if (stmt.executeUpdate() > 0) {
			System.out.println("Usuário excluído com sucesso");
		} else {
			System.out.println("Não foi possível excluir o usuário");
		};
		
		stmt.close();
		conexao.close();
		sc.close();
	}
}

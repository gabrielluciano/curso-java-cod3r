package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Micaela"));
		System.out.println(dao.incluir(sql, "Joana D'Arc"));
		System.out.println(dao.incluir(sql, "Marcelo Pereira"));
		
		sql = "INSERT INTO pessoas (id, nome) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, 100, "Zeca Almada")); // Possivel repetição de chave
		
		dao.close();
	}
}

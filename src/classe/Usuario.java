package classe;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			
			return outro.nome.equals(nome)
					&& outro.email.equals(email);
		}
		
		return false;
	}
		
	// O hashcode será abordado em outra aula
	
	@Override
	public int hashCode() {
		return this.nome.length();
	}
	
	// Equals e HashCode gerados pelo Eclipse
//	@Override
//	public int hashCode() {
//		return Objects.hash(email, nome);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Usuario other = (Usuario) obj;
//		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
//	}
}

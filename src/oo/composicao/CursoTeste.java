package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Gabriel");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Julia");
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Banco de Dados MySQL");
		Curso c3 = new Curso("React");
		
		c1.adicionarAluno(aluno1);
		c1.adicionarAluno(aluno2);
		
		c2.adicionarAluno(aluno1);
		c2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(c3);
		aluno2.adicionarCurso(c3);
		aluno3.adicionarCurso(c3);
		
		System.out.println("Curso " + c1.nome + ": \n" + c1.alunos);
		System.out.println("Curso " + c2.nome + ": \n" + c2.alunos);
		System.out.println("Curso " + c3.nome + ": \n" + c3.alunos);
		
		System.out.println();
		System.out.println(aluno1.cursos.get(0).alunos.get(1).cursos.get(1).nome);
		
		System.out.println(aluno2.obterCursoPorNome("Banco de Dados MySQL"));
		System.out.println(aluno2.obterCursoPorNome("Java"));
	}
}

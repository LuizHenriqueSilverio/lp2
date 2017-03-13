import java.util.ArrayList;
public class Principal{
	public static void main(String[] args){
		ArrayList<Aluno>alunos = new ArrayList<Aluno>();
		ArrayList<Nota>notas = new ArrayList<Nota>();
		ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
		
		Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();

		Nota nota1 = new Nota();
		Nota nota2 = new Nota();
		Nota nota3 = new Nota();
		Nota nota4 = new Nota();
		Nota nota5 = new Nota();
		Nota nota6 = new Nota();
		Nota nota7 = new Nota();
		Nota nota8 = new Nota();
		Nota nota9 = new Nota();
		Nota nota10 = new Nota();


		Aluno aluno1 = new Aluno();
		aluno1.setAluno("Luiz Henrique", 17);
		alunos.add(aluno1);
		Aluno aluno2 = new Aluno();
		aluno2.setAluno("Gabriel Monteiro", 16);
		alunos.add(aluno2);
		Aluno aluno3 = new Aluno();
		aluno3.setAluno("Elyas Correa", 18);
		alunos.add(aluno3);
		Aluno aluno4 = new Aluno();
		aluno4.setAluno("Wagner Aristides", 13);
		alunos.add(aluno4);
		Aluno aluno5 = new Aluno();
		aluno5.setAluno("Jailson Mendes", 30);
		alunos.add(aluno5);
		Collection.sort(alunos);

		nota1.setNota(7.0, aluno1, disciplina1);
		nota2.setNota(7.4, aluno1, disciplina2);
		nota3.setNota(10.0, aluno2, disciplina1);
		nota4.setNota(10.0, aluno2, disciplina2);
		nota5.setNota(7.2, aluno3, disciplina1);
		nota6.setNota(3.5, aluno3, disciplina2);
		nota7.setNota(0.7, aluno4, disciplina1);
		nota8.setNota(2.0, aluno4, disciplina2);
		nota9.setNota(10.0, aluno5, disciplina1);
		nota10.setNota(9.5, aluno5, disciplina2);

		for(int i = 0;i < alunos.size(); i++){
			System.out.println(Aluno.get(i).getNome() + " - " + Aluno.get(i).getIdade());
		}
		
		
	}
}

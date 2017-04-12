public class Aluno implements Comparable{
	private String nome;
	private int idade;

	public void setAluno(String x, int y){
		this.nome = x;
		this.idade = y;
	}
	public String getName(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}

	public int compareTo(Aluno comparesTo){
		int compareidade=((Aluno)compareTo).getIdade();
		return this.idade-compareidade;
	}
}

	class No{
		private:		
			int x;
			No prox;
			No ant;
			No cabeca;
			No fim;
			int cont = 0;
		public:
			void InserirInt(int y){
				this.x = y;
			}
			void LigarProx(No proximo){
				this.prox = proximo;
			}
			void LigarAnt(No anterior){
				this.ant = anterior;
			}	
	}
public class Lista{
	public:	
		void Inserir(){
			No novo = new No();
			if(ant = null){
				cabeca = novo;
				fim = novo;
				novo.InserirInt(x);
				cont = cont+1;
			}
			
															
		}
			
}

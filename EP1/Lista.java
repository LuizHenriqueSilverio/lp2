	class No{
		private:		
			int num;
			No prox;
			No ant;
			No cabeca;
			No fim;
		public:
			void InserirInt(int x){
				this.num = y;
			}
			void LigarProx(No proximo){
				this.prox = proximo;
			}
			void LigarAnt(No anterior){
				this.ant = anterior;
			}
			void RetornarFim(){
				return fim;
			}
	}
public class Lista{
	public:	
		void Inserir(int x){
			No novo = new No();
			if(cabeca = null){
				cabeca = novo;
				fim = novo;
				novo.InserirInt(x);
			}
			if(cabeca != null){
				novo.InserirInt(x);
				novo.LigarAnt(No.RetornarFim());
				novo.ant.prox = LigarProx(novo);
				novo = fim;
			}
		}
		bool Pesquisar(int y){
			No cursor = cabeca;
			while(prox != null){
				if(cursor.num == y){
					System.out.println("Número encontrado!");
					return true;
				}else{
					cursor = cursor.prox;
				}
			}
			System.out.println("Número não encontrado.");
			return false;
		}	
		void Remover(int x){
			if(Lista.Pesquisar(x) == false){
				System.out.println("Não existe este número na Lista!");
				break;
			}
			No cursor = cabeca;
			if(cursor.x = cabeca){
				No aux = cursor.prox;
				aux = cabeca;
				delete[] cursor;
				break;
			}
			while(prox != null){
				if(cursor.num = x){
					No aux1 = cursor.ant;
					No aux2 = cursor.prox;
					aux1.LigarProx(aux2);
					aux2.LigarAnt(aux1);
					break;
				}
				cursor = cursor.prox;
			}
			No aux = cursor.ant;
			aux = fim;
			delete[] cursor;
		}		
															
		}
			
}

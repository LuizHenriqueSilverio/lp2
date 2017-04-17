public class ProgramaException2{
	
	public static void teste(){
	
		int[] vetor1 = new int[5];

		try{
			vetor1[6] = 10;
		}
		catch(Exception e){
			throw new NullPointerException();
		}

	}

	public static void main(String [] args){

		try{
			teste();
		}
		catch(NullPointerException e){
			System.out.println("Ocorreu um erro no sistema.");
		}


	}

}

public class Singleton{
	private static Singleton instanciaUnica;
	private Singleton(){
	}
	public static Singleton getInstance(){
		if(instanciaUnica == null){
			instanciaUnica = new Singleton();
		}
		return instanciaUnica;
	}
}

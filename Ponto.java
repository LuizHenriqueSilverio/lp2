public class Ponto{
	private double x, y;
	public Ponto(){
		System.out.println("Construtor 1 - "+ this);
	}
	public Ponto(double x, double y){
		System.out.println("Construtor 2");
		this.x = x;
		this.y = y;
		System.out.println("X: "+ this.x +" - Y: " + this.y);
	}
	public void setX(double x){
		this.x = x;
	}
	public double getX(){
		return x;
	}
        public void setY(double y){
                this.y = y;
        }
        public double getY(){
                return y;
        }
	public static void main(String[] args){
		System.out.println("Luiz Henrique");
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		Ponto p4 = new Ponto(4.0 , 2.0);
		p1.setX(0);
		p1.setY(0);
		p2.setX(1);
		p2.setY(1);
		double distY = p1.getY() - p2.getY();
		double distX = p1.getX() - p2.getX();
		distX = Math.pow(distX, 2);
		distY = Math.pow(distY, 2);
		double diagonal = distX + distY;
		System.out.println(Math.sqrt(diagonal));
	}
}


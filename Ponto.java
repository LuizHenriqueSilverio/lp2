public class Ponto{
	private double x, y;
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
		p1.setX(50);
		p1.setY(40);
		p2.setX(30);
		p2.setY(20);
		double distY = p1.getY() - p2.getY();
		double distX = p1.getX() - p2.getX();
		distX = Math.pow(distX, 2);
		distY = Math.pow(distY, 2);
		double diagonal = distX + distY;
		System.out.println(Math.sqrt(diagonal));
	}
}


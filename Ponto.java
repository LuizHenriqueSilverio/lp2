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
		p1.setX(10);
		p1.setY(20);
		p1.getX();
		p1.getY();
		p2.setX(30);
		p2.setY(40);
		p2.getX();
		p2.getY();
		Ponto p3 = new Ponto();
		p3.x = 50; p3.y = 70;
		p3 = p1;
		System.out.println(p3.x+ "-" +p3.y);
		Ponto p4 = p3;
	}
}


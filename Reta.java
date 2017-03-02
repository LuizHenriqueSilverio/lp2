public class Reta{
	private Ponto p1, p2;
	public void setP1(Ponto p){
		this.p1 = p;
	}
	public Ponto getP1(){
		return this.p1;
	}
	public void setP2(Ponto p){
		this.p2 = p;
	}
	public Ponto getP2(){
		return this.p2;
	}
}

	public double sobarea(){
	double x1, x2, y1, y2;
	x1 = this.getP1().getX();
	x2 = this.getP2().getX();
	y1 = this.getP1().getY();
	y2 = this.getP2().getY();
	double a1, a2, x3, y3;
	x3 = (x1-x2);
	x3 = Math.abs(x3);
	y3 = (y1-y2);
	y3 = Math.abs(y3);
	a1 = (x3*y3)/2;
	if(y1>y2)
		a2 = x3*y2;
	else
		a2 = x3*y1;
		double a3 = a1+a2;
		return a3;
	}

abstract public class Shape implements Drawable {
	private double x;
	private double y;
	private double p;
	private double q;
	
	public double area;
	public double length;
	
	//public void setx(int x) {this.setX(x);}
	//public void sety(int y) {this.setY(y);}
	//public void setp(int p) {this.setP(p);}
	//public void setq(int q) {this.setQ(q);}
	
	public double getArea() {return area;}
	public double getLength() {return length;}
	//public void draw(){}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public double getQ() {
		return q;
	}
	public void setQ(double q) {
		this.q = q;
	}
	
}

class Rectangle extends Shape {
	
	public Rectangle(int x, int y, int p, int q) {
		// TODO Auto-generated constructor stub
		setX(x);
		setY(y);
		setP(p);
		setQ(q);
		area = (double)((p-x) * (q-y));
		length = (double)((p-x)*2 + (q-y)*2);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.printf("Rectangle (%.1f\n, %.1f\n)-(%.1f\n, %.1f\n)", getX(),getY(),getP(),getQ());
	}

}

class Circle extends Shape {

	public Circle(int x, int y, int p) {
		// TODO Auto-generated constructor stub
		setX(x);
		setY(y);
		setP(p);
		area = (p*p) * Math.PI;
		length = (2*p) * Math.PI;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf("Circle center (%.1f\n, %.1f\n)-radius(%.1f\n)", getX(),getY(),getP());
	}

}
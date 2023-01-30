package entites;

public class Triangle {
	public double a, b, c, p, area;
	
	
	
	public void printArea() {
		System.out.printf("O valor da área é %.4f%n", this.area);
	}
	
	public double calcP () {
		
		return (this.a + this.b + this.c) / 2.0;
		
	}
	
	public double calcArea() {
		return Math.sqrt(this.p * (this.p - this.a) * (this.p - this.b) * (this.p - this.c));
	}
	 
	
	
	
}

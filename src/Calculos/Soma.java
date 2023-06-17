package Calculos;

public class Soma {
	private double a;
	private double b;
	private double resul;
	public void soma (double a, double b, double resul) {
		this.setA(a);
		this.setB(b);
		this.setResul(resul);
		
		
		
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getResul() {
		System.out.println("Resultado da soma: " + (a + b));
		return resul;
	}
	public void setResul(double resul) {
		this.resul = a+b;
	}

}

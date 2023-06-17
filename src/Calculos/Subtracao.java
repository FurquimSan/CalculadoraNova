package Calculos;

public class Subtracao {
	private double a;
	private double b;
	private double resul;
	public void subtracao (double a, double b, double resul) {
		this.a = a;
		this.b = b;
		this.resul = resul;
		
	}
	public double getResul() {
		System.out.println("a subtração é: " + (a-b));
		return resul;
	}
	public void setResul(double resul) {
		this.resul = resul;
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

}

package Calculos;

public class Multiplicacao {
	private double a;
	private double b;
	private double resul;
	public void multi(double a, double b, double resul) {
		
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
		System.out.println("A multiplicação é: " + (a * b));
		return resul;
	}
	public void setResul(double resul) {
		this.resul = resul;
	}

}

package Calculos;

public class Divisao {
	private double a;
	private double b;
	private double resul;
	public void divisao (double a, double b, double resul) {
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
		System.out.println("O resultado da devisao é: " + (a/b));
		return resul;
	}
	public void setResul(double resul) {
		this.resul = resul;
	}

}

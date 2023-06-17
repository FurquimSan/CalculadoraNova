package Pincipal;

import java.util.Scanner;

import Calculos.Divisao;
import Calculos.Multiplicacao;
import Calculos.Soma;
import Calculos.Subtracao;

public class Principal {

	public static void main(String[] args) {
		int dec;
		System.out.println("Escolha a opração\n 1: soma\n 2: Subtracao\n 3: Divisao\n 4: Multiplicacao\n");
		Scanner leitorNum = new Scanner (System.in);
		dec = leitorNum.nextInt();
		
		//Soma
		if  (dec == 1) {
		Soma soma1 = new Soma();
		System.out.println("Digite um numero: ");
		double a;
		a = leitorNum.nextDouble();
		soma1.setA(a);
		System.out.println("Digite outro numero: ");
		double b;
		b = leitorNum.nextDouble();
		soma1.setB(b);
		soma1.getResul();
		}
		//Subtração
		if  (dec == 2) {
			Subtracao sub1 = new Subtracao();
			System.out.println("Digite um numero: ");
			double a;
			a = leitorNum.nextDouble();
			sub1.setA(a);
			System.out.println("Digite outro numero: ");
			double b;
			b = leitorNum.nextDouble();
			sub1.setB(b);
			sub1.getResul();
		}
		//Divisao
		if (dec == 3) {
			Divisao divisao = new Divisao();
			System.out.println("Digite um numero: ");
			double a;
			a = leitorNum.nextDouble();
			divisao.setA(a);
			System.out.println("Digite outro numero: ");
			double b;
			b = leitorNum.nextDouble();
			divisao.setB(b);
			divisao.getResul();
		}
		//Multiplicação
		if (dec  == 4) {
			Multiplicacao multiplicacao = new Multiplicacao();
			System.out.println("Digite um numero: ");
			double a;
			a = leitorNum.nextDouble();
			multiplicacao.setA(a);
			System.out.println("Digite outro numero: ");
			double b;
			b = leitorNum.nextDouble();
			multiplicacao.setB(b);
			multiplicacao.getResul();
		}
		else {
			System.out.println("Escolha invalida");
		}
		

	}

}

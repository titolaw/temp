package application;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria jose = new ContaBancaria("Jose", 001, 2000);
		
		System.out.println(jose.getSaldo());
		jose.sacar(300);
		System.out.println(jose.getSaldo());
		jose.depositar(2000);
		System.out.println(jose.getSaldo());
		
		ContaEspecial ana = new ContaEspecial("Ana", 002, 2500);
		ana.setLimite(300);
		ana.sacar(2790);
		System.out.println(ana.getSaldo());
		
		System.out.println();
	}

}

package br.com.erickfreire.diametrocircunferenciaareadeumcirculo;

import java.util.Scanner;

/**
 * Crie um programa em Java que calcula o diametro, circunferencia e área de um circulo.
 * @author Erick Freire
 * @version 1 - Criado em 27-03-2021 as 22:59
 */

public class DiametroCircunferenciaAreaDeUmCirculo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double raio;
		
		System.out.print("Digite o valor do raio: ");
		raio = entrada.nextDouble();
		
		System.out.printf("O valor do diametro: %.2f%n", (2 * raio));
		System.out.printf("O valor da circunferencia é: %.2f%n",(2 * Math.PI * raio));
		System.out.printf("O valor da área é: %.2f%n", (Math.PI * Math.pow(raio, 2)));
	}

}

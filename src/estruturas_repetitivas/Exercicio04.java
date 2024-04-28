package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		//exemplo.
		
		Scanner sc = new Scanner(System.in);
		int codigo;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Informe o código do produto de sua preferência: ");
		System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
		codigo = sc.nextInt();
		
		while (codigo != 4) {
			switch (codigo) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
			
			codigo = sc.nextInt();
			
		}
		
		
		System.out.println("Muito Obrigado!");
		System.out.printf("Álcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		
		sc.close();

	}

}

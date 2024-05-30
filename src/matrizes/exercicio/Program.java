package matrizes.exercicio;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para N");
		int n = sc.nextInt();
		
		System.out.println("Digite um valor para M");
		int m = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * 10);
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Digite um valor de 0 a 10:");
		int x = sc.nextInt();
		
		int linha = 0;
		int coluna = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					linha = i;
					coluna = j;
					System.out.println("Position (" + linha + "," + coluna + ")");
					if (j > 0) {
						System.out.println("Left: " + mat[linha][coluna - 1]);						
					}
					if (i > 0) {
						System.out.println("Top: " + mat[linha -1][coluna]);
					}
					if (j < mat[i].length -1) {
						System.out.println("Right: " + mat[linha][coluna + 1]);
					}
					if (i < mat.length - 1) {
						
						System.out.println("Down: " + mat[linha +1][coluna]);
					}
				}
			}
		}
		
		
		sc.close();
	}

}

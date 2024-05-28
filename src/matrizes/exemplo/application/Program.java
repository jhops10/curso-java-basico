package matrizes.exemplo.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com o tamanho da sua matriz");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal: ");
		for(int i = 0; i < n ; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}

}

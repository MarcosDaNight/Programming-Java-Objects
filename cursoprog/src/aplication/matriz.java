package aplication;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/** Matrix sinze using a varible integer*/
	
		int n = sc.nextInt();
		int[][] mat = new int[n][n];//variable useful for matrix
		
	/**
	 * Loops used for construct the matrix elements
	 */
		for (int i=0; i < n; i++) {//Loop for matrix lines
			for (int j=0; j < n ; j++) {//Loop for matrix columns
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		/**
		 * Access the main diagonal
		 */
		System.out.println("Main diagonal:");
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		/**
		 * Show quantity of negatives elements in matrix
		 */
		int cc = 0;
		for (int i=0; i < n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					cc += 1;
				}
			}
		}
		System.out.println("The quantity of negative numbers is: "+ cc);
		
		sc.close();

	}

}

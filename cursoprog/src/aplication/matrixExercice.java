package aplication;

import java.util.Scanner;

public class matrixExercice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the matrix number of Lines and Columns:");
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println();
		int[][] mat = new int[l][c];
		
		System.out.println("Enter the matrix elements number:");
		
		for(int i =0; i<l; i++) {
			for (int j=0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("Enter the number you want: ");
		int num = sc.nextInt();
		System.out.println();
		
		
		for(int i =0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
				}
			}
		}
		sc.close();
		
		
	}

}

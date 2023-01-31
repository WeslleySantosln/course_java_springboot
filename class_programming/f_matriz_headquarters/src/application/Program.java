package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int s = 0;
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int l = 0 ; l < mat.length; l++) {
			for(int c = 0 ; c < mat[l].length ; c++ ) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		 
		for(int l = 0 ; l < mat.length; l++) {
			
				System.out.print(mat[l][l] + ", ");
			
		}
		
		for(int l = 0 ; l < mat.length; l++) {
			
			for(int c = 0 ; c < mat[l].length; c++) {
				
				if(mat[l][c] < 0) {
					s += 1;
				}
				
			}
	    }
		
		System.out.print("Total negative numbers: " + s);
		
		
		
		sc.close();
		
		
	}

}

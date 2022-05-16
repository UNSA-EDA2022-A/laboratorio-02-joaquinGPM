package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				n = sc.nextInt();
				a[i] = n;
			}

			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSumaExt(a, suma));
		}
	}

	public boolean esSubconjuntoSumaExt(int a[], int suma) {
		if(a == null){
	            return false;
	        }
	        int n = a.length; 
	        boolean[][] m = new boolean[n + 1][suma + 1]; 
	        for(int s = 0; s <= suma; s++){
	            m[0][s] = false;
	        }
	        
	        for(int i = 1; i <= n; i++){

	            for(int s = 0; s <= suma; s++){    
	                if(s - a[i-1] >= 0){ 
	                    m[i][s] = (m[i-1][s] || a[i-1] == s || m[i-1][s - a[i-1]]); 
	                } else {
	                    m[i][s] = (m[i-1][s] || a[i-1] == s);
	                }       

	            }
	            }   	 
	        return m[n][suma];

		
	}
}

package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		double num;
        double sum=0,r;
        sum = Math.sqrt(teclado);
        num=teclado;
        sum = Math.round(num);
        r = Math.pow(sum,2);
     
        if(r ==num)
        {
           if(sum*sum == num)
           {
              return true;
           }
        }
        else
        {
           return false;
        }
		return false;
     }

		
	
}

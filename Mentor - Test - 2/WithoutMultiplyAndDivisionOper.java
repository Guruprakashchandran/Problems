package com.tasks;

import java.util.Scanner;

public class WithoutMultiplyAndDivisionOper {

	public static void main(String[] args) {
		
		new WithoutMultiplyAndDivisionOper().operation();
	}

	private void operation() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = scan.nextInt();
		int sol1 = 0;
		for(int i = 0;i<15;++i) {
			
			sol1 += number;
		}
		System.out.println("Solution - "+sol1);
		double sol2 = 0;
		System.out.print("Enter Even Number : ");
		number = scan.nextInt();
		for(int i = 0;i<number;++i) {
			
			sol2 += 7.5;
		}
		System.out.println("Solution - "+sol2);
		System.out.print("Enter Number : ");
		sol2 = 0;
		number = scan.nextInt();
		for(int i = 0;i<15;++i) {
			
			sol2 += number;
		}
		int count  = 0;
		while(sol2>=16) {
			
			count++;
			sol2 -= 16;
		}
		System.out.println("Answer - "+count);
		System.out.println("Remainder - "+sol2);
		scan.close();
	}
}

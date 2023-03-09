package com.tasks;

import java.util.Scanner;

public class StringImmutable {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Input : ");
		String s = scan.next();
		s.substring(0,s.length()-1) = "guru";		//it subString cant changable.
		s.charAt(i) = "g";							//it cant change single character.
		s = "abi";									//it change only reference.
		scan.close();
	}
}

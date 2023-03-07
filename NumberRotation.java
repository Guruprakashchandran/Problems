package com.tasks;

import java.util.*;

public class NumberRotation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = scan.nextInt();
		new NumberRotation().findNumberRotation(number);
	}

	private void findNumberRotation(int number) {

		String s = Integer.toString(number);
		int st = 0, end = s.length() - 1;
		boolean isNotStrobogrammetic = false;
		while (st < end) {

			if (s.charAt(st) == '0' || s.charAt(st) == '1' || s.charAt(st) == '6' || s.charAt(st) == '8'
					|| s.charAt(st) == '9') {

				if ((s.charAt(st) == '0' && s.charAt(end) == '0') || (s.charAt(st) == '1' && s.charAt(st) == '1')
						|| (s.charAt(st) == '6' && s.charAt(end) == '9')
						|| (s.charAt(st) == '8' && s.charAt(end) == '8')
						|| (s.charAt(st) == '9' && s.charAt(end) == '6')) {

					st += 1;
					end -= 1;
				} else {

					isNotStrobogrammetic = true;
					break;
				}
			} else {

				isNotStrobogrammetic = true;
				break;
			}
		}
		if (isNotStrobogrammetic == false) {

			System.out.println("It is Strobogrammetic Number");
		} else {

			System.out.println("It is Not Strobogrammetic Number");
		}
	}
}

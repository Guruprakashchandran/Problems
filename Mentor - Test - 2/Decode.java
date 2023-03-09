package com.tasks;

import java.util.*;

public class Decode {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = scan.next();
		new Decode().decoding(input);
		scan.close();
	}

	private void decoding(String input) {

		List<Integer> arr = new LinkedList<>();
		for (int i = 0; i < input.length() + 1; ++i) {

			arr.add(i + 1);
		}
		List<String> list = new ArrayList<>();
		int count = 0;
		char character = input.charAt(0);
		for (int i = 0; i < input.length(); ++i) {

			if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {

				count++;
			} else if (i + 1 < input.length() && input.charAt(i) == 'I' && input.charAt(i + 1) == 'D') {

				if (count != 0) {

					list.add(Integer.toString(count) + character);
				}
				count = 1;
				character = 'D';
			} else if (i + 1 < input.length() && input.charAt(i) == 'D' && input.charAt(i + 1) == 'I') {

				count++;
				list.add(Integer.toString(count) + character);
				count = 0;
				character = 'I';
			} else {
				count++;
				list.add(Integer.toString(count) + character);
			}
		}
		int st = 0, end = arr.size() - 1;
		System.out.print("\nOutput : ");
		for (int i = 0; i < list.size(); ++i) {

			if (list.get(i).substring(list.get(i).length() - 1, list.get(i).length()).equals("D")) {

				if (i == 0) {
					if (input.charAt(0) == 'D') {

						System.out.print(
								arr.get(Integer.parseInt(list.get(i).substring(0, list.get(i).length() - 1))) + " ");
						arr.remove(Integer.parseInt(list.get(i).substring(0, list.get(i).length() - 1)));
					} else {

						System.out.print("1 ");
						arr.remove(0);
					}
				}
				st = st - 1;
				end = st + Integer.parseInt(list.get(i).substring(0, list.get(i).length() - 1));
				count = Integer.parseInt(list.get(i).substring(0, list.get(i).length() - 1));
				for (int j = end; j > st; --j) {

					System.out.print(arr.get(j) + " ");
				}
				st = end + 1;
			}
			if (list.get(i).substring(list.get(i).length() - 1, list.get(i).length()).equals("I")) {

				if (i == 0) {

					System.out.print("1 ");
					arr.remove(0);
				}
				end = st + Integer.parseInt(list.get(i).substring(0, list.get(i).length() - 1));
				count = Integer.parseInt(list.get(i).substring(0, list.get(i).length() - 1));
				for (int j = st; j < end; ++j) {

					System.out.print(arr.get(j) + " ");
				}
				st = end;

			}
		}
	}
}
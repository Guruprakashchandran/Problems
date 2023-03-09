package com.tasks;

import java.util.*;

public class PascalTriangle{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Input : ");
		int input = scan.nextInt();
		List<List<Integer>> list = new PascalTriangle().createList(input);
		System.out.println(list.toString());
		scan.close();
	}
	private List<List<Integer>> createList(int input){

		List<List<Integer>> list = new LinkedList<>();
		List<Integer> subList;
		subList = new LinkedList<>();
		subList.add(1);
		list.add(subList);
		if(input == 0){
		
			return list;
		}
		subList = new LinkedList<>();
		subList.add(1);
		subList.add(1);
		list.add(subList);
		if(input == 1){
			
			return list;
		}
		else{

			for(int i = 2;i<input;i++){

				subList = new LinkedList<>();
				for(int j = 0;j<i;++j){

					if(j == 0){

						subList.add(1);
					}
					else {
						subList.add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
						if(j + 1 == i){
	
							subList.add(1);
						}
					}					
				}
				list.add(subList);
			}
		}
		return list;
	}
}

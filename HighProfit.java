package com.tasks;

import java.util.*;

public class HighProfit{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Length : ");
		int length = scan.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter Array Values : ");
		for(int i = 0;i<length;++i){

			arr[i] = scan.nextInt();
		}
		new HighProfit().findHighProfit(arr,length);
		scan.close();
	}
	private void findHighProfit(int[] arr,int length){

		int value = 0,index = 0;
		for(int i = 0;i<length;++i){

			if(arr[i] < arr[index]){

				index = i;
			}
			else if(arr[i] - arr[index] > value){

				value = arr[i] - arr[index];
			}
		}
		System.out.println("Profit : " +value);
	}
}

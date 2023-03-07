package com.tasks;

import java.util.*;

public class TotalWaterStorage{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int length = scan.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter Values");
		for(int i = 0;i<length;++i){

			arr[i] = scan.nextInt();
		}
		new TotalWaterStorage().findWaterStorage(arr,length);
		scan.close();
	}
	private void findWaterStorage(int[] arr,int length){

		int st = 0,end = length-1,min = 0;
		int storage = 0,point = 0; 
		while(st < end){

			if(arr[st] > min && arr[end] > min){

				if(arr[st] > arr[end]){
			
					min = arr[end];
				}
				else{

					min = arr[st];
				}
			}
			else if(arr[st] < min){

				storage += min - arr[st];
			}
			else if(arr[end] < min){

				storage += min - arr[end];
			}			
	
			if(st == 0 && end == length -1){

				if(arr[st] > arr[end]){

					point = st;
					end--;
				}
				else {

					point = end;
					st++;
				}
			}
			else if(st == point){

				if(arr[end] > arr[point]){

					point = end;
					st++;					
				}
				else {

					end--;
				}
			}
			else if(end == point){

				if(arr[st] > arr[point]){

					point = st;
					end--;
				}
				else{

					st++;
				}
			}
		}
		System.out.println("Water Storage :"+ storage);
	}
}
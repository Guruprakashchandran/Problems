package com.tasks;

import java.util.*;

public class NumberToWordConvert{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = scan.nextInt();
		NumberToWordConvert word = new NumberToWordConvert();
		int[] arr = word.convertArray(number);
		word.convertWord(arr);
	}
	private int[] convertArray(int number){
		
		String num = Integer.toString(number);
		int[] arr = new int[Integer.toString(number).length()];
		int j = 0;
		for(int i = num.length()-1;i >= 0;--i){

			arr[j++] = Character.getNumericValue(num.charAt(i));
		}
		return arr;
	}
	private void convertWord(int[] arr){

		String[] number = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] elevenToNinetin = {"Ten","Elevan","twelve","Thirteen","Fouteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] tenMultiply = {"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty","Hundred"};

		String s = "";	
		for(int i = arr.length-1;i>=0;--i){

			if(i == 2){

				if(arr[i] != 0){

					s += number[arr[i]-1] + " Hundred ";
					if(arr[1] != 0 || arr[0] != 0){

						s += "and ";
					}
				}				
			}
			else if(i == 1){

				if(arr[i] < 10 && arr[i] > 1){

					
					s += tenMultiply[arr[i]-2]+" ";
					if(arr[i] > 0 && arr[i] < 10){

						s += number[arr[0]-1];	
					}	
					i--;			
				}
				else if(arr[i] == 1){


					s += elevenToNinetin[arr[0]];
					i--;
				}
			}
			else if(i == 0){

				if(arr[i] != 0) {
					
					s += number[arr[i]-1];
				}
			}
		}
		System.out.println(s);
	}
}

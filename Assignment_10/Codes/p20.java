/* 20. Find the missing number in 1 to n
Problem: Given an array `nums` containing `n` distinct numbers taken from `0, 1, 2, ..., n`, find the single number that is missing.
Input Example: [3, 0, 1]
Output Example: 2*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array: " + Arrays.toString(arr));
		int max = 0;
		for(int i = 0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}	
		int freq [] = new int[max+1];
		for(int i = 0; i<arr.length; i++){
			freq[arr[i]]++;
		}
		for(int i = 0; i<freq.length; i++){
			if(freq[i] == 0){
				System.out.println(i);
			}
		}
	}
}

/* 13. Find the second largest and second smallest element
Problem: Given an array of integers `nums` with at least two elements, find and print the second largest and second smallest distinct elements.
Input Example: [5, 2, 8, 1, 9]
Output Example: Second largest: 8
			    Second smallest: 2*/
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
		int max = arr[0];
		int sec_max = arr[0];
		int min = arr[0];
		int sec_min = arr[0];
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > max ){
				max = arr[i];
			}
			if(arr[i] < min ){
				min = arr[i];
			}
		}
		for(int i = 0; i<arr.length; i++){
			if(arr[i] < max && sec_max < arr[i]){
				sec_max = arr[i];
			}
			if(arr[i] > min && sec_min > arr[i]){
				sec_min = arr[i];
			}
		}
		System.out.println("Second max : "+ sec_max);
		System.out.println("Second min : "+ sec_min);
	}
}
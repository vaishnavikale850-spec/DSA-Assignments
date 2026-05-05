/* 14. Find the kth largest and kth smallest element
Problem: Given an array of integers `nums` and an integer `k`, find and print the kth largest and kth smallest elements in the array.
Input Example: nums = [3, 2, 1, 5, 6, 4], k = 2	
Output Example: 2nd largest: 5
			    2nd smallest: 2
*/
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
		System.out.print("Enter k : ");
		int k = sc.nextInt();
		int k_min = 0;
		int k_max = 0;
		for(int i = 0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j ++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		k_max = arr[arr.length - k];
		k_min = arr[k-1];
		System.out.println("k th max : "+ k_max);
		System.out.println("k th min : "+k_min);
	}
}
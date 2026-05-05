/* 11. Find the largest element in the array
Problem: Given an array of integers `nums`, find and print the largest element.
Input Example: [2, 7, 1, 9, 5]
Output Example : 9
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
		int max = 0;
		for(int i = 0; i<arr.length; i++){
			if(max< arr[i]){
				max = arr[i];	
			}
		}
		System.out.println("Max is : " + max);
	}
}
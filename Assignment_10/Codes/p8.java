/* 8. Search for an element in array (Linear Search)
Problem: Given an array of integers `nums` and a target integer `x`, find if `x` is present in the array. Return the index of `x` if found, otherwise return -1.
Input Example: nums = [10, 20, 30, 40], x = 30
Output Example: 2
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int op = -1;
		boolean isFound = false;
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == x){
				isFound = true;
				op = i;
				break;
			}
		}
		if(isFound){
			System.out.println("Index is "+ op);
		}
		else{
			System.out.println("Index is "+ op);
		}
	}
}

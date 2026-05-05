/* Check if the array is sorted (ascending order)
Problem: Given an array of integers `nums`, return `true` if the array is sorted in ascending order, otherwise return `false`.
Input Example: [1, 2, 3, 5]
Output Example: true
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
		boolean isSorted = true;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				isSorted = false;	
				break;
			}
		}
		System.out.println("Sorted : " + isSorted);
	}
}
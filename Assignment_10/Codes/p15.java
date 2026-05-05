/* 15. Left rotate array by 1 position
Problem: Given an array of integers `nums`, rotate the array to the left by one position. The first element should move to the end of the array.
Input Example: [1, 2, 3, 4, 5]
Output Example: [2, 3, 4, 5, 1]
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
		System.out.println("Array: " + Arrays.toString(arr));
		int temp = arr[0];
		for(int i = 1; i<arr.length; i++){
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		System.out.println("Left Rotated array: "+ Arrays.toString(arr));
	}
}
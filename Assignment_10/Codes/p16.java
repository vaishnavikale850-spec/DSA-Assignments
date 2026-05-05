/* 16. Right rotate array by 1 position
Problem: Given an array of integers `nums`, rotate the array to the right by one position. The last element should move to the beginning of the array.
Input Example: [1, 2, 3, 4, 5]
Output Example: [5, 1, 2, 3, 4]
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
		int temp = arr[arr.length-1];
		for(int i = arr.length - 2; i>=0; i--){
			arr[i+1] = arr[i];
		}
		arr[0] = temp;
		System.out.println("Right Rotated array: "+ Arrays.toString(arr));
	}
}
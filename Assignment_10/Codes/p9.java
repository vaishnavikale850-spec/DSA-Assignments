/* 9. Count the frequency of each element
Problem:** Given an array of integers `nums`, count and print the frequency of each distinct
element in the array.
Input Example: [1, 2, 2, 3, 1, 4, 2]
Output Example:
1: 2
2: 3
3: 1
4: 1
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int max = 0;
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		int freq[] = new int[max+1];
		for(int i = 0; i<arr.length; i++){
			freq[arr[i]]++;		
		}
		for(int i = 0; i<freq.length; i++){
			if(i != 0 ){
				System.out.println(i + " : "+ freq[i] );	
			}
		}
	}
}

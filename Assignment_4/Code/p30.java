//Time Complexity = O(log base 2 n * log base 3 n)
//Space Complexity = O(1)

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i = i*2){
			for(int j=1; j<=n; j = j*3){
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
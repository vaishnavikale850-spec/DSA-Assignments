//Assignment No - 2
//Time Complexity = O(n^2)
//Space Complexity = O(1)

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=i; j++){												System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
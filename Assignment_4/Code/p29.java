//Time Complexity = O(log base 2 n)
//Space Complexity = O(1)

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i = i*2){
			System.out.print("*");
		}	
	}
}
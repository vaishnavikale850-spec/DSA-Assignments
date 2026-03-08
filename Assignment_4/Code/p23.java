//Time Complexity = O(n^2)
//Space Complexity = O(1)

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			for(int j = 1; j <= n; j++){
				if(i == j || i+j == n+1){
					System.out.print("0");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
			
	}
}
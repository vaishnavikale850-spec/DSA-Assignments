//Assignment No - 3
//Time Complexity = O(n^2)
//Space Complexity = O(1)
//Cross Number 
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		for(int i = 1; i<=n ; i++){
			for(int j  = 1; j<=n; j++){
				if(i == j || i+j == n+1){
					System.out.print(i);
				}
				else{
					System.out.print(" ");

				}
			}
			System.out.println();
		}	
	}
}
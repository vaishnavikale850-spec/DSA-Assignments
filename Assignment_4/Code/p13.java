//Assignment No - 3
//Time Complexity = O(n^2)
//Space Complexity = O(1)
//Binary Diamond
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++){
				if( i==j || (i+j)%2 == 0){
					System.out.print("1" + " ");
				}					
				else{
					System.out.print("0" + " ");
				}
			}
			System.out.println();	
		}
		for(int i = n-1; i>=1; i--){
			for(int j = 1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++){
				if( i==j || (i+j)%2 == 0){
					System.out.print("1" + " ");
				}					
				else{
					System.out.print("0" + " ");
				}
			}
			System.out.println();	
		}	
	}
}
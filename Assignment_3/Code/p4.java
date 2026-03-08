//Diamond with continuous number
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int count = 1;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++){
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();	
		}
		for(int i = n-1; i>=1; i--){
			for(int j = 1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++){
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}	
	}
}
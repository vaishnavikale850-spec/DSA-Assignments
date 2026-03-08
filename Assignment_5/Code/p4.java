import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt();
		int num = n;
		int rev = 0;
		while(n>0){
			rev = rev*10 + n % 10;
			n/=10;
		}
		if(rev == num){
			System.out.println("Palindrome Num");
		}
		else{
			System.out.println("Not Palindrome Num");
		}
	}
}
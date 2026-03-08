import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt();
		while(n>0){
			int num = n % 10;
			System.out.println(num);
			n/=10;
		}
	}
}
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int a = sc.nextInt();
		System.out.print("Enter number :");
		int b = sc.nextInt();
		int gcd = 1;
		while(a!=0 && b!=0){
			if(a>b){
				a = a-b;
			}
			else{
				b = b-a;
			}
		}
		if(a == 0){
			gcd = b;
		}
		else{
			gcd = a;
		}
		if(gcd == 1){
			System.out.print("Co-prime number");
		}

		else{
			System.out.print("Not Co-prime number");
		}
	}
}
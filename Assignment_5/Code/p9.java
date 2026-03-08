import java.util.*;
import java.lang.Math;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num :");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 2; i< n; i++){
			if(n % i == 0){
				count++;
				break;
			}
		}
		if(count == 0){
			System.out.print("Prime Num");
		}
		else{
			System.out.print("Not Prime Num");
		}			
	}
}
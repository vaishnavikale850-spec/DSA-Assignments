import java.util.*;
import java.lang.Math;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num :");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i<= n; i++){
			for(int j = 1; j <= i; j++){
				if(i % j == 0){
					count++;
				}	
			}
			if(count == 2){
				System.out.println(i);
			}
		count = 0;
		}			
	}
}
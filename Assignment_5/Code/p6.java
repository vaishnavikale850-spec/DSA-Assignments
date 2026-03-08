import java.util.*;
class Demo{
   	public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter number: ");
        	int n = sc.nextInt();
        	int num = n;
        	int count = 0;
        	int sum = 0;
		int temp = n;
        	while(temp > 0){
            		temp /= 10;
            		count++;
        	}
        	temp = n;
        	while(temp > 0){
            		int l_Digit = temp % 10;
            		int multi = 1;
			int n_count = 0;
			while(n_count < count){
        	                multi *= l_Digit;
				n_count++;
			}
            		sum += multi;
            		temp /= 10;
        	}
	
		if(num == sum){
            		System.out.println("Armstrong Number");
        	}
		else{
            		System.out.println("Not Armstrong Number");
        	}
	}
}
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = sc.nextLine();
		boolean isPangram = false;
		char ch = 'a';		
		int max = 0;
		int sec_max = 0;
		
		for(int i = 0; i<str.length(); i++){
   			if(ch == str.charAt(i)){
				isPangram = true;
			}
			ch++;
		}
		System.out.print(isPangram);
	}
}
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String str1 = sc.next();
		
		System.out.println("Enter 2nd string: ");
		String str2 = sc.next();
		boolean isAnagram = false;
		for(int i = 0; i<str1.length(); i++){
			isAnagram = false;
			for(int j = 0; j < str2.length(); j++){
				if(str1.charAt(i) == str2.charAt(j)){
					isAnagram = true;
				}
			}
		}
		System.out.println(isAnagram);
	}
}
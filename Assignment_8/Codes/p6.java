import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String str = "apple";
		char ch ;
		for(int i = 0; i<str.length; i++){
			int count = 0; 
			int freq_count = 0;
			for(int j = i+1; j<str.length-1; j++){
				if(str[i] == str[j]){
					count++;
				}
			}
			if(count>freq_count){
				freq_count = count;
				ch = str[i];
			}
		}
		System.out.print(ch);
	}
}
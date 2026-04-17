import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0;i<arr.length; i++){
			System.out.print("Enter num : ");
			arr[i] = sc.nextInt();
		}
		int num = 0;
		int n = 0;
		int number = 0;
		for(int i = 0;i<arr.length; i++){
			int count = 0;
			for(int j = 0;  j<arr.length;  j++){
				if(arr[i] == arr[j]){
					count++;	
				}
			}
			if(count > 1){
				n = count;
				number = arr[i];
			}
		}
		int newsize = size - n;
		int freq[] = new int[newsize];
		int index = 0;
		for(int i = 0; i<arr.length; i++){
			int c = 0;
			for(int j= 0; j<arr.length; j++){
				if(arr[i] == arr[j]){
					c++;
				}
			}
			if(c == 1){
				freq[index] = arr[i];
				index++;
			}
		}
		System.out.print(Arrays.toString(freq));
	}
}
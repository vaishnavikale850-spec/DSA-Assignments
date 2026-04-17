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
		int h_max = 0;
		int s_max = 0;
		for(int i = 0;i<arr.length; i++){
			int count = 0;
			for(int j = 0;j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(h_max < count){
				h_max = count;
			}
		}
		for(int i = 0;i<arr.length; i++){
			int count = 0;
			for(int j = 0;j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}	
			}
			if(s_max <count && h_max < arr[i]){
				s_max = arr[i];
			}
		}
		System.out.print(s_max);
		
	}
}
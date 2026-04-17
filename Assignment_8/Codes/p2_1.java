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
		System.out.print("Enter k :");
		int k = sc.nextInt();
		int max = 0;
		for(int i = 0;i<arr.length; i++){
			int count = 0;
			for(int j = 0;j <arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}	
			}
			if(count>k){
				max = arr[i];
				
			}
		}
		System.out.print(max);
	}
}
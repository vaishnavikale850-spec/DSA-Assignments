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
		int max = 0;
		int s_max = 0;
		for(int i =0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		int freq[] = new int[max+1];
		for(int i = 0; i<arr.length; i++){
			freq[arr[i]]++;
		}
		int f_max = 0;
		for(int i = 0; i<freq.length; i++){
			if(freq[i] > f_max){
				f_max = freq[i];
			}
		}

		for(int i = 0;i<freq.length; i++){
			int count = 0;
			for(int j = 0;j <freq.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}	
			}
			if(s_max < count && f_max > arr[i]){
				s_max = arr[i];
			}
		}

		System.out.print(s_max);
		
	}
}
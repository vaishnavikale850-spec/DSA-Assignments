import java.util.HashMap;
import java.util.Arrays;
class Demo{
	public static void main(String[]args){
		int arr[] = {1,2,2,3,3,3,4,4};

		HashMap<Integer, Integer> hm = new HashMap<>();	
		
		for(int num : arr){
			hm.put(num, hm.getOrDefault(num,0)+1);
		}
		int max = 0;
		int sec_max = 0;
		
		for (int freq : hm.values()) {
			if (freq > max) {
                		sec_max = max;
                		max = freq;
            		}
			else if (freq > sec_max && freq < max ) {
                		sec_max = freq;
            		}
		}
		for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == sec_max) {
				System.out.print(entry.getKey() + " ");
          	 	}
      	 	 }
	}
}
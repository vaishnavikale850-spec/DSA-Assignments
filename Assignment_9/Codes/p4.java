import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Merge Sort ");
        
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter num : ");
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = arr.length - 1;

        f(arr, low, high);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void f(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        f(arr, low, mid);
        f(arr, mid + 1, high);

        merge(arr, low, high, mid);
    }

    static void merge(int[] arr, int low, int high, int mid) {
        int m_d[] = new int[high - low + 1];

        int blue = low;
        int red = 0;
        int green = mid + 1;

        while (blue <= mid && green <= high) {
            if (arr[blue] <= arr[green]) {
                m_d[red++] = arr[blue++];
            } else {
                m_d[red++] = arr[green++];
            }
        }

        while (blue <= mid) {
            m_d[red++] = arr[blue++];
        }

        while (green <= high) {
            m_d[red++] = arr[green++];
        }

        for (int i = 0; i < m_d.length; i++) {
            arr[low + i] = m_d[i];
        }
         
    }
}
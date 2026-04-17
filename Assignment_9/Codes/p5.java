import java.util.*;

class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quick Sort ");
        
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter num : ");
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low >= high)
            return;

        int pivot = pivotfinder(arr, low, high);

        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    public static int pivotfinder(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            while (j > low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
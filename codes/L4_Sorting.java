import java.util.Scanner;

public class L4_Sorting {

    public void Sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Elements after Sorting: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.print("");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements to Sort: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        L4_Sorting sortingObj = new L4_Sorting();
        sortingObj.Sort(arr);
        
        scanner.close();

    }
}

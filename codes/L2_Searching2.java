import java.util.Scanner;

public class L2_Searching2 {

     public int Search(int[] arr, int key) {
        int n = arr.length;

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (found = true) {
                // found = true;
                System.out.println("Element found at index: " + i);
                return i; 
            }
        }

        if (found == false) {
            System.out.println("Element not found in array");
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

    
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        L2_Searching2 searchObj = new L2_Searching2();
        searchObj.Search(arr, key);

        scanner.close();
    }
}

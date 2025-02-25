import java.util.Scanner;

public class L3_SearchingOnly {

    public void Search(int[] arr, int key) {
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Element found at index: " + i);
            }
        }

        if (!found) {
            System.out.println("Element not found in array");
        }
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

        L3_SearchingOnly searchObj = new L3_SearchingOnly();
        searchObj.Search(arr, key);

        scanner.close();
    }
}

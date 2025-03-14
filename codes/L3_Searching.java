import java.util.Scanner;

public class L3_Searching {

    public void display(int[] array)
    {
        System.out.println("Indexes are : ");
        for(int element:array)
        {
            System.out.println(element);
        }
    }

    public int[] Search(int[] arr, int key) {
        int n = arr.length;
        boolean found = false;
        int[] array = new int[arr.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                array[index] = i;
                index++;
                System.out.println("Element found at index: " + i);
            }
        }

        
        if (!found) {
            System.out.println("Element not found in array");
        }

        return array;
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

        L3_Searching searchObj = new L3_Searching();
       int[] array =  searchObj.Search(arr, key);

       searchObj.display(array);

        scanner.close();
    }
}

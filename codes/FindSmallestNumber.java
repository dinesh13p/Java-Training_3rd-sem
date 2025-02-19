import java.util.Scanner;

public class FindSmallestNumber {


        int[] array1;
    
        public int getSmallest(int[] arr) {
            int n = arr.length;
            int smallest = arr[0];
    
            for (int i = 1; i < n; i++) {
                if (smallest > arr[i]) {
                    smallest = arr[i];
                }
            }
            // System.out.println("Smallest number: " + smallest);
            return smallest;
        
        }
    
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int size = scanner.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter numbers to find the smallest");
            
            for (int i = 0; i < size; i++){
                arr[i] = scanner.nextInt();
            }

            FindSmallestNumber number = new FindSmallestNumber();
            int smallest = number.getSmallest(arr);


            // int[] array = { 3, 43, 36, 69, 71, 23, 12, 58, 10 };

            System.out.println("Smallest number in array: " + smallest);

            scanner.close();
        }
    }
    
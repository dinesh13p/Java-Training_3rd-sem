import java.util.Scanner;

public class T1_FindLargestOddInteger {

    public int getOdd(int[] arr) {

        int largestOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > largestOdd) { // for largest odd
            // if (arr[i] % 2 != 0 && arr[i] > largestOdd) { //for largest even

            

                largestOdd = arr[i];
            }
        }

        return largestOdd;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter numbers to find the odd number");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        T1_FindLargestOddInteger number = new T1_FindLargestOddInteger();
        int odd = number.getOdd(arr);

        if( odd == 0){
            System.out.println("Null !");
        }
        else{

            System.out.println("The largest odd integer is: " + odd);
        }


        scanner.close();
    }
}

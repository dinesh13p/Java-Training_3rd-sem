public class FindLargestNumber {

    int[] array1;

    public int getLargest(int[] arr) {
        int n = arr.length;
        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    
    }

    public static void main(String[] args) {
        FindLargestNumber number = new FindLargestNumber();
        int[] array = { 3, 43, 36, 69, 71, 23, 12, 58, 10 };
        int largest = number.getLargest(array);
        System.out.println("Largest number: " + largest);
    }
}

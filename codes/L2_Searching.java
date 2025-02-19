import java.util.Scanner;

public class L2_Searching {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 2, 9, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a key: ");
        int key = scanner.nextInt();

        L2_Searching S = new L2_Searching();
        int res = S.search(arr, key);

        if(res == -1){
            System.out.println(key + "not found");
        } else{
            System.out.println(key + "found at index" + res);
        }


        scanner.close();
    }

    public int search(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    
}

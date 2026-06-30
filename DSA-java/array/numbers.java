import java.util.Scanner;
import java.util.Arrays;
public class numbers {
    public static void main (String args[]) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));  // changer array into string with brackets and commas
        // for(int i = 0 ; i < arr.length ; i++){
        // System.out.print(arr[i]+" ");
        // }
        // for(int num : arr){
        //     System.out.print(num + " ");
        // }
        // for()
    }
}
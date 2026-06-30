import java.util.Arrays;

public class passinginfunction {
    public static void main(String[] args) {
        int[] nums = {1,2,3,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    //function to change 
    //mutable
    public static void change(int arr[]) {
        arr[0] = 99;
    }
}

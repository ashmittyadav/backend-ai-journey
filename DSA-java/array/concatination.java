import java.util.ArrayList;
import java.util.Arrays;
public class concatination {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int n = nums.length;
        int k = 0;
        // ArrayList<int[]=> ans = new ArrayList<>();
        int[] ans = new int[6];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++) {

                ans[k] = nums[j];
                k++;
            }
        } 
        // ans.add(a);
        // ans.add(nums);
        // for(int i = 0; i < n; i++){
            System.out.println(Arrays.toString(ans));
        // }
    }
}

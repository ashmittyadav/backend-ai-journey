import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public static void main(String args[]) {
        int[] nums = {1,2,3,4};
        int i;
        int n =1;
                ArrayList<int[]> pair = new ArrayList<>();
                for(int k = 0; k < nums.length/2;k++) {

                    for(i = 0; i < nums.length; i=i+2) {
                        for(int j = i+1; j <=i+1; j=j+2) {
                            pair.add(new int[]{nums[i],nums[j]});
                        }
                    }
                    System.out.println("pair"+n);
                    n++;
                    for(int[] p : pair) {
                        System.out.println(Arrays.toString(p));
                    
                    }
                }
    }
}
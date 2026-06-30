import java.util.Arrays;

public class mergesortedarray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        
        // p1 pointing max element of nums1 array
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = nums1.length-1;


        while(p3 >=0 ) {
            int a,b;
            a = (p1>=0)? nums1[p1] :Integer.MIN_VALUE;
            b = (p2>=0)? nums2[p2] :Integer.MIN_VALUE;
            if(a > b) {
                nums1[p3] = a;
                p1--;
            }
            else {
                nums1[p3] = b;
                p2--;
            }
            p3--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
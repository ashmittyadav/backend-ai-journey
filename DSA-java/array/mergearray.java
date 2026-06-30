import java.util.ArrayList;

public class mergearray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int m : nums1) {
            if(m != 0){
                list1.add(m);
            }
        }
        for(int n : nums2) {
            list1.add(n);
                }
                System.out.println(list1);
    }
}

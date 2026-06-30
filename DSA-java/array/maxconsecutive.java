class maxconsecutive {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int i = 0;
        int maxcount = 0;
        int p = nums[0];
        int count= 0;
        while(i < nums.length){
            if(nums[i] == 1){
            count++;
                // i++;
            }
            else{
                if(count > maxcount){
            maxcount = count;
                    count = 0;
                // i++;
            }
        }
            i++;
    }
           if(count > maxcount){
            maxcount = count;
           }
        // return maxcount;
        System.out.println(maxcount);
}
}
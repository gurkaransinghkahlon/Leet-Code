public int smallestEqual(int[] nums) {
        int res = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==(i%10)){
                res = i;
                break;
            }
        }
        return res;
    }
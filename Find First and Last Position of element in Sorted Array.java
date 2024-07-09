public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = binarySearch(nums,target,true);
        res[1] = binarySearch(nums,target, false);
        return res;
    }
    public static int binarySearch(int nums[], int target, boolean leftOrient){
        int i = -1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(target < nums[mid])
                right = mid-1;
            else if(target > nums[mid]){
                left = mid+1;
            }
            else{
                i = mid;
                if(leftOrient == true)
                    right = mid-1;
                else
                    left = mid+1;
            }
        }
        return i;
    }
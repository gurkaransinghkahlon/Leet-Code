public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int i=0;
        while(i<=right && left <= right){
            if(nums[i] == 0 && i>= left){
                swap(nums,i,left);
                left++;
            }
            else if(nums[i] == 2){
                swap(nums,i,right);
                right--;
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
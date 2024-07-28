public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longeststreak = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int current_num = num;
                int currentstreak = 1;
                while(set.contains(current_num+1)){
                    current_num += 1;
                    currentstreak += 1;
                }
                longeststreak = Math.max(longeststreak, currentstreak);
            }
        }
        return longeststreak;
    }
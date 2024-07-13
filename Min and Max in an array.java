public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;
        int n= arr.length;
        int i=0;
        while(i<n){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
            i++;
        }
        Pair<Long,Long> p = new Pair(min,max);
        return p;
    }
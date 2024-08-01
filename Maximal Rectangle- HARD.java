public int[] nextSmallerElementCalc(int[] arr, int N){
        int[] ans = new int[N];
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        
        for(int i=N-1; i>=0; i--){
            int curr = arr[i];
            while(stk.peek() != -1 && arr[stk.peek()] >= curr){
                stk.pop();
            }
            ans[i] = stk.peek();
            stk.push(i);
        }
        return ans;
    }
    public int[] prevSmallerElementCalc(int[] arr, int N){
        int[] ans = new int[N];
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        
        for(int i=0; i<N; i++){
            int curr = arr[i];
            while(stk.peek() != -1 && arr[stk.peek()] >= curr){
                stk.pop();
            }
            ans[i] = stk.peek();
            stk.push(i);
        }
        return ans;
    }
    
    
    public int largestAreaInHistogram(int[] arr, int N){
        int[] nextSmallerElement = nextSmallerElementCalc(arr, N);
        int[] prevSmallerElement = prevSmallerElementCalc(arr, N);
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            int length = arr[i];
            int rightIndex = nextSmallerElement[i];
            int leftIndex = prevSmallerElement[i];
            if(rightIndex == -1){
                rightIndex = N;
            }
            int breadth = rightIndex - leftIndex - 1;
            int area = length * breadth;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int[] histogram = new int[matrix[0].length];
        int maxArea = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< histogram.length; j++){
                if(matrix[i][j] == '1'){
                    histogram[j] += 1;
                }
                else{
                    histogram[j] = 0;
                }   
            }
            int area = largestAreaInHistogram(histogram, histogram.length);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
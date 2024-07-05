public boolean searchMatrix(int[][] matrix, int target) {

        int expected_row = -1;
        for(int i=0; i<=matrix.length-1; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1]){
                expected_row = i;
                break;
            }
        }
        if(expected_row == -1) return false;
        int left = 0, right = matrix[expected_row].length-1;
        while(left <= right){
            int mid = (left+right)/2;                 //binary search
            if(matrix[expected_row][mid] == target) return true;
            else if(matrix[expected_row][mid] > target) right = mid-1;
            else if(matrix[expected_row][mid] < target) left = mid+1;
        }
        return false;
}
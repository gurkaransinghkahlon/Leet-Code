public void threeWayPartition(int array[], int a, int b)
    {
        int n = array.length;
        int left = 0;
        int right = n-1;
        for(int i=0; i<=right; i++){
            if(array[i] < a){
                swap(array,i,left);
                left++;
            }
            else if(array[i] > b){
                swap(array,i,right);
                right--;
                i--;
            }
        }
    }
    public static void swap(int array[], int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
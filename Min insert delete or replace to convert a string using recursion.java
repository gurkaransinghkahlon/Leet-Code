public int editDistance(String s, String t) {
        // Code here
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        int[][] output = new int[sArray.length+1][tArray.length+1];
        
        for(int i=0; i<sArray.length+1; i++){
            output[i][tArray.length] = sArray.length-i;
        }
        for(int j=0; j<tArray.length+1; j++){
            output[sArray.length][j] = tArray.length-j;
        }
        for(int i=sArray.length-1; i>=0; i--){
            for(int j=tArray.length-1; j>=0; j--){
                if(sArray[i] == tArray[j]){
                    output[i][j] = output[i+1][j+1];
                }
                else{
                    output[i][j] = 1 + Math.min(output[i+1][j] , Math.min(output[i][j+1] , output[i+1][j+1]));
                }
            }
        }
        return output[0][0];
    }
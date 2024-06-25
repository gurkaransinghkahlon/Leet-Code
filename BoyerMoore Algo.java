public void shiftTable(){
    Map<Character,Integer> map = new HashMap<>();
    int pattern_len = pattern.length();
    int text_len = text.length();
    for(int index=0; index<pattern_len; index++){
        int val = Math.max(1,pattern_len-index-1);
        map.put(pattern.get(index),val);
    }

    //Boyer Moore Algo

    for(int i=0; i<text_len-pattern_len; i += no_skips){
        int no_skips = 0;
        for(int j = pattern_len-1; j>=0; j--){
            if(text.charAt(i) != pattern.charAt(j)){
                if(text.charAt(i+j) != null){
                    no_skips = map.get(text.charAt(i+j));
                    break;
                }
                else{
                    no_skips = text_len;
                    break;
                }
            }
        }
        if(no_skips == 0){
            return i;
        }
    }
}
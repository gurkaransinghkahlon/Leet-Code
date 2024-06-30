public static boolean areRotations(String s1, String s2 )
    {
        
        if (s1.length() != s2.length()) {
            return false;
        }
    
        // Concatenate s2 with itself and check if s1 is a substring of the result
        String combine = s1 + s1;
        int j=0;
        for(int i=0;i<combine.length(); i++){
            if(j< s2.length() && combine.charAt(i) == s2.charAt(j) ){
                j++;
            }
        }
        if(j == s2.length()){
            return true;
        }
        return false;
    }
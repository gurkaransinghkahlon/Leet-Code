static boolean ispar(String x)
    {
        // add your code here
        int n = -1;
        while(x.length() != n){
            n=x.length();
            x = x.replace("()","");
            x = x.replace("{}","");
            x = x.replace("[]","");
        }
        if(x.length() == 0){
            return true;
        }
        return false;
    }
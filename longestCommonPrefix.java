class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        char[] chArray = strs[0].toCharArray();
        int index = 0;
        for(char ch : chArray){
            for(int i=1; i<strs.length; i++){
                if(index >= strs[i].length() || ch != strs[i].charAt(index)){
                    return longestPrefix;
                }
            }
            index += 1;
            longestPrefix += ch;
        }
        return longestPrefix;
    }
}
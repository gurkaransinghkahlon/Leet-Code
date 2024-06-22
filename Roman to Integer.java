class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for(int i=0; i<str.length(); i++){
            if((i+1)<str.length() && roman.get(str.charAt(i+1)) > roman.get(str.charAt(i))){
                res += roman.get(str.charAt(i+1)) - roman.get(str.charAt(i));
                i++;
            }
            else{
                res += roman.get(str.charAt(i));
            }
        }
        return res;
    }
}
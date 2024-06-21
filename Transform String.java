class Solution
{
    int transform (String A, String B)
    {
        // code here
        if(A.length() != B.length()){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<A.length(); i++){
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i), map.get(A.charAt(i))+1);
            }
            else{
                map.put(A.charAt(i),1);
            }
        }
        for(int j=0;j<B.length();j++){
            if(map.containsKey(B.charAt(j))){
                map.put(B.charAt(j),map.get(B.charAt(j))-1);
            }
            else{
                map.put(B.charAt(j),1);
            }
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() !=0){
                return -1;
            }
        }
        int i= A.length()-1, j= B.length()-1, c=0;
        while(i>=0 && j>=0){
            if(A.charAt(i) == B.charAt(j)){
                i--;
                j--;
            }
            else{
                c++;
                i--;
            }
        }
        return c;
    }
}
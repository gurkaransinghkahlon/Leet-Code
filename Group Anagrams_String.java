class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            String sorted = new String(chr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(str);
        }
        res.addAll(map.values());
        return res;
    }
}
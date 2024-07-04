public int countCharacters(String[] words, String chars) {
 int result = 0;
        int char_array[] = new int[26];
        for(char c : chars.toCharArray()){
            char_array[c-'a']++;
        }
        for(String word : words){
            int temp_array[] = Arrays.copyOf(char_array,char_array.length);
            int valid_char = 0;
            for(char c : word.toCharArray()){
                if(temp_array[c-'a']>0){
                    valid_char++;
                    temp_array[c-'a']--;
                }
            }
            if(valid_char == word.length()){
                result += word.length();
            }
        }
        return result;
}
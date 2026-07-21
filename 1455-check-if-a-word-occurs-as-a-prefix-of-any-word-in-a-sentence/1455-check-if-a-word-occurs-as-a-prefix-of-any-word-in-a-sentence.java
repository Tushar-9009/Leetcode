class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (searchWord.length() > word.length()) continue; 
            boolean flg = true;
            for (int j = 0; j < searchWord.length(); j++) {
                if (word.charAt(j) != searchWord.charAt(j)) {
                    flg = false;
                    break;
                }
            }
            
            if (flg==true) {
                return i + 1; 
            }
        }
        return -1;
    }
}

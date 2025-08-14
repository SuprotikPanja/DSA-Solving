class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        int[] alienOrder = new int[26];
        for (int i = 0; i < order.length(); i++) {
            alienOrder[order.charAt(i) - 'a'] = i; // Store index position
        }

        for(int i=0; i<words.length-1; i++){
            for(int j=0; j<words[i].length(); j++){
                if(j>=words[i+1].length()) return false;//like at i->apple and at i+1->app
                int currentChar=words[i].charAt(j);
                int nextChar=words[i+1].charAt(j);
                if(currentChar!=nextChar){
                    int currentCharIdx=currentChar-'a';
                    int nextCharIdx=nextChar-'a';

                    if(alienOrder[currentCharIdx] > alienOrder[nextCharIdx]) return false;
                    else break;
                }
            }
        }
        return true;
    }
}
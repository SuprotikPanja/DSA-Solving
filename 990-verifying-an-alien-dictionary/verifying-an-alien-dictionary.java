class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // Step 1: Create an array to store the order (position) of each letter
        int[] alienOrder = new int[26]; 

        // Fill the alienOrder array using the given alien alphabet string
        for (int i = 0; i < order.length(); i++) {
            alienOrder[order.charAt(i) - 'a'] = i; // Store index position
        }
         // Step 2: Compare each word with the next word to check if they are sorted
        for(int i=0; i<words.length-1; i++){
            for(int j=0; j<words[i].length(); j++){     // Compare characters of two adjacent words


                // Case 1: The second word is shorter but is a prefix of the first(app,apple)
                if(j>=words[i+1].length()) return false;

                // Get the current characters from both words
                int currentChar=words[i].charAt(j);
                int nextChar=words[i+1].charAt(j);

                // Case 2: If the characters are different, check their order
                if(currentChar!=nextChar){      
                    int currentCharIdx=currentChar-'a'; //Find the alphabet positions of characters
                    int nextCharIdx=nextChar-'a';

                    // If the current word's character comes later than the next word's character
                    if(alienOrder[currentCharIdx] > alienOrder[nextCharIdx]) return false;
                    
                    else break;  // If correct order found, stop checking further characters
                }
            }
        }
        // Step 3: If no sorting rules are broken, return true
        return true;
    }
}
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        //using hashmap
        Map <Character,Integer> orderMap = new HashMap<>();
        // Step 1: Create a map to store the order of each letter
        for(int i = 0; i < order.length(); i++){       //Filling the order with position in HashMap
            orderMap.put(order.charAt(i),i);
        } 


        //  Step 2: Compare each word with the next one in the list
        for(int i = 0; i < words.length-1; i++){
            // Compare characters of words[i] and words[i+1] one by one
            for(int j = 0; j < words[i].length(); j++){

                 // Case 1: The second word is shorter but is a prefix of the first
                if(j >= words[i+1].length()) return false;   //batman, bat

                 // Case 2: Characters at position j are different
                if(words[i].charAt(j) != words[i+1].charAt(j)){

                     // Find the position of both characters in alien order
                    int currentLetter = orderMap.get(words[i].charAt(j));
                    int nextLetter = orderMap.get(words[i+1].charAt(j));
                
                // If the next word's letter comes before the current word's letter
                if (nextLetter < currentLetter) return false;
                else break;    // If correct order found, no need to check further characters
                }
            }
        }
    return true;    // Step 3: If no rules were broken, the list is correctly sorted
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
     
        //String can have any symbol from ASCII code.
        //Thus making array to save in array map the number of characters considered so far at the location of last character found.
        int[] map = new int[128];//store (idx+1) of character.
      
        //value saves the starting index of the substring from where length is to be taken
        int startIdx = 0;
        
        int len = s.length();
        
        //saves the value of maximum substring obtained.
        int res = 0;
     
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            
            //if char doesn't exist in current substring 
            if(map[c] == 0 || map[c] < startIdx){
            //save in array map the number of characters considered so far at the location of last character found.
            map[c] = i + 1;
            } else{
                //char repeated,thus check if previous saved is greater or current (i - startIdx) =number of characters considered now. 
                res = Math.max(res, i - startIdx);
                
                //startIdx would be now changed to index after last occurence of character (as that number of chars cannot be considered now).
                startIdx = map[c];
                  
                //save in array map the number of characters considered so far at the location of last character found.
                map[c] = i + 1;
            }
        }
        //if no characters are duplicate, the below statement would consider those cases.
        res = Math.max(res, len - startIdx);
        
        return res;
}
}

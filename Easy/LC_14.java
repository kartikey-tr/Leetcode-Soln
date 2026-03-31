// Sorted the string array
// Compared the first and last string of sorted array
// And returned the common prefix between both

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String prefix = "";
        char []first = strs[0].toCharArray();
        char []last = strs[strs.length-1].toCharArray();
        for(int i = 0; i < first.length; i++){
            if(first[i] == last[i]){
                prefix = prefix.concat(String.valueOf(first[i]));
            } else{
                break;
            }
        }
        return prefix;
    }
}
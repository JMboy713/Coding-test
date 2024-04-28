class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String first = my_string.substring(0,s);
        String last = my_string.substring(s+overwrite_string.length());
        return first+overwrite_string+last;
        
    }
}
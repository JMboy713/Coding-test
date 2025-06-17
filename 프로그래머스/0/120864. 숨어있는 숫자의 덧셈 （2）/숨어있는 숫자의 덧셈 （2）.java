class Solution {
    public int solution(String my_string) {
        int    answer = 0;
        String tmp    = "";
        for (int i = 0; i < my_string.length(); i++) {            
            if (!tmp.isEmpty() && !Character.isDigit(my_string.charAt(i))) {                
                answer+= Integer.parseInt(tmp);
                tmp = "";
            } else if(Character.isDigit(my_string.charAt(i))) {
                tmp += my_string.charAt(i);
            }
        }
        if (!tmp.isEmpty()) {
            answer += Integer.parseInt(tmp);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(String msg) {
        
        HashMap<String,Integer> dict = new HashMap<>();
        int index = 1;
        for(int i=65;i<=90;i++){
            String alp = ""+(char) i;
            dict.put(alp,index);
            index++;
        }
            
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        while (i < msg.length()) {
            String current = "";
            int j = i;

            // 가장 긴걸 찾음
            while (j < msg.length() && dict.containsKey(current + msg.charAt(j))) { // 다음꺼추가한거까지사전에 있다면
                current += msg.charAt(j);
                j++;
            }

            // ans 추가
            ans.add(dict.get(current));

            //사전에 추가.
            if (j < msg.length()) {
                dict.put(current + msg.charAt(j), dict.size() + 1);
            }

            i = j; // 다음 문자로 이동
        }

        
        

        // Convert ArrayList to array
        int[] answer = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            answer[k] = ans.get(k);
        }
        return answer;
    }
}
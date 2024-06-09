import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Integer> asciiSkip = new ArrayList<>();
        ArrayList<Integer> asciiNum = new ArrayList<>();
        char[] skipArr = skip.toCharArray();
        for(char i : skipArr){
            asciiSkip.add((int)i);// ascii코드 정수형으로 입력
        }
        char[] sArr = s.toCharArray();
        for(char i : sArr){
            int a = (int) i;
            for(int j=0;j<index;j++){
                a++;
                if(a>122){
                    a-=26;
                }
                while(asciiSkip.contains(a)){
                    a++;
                    if(a>122){
                        a-=26;
                    }
                }
            }asciiNum.add(a);
        }
        for(int i : asciiNum){
            answer+=(char) i;
        }
        
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        ArrayList<String> array = new ArrayList<>();
        int dropOut = 0; // 걸리는 사람
        int times = 0;
        array.add(words[0]); // 첫번째는 무조건 성공하기 때문에 
        int len = words.length;
        for(int i=1;i<len;i++){
            if(array.contains(words[i])){
                dropOut = (i+1)%n;
                times=(i/n)+1;
                if (dropOut==0) {
                       dropOut = n;
                }
                break;
            }else{
                
                String lastWord = array.get(array.size()-1);
                int num = lastWord.length();
                if(lastWord.charAt(num-1)==words[i].charAt(0)){
                    array.add(words[i]);
                }else{
                    dropOut = (i+1)%n;
                    times=(i/n)+1;
                    if (dropOut==0) {
                       dropOut = n;
                    }
                    break;
                }
            }
        }
        System.out.println(array);

        int[] answer = {dropOut,times};
        

        return answer;
    }
}
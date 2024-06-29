import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        int len = elements.length;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i =1;i<=len;i++){ // 길이
            
            for(int j=0;j<len;j++){ // 시작점
                int ans = 0;
                if(j+i>=len){ // 원형을 넘어선다면, 
                    int plus = j+i-len; // 앞에서부터 더해야할 갯수
                    for(int k=0;k<plus;k++){
                        ans+=elements[k];
                    }
                    for(int jj=j;jj<len;jj++){
                        ans+=elements[jj];
                    }
                    numbers.add(ans);
                }else{
                    for(int k=j;k<i+j;k++){
                        ans+=elements[k];
                    }
                }
                numbers.add(ans);
            }
            
        }
        HashSet<Integer> answer = new HashSet<>();
        for(Integer ans : numbers){
            answer.add(ans);
        }
        return answer.size();
    }
}

// int answer = 0;
//         ArrayList<Integer> array = new ArrayList<>();
//         for(int ele : elements){
//             array.add(ele);
//         }
        
//         System.out.println(array);
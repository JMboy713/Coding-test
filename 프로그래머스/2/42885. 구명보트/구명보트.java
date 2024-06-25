import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] people, int limit) {
        ArrayDeque<Integer> sortedDeque = Arrays.stream(people)  // 배열을 스트림으로 변환
                                                .sorted()        // 정렬
                                                .boxed()         // int를 Integer로 박싱
                                                .collect(Collectors.toCollection(ArrayDeque::new));  
        // 결과를 ArrayDeque로 수집
        int answer=0;
        while(!sortedDeque.isEmpty()){
            if(sortedDeque.peek()+sortedDeque.peekLast()>limit){
                sortedDeque.pollLast();
                answer++;
            }else{
                answer++;
                sortedDeque.pollLast();
                sortedDeque.poll();
            }
        }
        answer+=sortedDeque.size();
        
        

        return answer;
    }
}
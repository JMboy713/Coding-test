import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Deque<Integer> array =  new ArrayDeque<>();
        array.add(arr[0]);
        for(int num:arr){
            int arrNum=array.peekLast();
            if(arrNum!=num){
                array.add(num);
            }
        }
        
        
        int[] answer = new int[array.size()];
        int index = 0;

        
        for (int num : array) {
            answer[index++] = num;
        }


        return answer;
    }
}
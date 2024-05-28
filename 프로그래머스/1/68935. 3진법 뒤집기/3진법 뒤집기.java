import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Deque<Integer> array = new ArrayDeque<>();
        while (n/3!=0){
            int left = n%3;
            array.add(left);
            n=n/3;
        }
        array.add(n);
        System.out.println(array);
        int count =0;
        while(!array.isEmpty()){
            answer+=array.pollLast()*Math.pow(3, count);;
            count+=1;
        }
        
        return answer;
    }
}
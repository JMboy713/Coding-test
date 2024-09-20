import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        
        for(String str : operations){
            String[] li = str.split(" ");
            if(li[0].equals("I")){
                int num = Integer.parseInt(li[1]);
                maxHeap.offer(num);
                minHeap.offer(num);    
            }else{
                if(li[1].equals("1") && !maxHeap.isEmpty()){//최대값 제거. 
                    minHeap.remove(maxHeap.poll());
                }else if(li[1].equals("-1") && !minHeap.isEmpty()){
                    maxHeap.remove(minHeap.poll());
                    
                }
            }
        }
        if(maxHeap.isEmpty() && minHeap.isEmpty()){
            return new int[]{0,0};
        }
        int[] ans = new int[]{maxHeap.poll(),minHeap.poll()};
        
        return ans;
    }
}

// 16 -5643
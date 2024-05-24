import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int num : arr){
            newArr.add(num);
            if(num<min){
                min=num;
            }
        }
        
        newArr.remove(newArr.indexOf(min));
        if(newArr.isEmpty()){
            newArr.add(-1);
        }
        
        int[] answer = new int[newArr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=newArr.get(i);
        }
        
        return answer;
        
        
        
        
        
    }
}
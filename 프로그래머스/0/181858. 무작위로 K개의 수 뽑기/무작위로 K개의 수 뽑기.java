import java.util.*;

// String[] strArray = {"AB", "BC", "BCD", "CD", "CDEF"};

  

//   if(strList.contains("BCD")) {
//     System.out.println("BCD는 strArray에 존재합니다.");
//   }

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i =0;i<k;i++){
            answer[i]=-1;
        }
        Set<Integer> set = new HashSet<>();
        
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
                answer[count]=arr[i];
                count++;
            }
            if(count==k) {
                break;
            }
        }
        
        
        
        
        
        return answer;
    }
}
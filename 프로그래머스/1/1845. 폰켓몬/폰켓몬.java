import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> num = new HashSet<>();
        for(int number:nums){
            num.add(number);
        }

        if(num.size()<(nums.length/2)){
            return num.size();
        }else{
            return nums.length/2;
        }
        
        
    }
}


// def solution(nums):
//     if len(set(nums))<len(nums)/2:
//         return len(set(nums))
//     else:
//         return len(nums)/2
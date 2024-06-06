// 숫자의 개수가 50개로 제한되어 있기 때문에 3중 반복문을 돌려도 괜찮다. 

class Solution {
    public int solution(int[] nums) {
        int answer=0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(isDivide(nums[i]+nums[j]+nums[k])){
                        answer++;   
                    }
                }
            }
        }

        return answer;
    }
    public boolean isDivide(int num){
        boolean ans = true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                ans=false;
                break;
            }
        }
        
        return ans;
    }
}
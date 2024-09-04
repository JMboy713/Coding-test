class Solution {
    static StringBuilder sb = new StringBuilder();
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i] = f2(numbers[i]);
        }
        return answer;
    }
    public long f2(long num){
        String bit = "00"+Long.toString(num,2);// dummy 0을 붙힘.
        boolean replace = false;
        String ans = "";
        
        for(int i=bit.length()-1;i>=0;i--){
            if(bit.charAt(i)=='0' && i==bit.length()-1){
                ans+="1";
                replace =true;
            }
            else if(bit.charAt(i)=='0' && replace == false){ // 처음 0을 만나는 순간. 
                ans = "10"+ans.substring(1);
                replace = true;
            }else{
                ans = bit.charAt(i)+ans;
            }
        }
        
        return Long.parseLong(ans,2);
        
    }
    
    
    
    
    public long f1(long num){
        
        String bit = Long.toString(num,2);
        // System.out.println(bit);
        while(true){
            
            int count = 0;
            num++;
            // System.out.println(num);
            String second = Long.toString(num,2);
            int max = Math.max(second.length(),bit.length());
            // System.out.println(max+"max");
            for(int i=0;i<max;i++){
                try{
                    if(bit.charAt(bit.length()-i-1)!=second.charAt(second.length()-i-1)){
                        count++;
                    }    
                    
                    // bit.length() - (i+1) 보다 작을 경우
                    // second.length() - (i+1) 보다 작을 경우
                }catch(Exception e){
                    if(bit.length()<(i+1)){// second 가 더 길다면
                        
                        if(second.charAt(second.length()-(i+1))=='1'){
                            count++;
                        }
                    }else if(second.length()<(i+1)){
                        if(bit.charAt(bit.length()-(i+1))=='1'){
                            count++;
                        }
                    }
                }
            }
            if(count<=2){
                
                break;
            }
            
        }
        return num;
    }
}
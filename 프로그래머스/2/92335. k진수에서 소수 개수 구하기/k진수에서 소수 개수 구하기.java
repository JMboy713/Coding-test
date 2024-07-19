class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String number = nToK(n,k);
        String[] numbers = number.split("0");
        
        for(String num : numbers){
            if(num.equals("")){
                continue;
            }
            
            if(primeNumber(num)){
                answer++;
            }
        }
        return answer;
    }
    public String nToK(int n,int k){
        String str = Integer.toString(n,k);
        return str;
    }
    
    public boolean primeNumber(String num){
        long number = Long.parseLong(num);
        String str = Long.toString(number,10);
        long lastNum = Long.parseLong(str);
        if(lastNum==1) return false;
        for(int i=2;i<=Math.sqrt(lastNum);i++){
            if(lastNum%i==0){
                return false;
            }
        }
        return true;
    }
}
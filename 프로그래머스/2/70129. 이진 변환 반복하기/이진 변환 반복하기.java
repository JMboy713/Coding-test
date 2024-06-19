class Solution {
    static int count=0;
    public int[] solution(String s) {
        int zero = 0;
        
        while(s.length()>1){
            StringBuilder sb = new StringBuilder();
            char[] arr = s.toCharArray();
            
            for(char ch : arr){
                if(ch=='0'){
                    zero++;
                }else{
                    sb.append(ch);
                }
            }
            String str = sb.toString();            
            s=bin(str.length());
        }
        int[] answer = new int[] {count,zero};
        return answer;
    }
    
    
    public static String bin(int num){
        count++;
        StringBuilder sb = new StringBuilder();
        while (num>0){
            int left=num%2;
            num=num/2;
            sb.append(left);
        }
        return sb.toString();
    }
}
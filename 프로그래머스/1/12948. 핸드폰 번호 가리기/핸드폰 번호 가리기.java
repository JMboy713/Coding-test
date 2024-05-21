class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int leftNumberSize = phone_number.length()-4;
        // System.out.println(leftNumberSize);
        
        for(int i =0;i<phone_number.length();i++){
            if (i<leftNumberSize){
                answer+="*";
            }else{
                answer+=phone_number.charAt(i);
            }
        }
        
        return answer;
    }
}
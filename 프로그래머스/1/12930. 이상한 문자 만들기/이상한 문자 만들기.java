class Solution {
    public String solution(String s) {
        String answer ="";
        String[] list = s.split(" ",-1);
        for(String str : list){
            for(int i =0;i<str.length();i++){
                String newStr = ""+str.charAt(i);
                if (i%2!=0){
                    answer+=newStr.toLowerCase();
                }else{
                    answer+=newStr.toUpperCase();
                }
            }
            answer+=" ";
        }
        return answer.substring(0,answer.length()-1);
        // answer=answer.trim();
        //     return answer;
    }
}
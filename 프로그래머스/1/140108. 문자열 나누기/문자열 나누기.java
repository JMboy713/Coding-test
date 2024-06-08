class Solution {
    public int solution(String s) {
        int countx=0;
        int county=0;
        int count=0;
        char x = s.charAt(0);
        for(int index =0;index<s.length();index++){
            char i = s.charAt(index);
            
            if(i==x){
                countx++;
            }else if(i!=x){
                county++;
            }
            
            if(countx==county){
                count++;
                countx=0;
                county=0;
                if(s.length()-1==index){
                    break;
                }else{
                    x=s.charAt(index+1);
                }
            }else if( countx!=county && s.length()-1==index){
                count++;
            }
        }

        return count;
    }
}
import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer=0;
        ArrayList<Integer> list = knight(number);
        for(int num : list){
            if (num>limit){
                answer+=power;
            }else{
                answer+=num;
            }
        }
        return answer;
    }
    
    public ArrayList<Integer> knight(int number){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =1; i<=number;i++){
            int num = divisor(i);
            list.add(num);
        }
        return list;
    }
    public int divisor(int number){
        int div =0;
        if(number==1){
            return 1;
        }
        for(int i=1;i<=Math.sqrt(number);i++){
            if ((i*i)==number){
                div++;
            }else if(number%i==0){
                div+=2;
            }
        }
        return div;
    }
}
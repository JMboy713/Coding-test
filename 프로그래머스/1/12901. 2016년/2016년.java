import java.util.*;

class Solution {
    public String solution(int a, int b) {
        Map<Integer,String> day = new HashMap<>();
        day.put(1,"FRI");
        day.put(2,"SAT");
        day.put(3,"SUN");
        day.put(4,"MON");
        day.put(5,"TUE");
        day.put(6,"WED");
        day.put(0,"THU");
        
        for(int i = 1;i<a;i++){
            if (i<=7){
                if(i%2==1){// 홀수 월
                    b+=3; // 홀수월이 지나면 요일이 +3
                }else if(i==2){// 2월 윤년
                    b+=1;
                }else{
                    b+=2;
                }
            }else{
                if(i%2==1){// 8월부터 짝수달이 30일
                    b+=2;
                }else{
                    b+=3;
                }        
            }
        }
        System.out.println(b);
        
        
        
        return day.get(b%7);
    }
    
    
}
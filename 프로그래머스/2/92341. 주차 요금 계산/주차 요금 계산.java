import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        int defaultTime = fees[0];
        int defaultfee = fees[1];
        int time = fees[2];
        int timefee = fees[3];
        
        
        
        List<Data> data = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        for(String re : records){
            Data reco = new Data(re);
            data.add(reco);
        }

        // carNum 기준으로 정렬
        Collections.sort(data);
        System.out.println(data);
        
        String before = "";
        int minutes = 0;
        String inOut = "";
        
        int totalMinute =0;
        
        for(Data rec : data){
            if(before.equals(rec.getCarNum())){ // 전에 있던 차가 입차, 출차 할 경우 
                if(rec.getMove().equals("IN")){ // 입차시
                    minutes = rec.getTime();
                    inOut = "IN";
                    before = rec.getCarNum();
                }else{ // 출차시
                    totalMinute += rec.getTime()-minutes;
                    minutes = 0;
                    before = rec.getCarNum();
                    inOut = rec.getMove();
                }
                
            }else{
                if(!before.equals("")){ // 다음차로 넘어갔을 경우 ( 첫 시작 제외 )
                    //초기화
                    if(inOut.equals("OUT")){
                        ans.add(totalMinute);    
                        totalMinute =0;
                    }else{
                        totalMinute+=((23*60+59)-minutes);
                        ans.add(totalMinute);  
                        totalMinute =0;
                    }
                    
                }
                before = rec.getCarNum();
                minutes = rec.getTime();
                inOut = rec.getMove();
                
            }
        }
        
        // 마지막 차량 계산
        if(inOut.equals("OUT")){
            ans.add(totalMinute);    
        }else{
            totalMinute+=((23*60+59)-minutes);
            ans.add(totalMinute);  
        }
        
        System.out.println(ans);
        
        
        int[] answer = new int[ans.size()];
        
        for(int i =0;i<ans.size();i++){
            if(ans.get(i)>=defaultTime){
                answer[i]=defaultfee+ (int) Math.ceil((double) (ans.get(i) -defaultTime)/time)*timefee;
            }else{
                answer[i]=defaultfee;
            }
        }
        
        return answer;
    }
}



class Data implements Comparable<Data> {
    private int time;
    private String carNum;
    private String move;
    
    public Data(String str){
        String[] st = str.split(" ");
        String[] HM = st[0].split(":");
        int hour = Integer.parseInt(HM[0]);
        int minute = Integer.parseInt(HM[1]);
        
        
        this.time = (hour*60)+minute;
        this.carNum = st[1];
        this.move = st[2];
    }

    public String getCarNum() {
        return carNum;
    }
    public int getTime() {
        return time;
    }
    public String getMove() {
        return move;
    }

    @Override
    public int compareTo(Data o) {
        return this.carNum.compareTo(o.carNum);
    }
    
    @Override
    public String toString(){
        return time + "," + carNum + "," + move;
    }
}

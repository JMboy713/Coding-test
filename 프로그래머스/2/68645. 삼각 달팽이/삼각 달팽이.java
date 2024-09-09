class Solution {
    public int[] solution(int n) {
        int total = 0;
        for(int i=0;i<=n;i++){
            total+=i;
        }
        int[] answer = new int[total];
        Direction dir = new Direction(1,true);
        int idx = 0;
        
        
        for(int i=1;i<=total;i++){
            if(answer[idx]==0){
                answer[idx]=i;    
            }// 덮어 씌우지는 않음
            
            if(dir.tf){// 오른쪽으로 움직이는 단계라면
                if(idx+dir.move<answer.length && answer[idx+dir.move]==0){
                    idx = idx+dir.move;
                    dir.move++;
                }else if((idx+dir.move)<answer.length && answer[idx+1]==0 && answer[idx+dir.move]!=0){
                    idx++;
                }else if(idx+dir.move>=answer.length && (idx+1) <answer.length && answer[idx+1]==0){
                    idx++;
                }else{
                    idx = idx-dir.move;
                    dir.move--;
                    dir.tf = dir.tf ? false : true;
                }
            }else if(!dir.tf){// 왼쪽으로 가는 단계라면
                 if(idx-dir.move>=0 && answer[idx-dir.move]==0){
                    
                    idx = idx-dir.move;
                    dir.move--;
                }else if(idx-dir.move<0 && (idx-1) <answer.length && answer[idx-1]==0){
                    idx--;
                }else if((idx-dir.move)>0 && answer[idx-1]==0 && answer[idx-dir.move]==0){
                    idx--;
                }else{
                    idx = idx+dir.move;
                    dir.move++;
                    dir.tf = !dir.tf;
                }
            }
            
        }
        
        
        
        return answer;
    }
    
    
    
    
    
    
    class Direction{
        public int move; // 몇칸 움직일것인지.
        public boolean tf;// true : 오른쪽 이동, false. : 왼쪽 이동
        
        public Direction(int move,boolean TF){
            this.move = move;
            this.tf = TF;
        }
        
    }
}
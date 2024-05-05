// System.out.println(rank[0]);

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int len = rank.length;
        int[] list= new int[3];
        int count=0;
        for(int i=1;i<=len;i++){
            for (int j=0;j<len;j++){
                if (rank[j]==i){
                    int index = j;
                    
                    if(attendance[index]){
                        if(count<3){
                            list[count]=index;
                            count+=1;
                        }else if(count==3){
                            int answer=list[0]*10000+list[1]*100+list[2];
                            return answer;
                            }   
                        }
                    }
                }
            }
            int answer=list[0]*10000+list[1]*100+list[2];
    return answer;
            
        } 
    
        
    }

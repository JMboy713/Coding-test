import java.util.*;

class Solution {
    
    static Map<String,Integer> standard = new HashMap<>();
    
    
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        mapPlus();
        
        ArrayList<int[]> ans = new ArrayList<>(); 
        int count=0;
        for(int[] subData : data){
            if(ext.equals("code")){
                if (subData[0]<val_ext){
                    ans.add(subData);
                }
            }else if(ext.equals("date")){
                if (subData[1]<val_ext){
                    ans.add(subData);
                }
            }
            else if(ext.equals("maximum")){
                if (subData[2]<val_ext){
                    ans.add(subData);
                }
            }
            else {
                if (subData[3]<val_ext){
                    ans.add(subData);
                }
            }
        }
        Collections.sort(ans, new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            int a= standard.get(sort_by);
                // 오름차순
                return o1[a] - o2[a];
        }
        });
        int[][] answer =new int[ans.size()][];
        int newCount =0;
        for(int[] a : ans){
            
            answer[newCount] = a;
            newCount++;
        }
        return answer;
    }
    
    public static void mapPlus(){
        standard.put("code",0);
        standard.put("date",1);
        standard.put("maximum",2);
        standard.put("remain",3);
    }
}
// 열 -> 컬럼 행 -> 튜플
// 첫번째 열은 PK 값이 중복되지 않음. 
// 해시 함수를 정의함. 

import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        List<int[]> arr = new ArrayList<>();
        for(int[] a : data){
            arr.add(a);
        }
        Collections.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[]b){
                if(a[col-1]==b[col-1]){
                    return b[0]-a[0];
                }else{
                    return a[col-1]-b[col-1];
                }
            }
        });
        
        List<Integer> S_i = new ArrayList<>();
        
        for(int i=row_begin-1;i<row_end;i++){
            int[] list = arr.get(i);
            int Si =0;
            for(int num : list){
                Si+=num%(i+1);
            }
            S_i.add(Si);
        }
        System.out.println(S_i);
        int num = 0;
        for(int i=0;i<S_i.size();i++){
            if(i==0){
                num = S_i.get(i);
            }else{
                num = S_i.get(i) ^ num;
            }
            
        }
        
        
        return num;
    }
}
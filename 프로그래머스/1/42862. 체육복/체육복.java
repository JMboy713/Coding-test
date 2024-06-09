import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer> save = new ArrayList<>();
        ArrayList<Integer> same = new ArrayList<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        ArrayList<Integer> lostList = new ArrayList<>();
        for(int i : lost){
            lostList.add(i);
        }
        ArrayList<Integer> reserveList = new ArrayList<>();
        for(int i : reserve){
            reserveList.add(i);
        }



        

        
        for(int i : lost){
            if (reserveList.contains(i)){
                same.add(i);
            }
        }
        for(int i : same){
            lostList.remove(Integer.valueOf(i));
            reserveList.remove(Integer.valueOf(i));
        }
        for(int i : lostList){
            if(reserveList.contains(i-1)){
                save.add(i);
                reserveList.remove(Integer.valueOf(i-1));
            }else if(reserveList.contains(i+1)){
                save.add(i);
                reserveList.remove(Integer.valueOf(i+1));
            }
        }
        for(int i : save){
            lostList.remove(Integer.valueOf(i));
        }

        return n-lostList.size();
    }
}
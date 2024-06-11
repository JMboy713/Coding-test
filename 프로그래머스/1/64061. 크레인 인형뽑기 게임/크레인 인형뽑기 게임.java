import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> bucket = new ArrayList<>(); // 담을 버킷
        ArrayList<ArrayList<Integer>> newBoard = new ArrayList<>(); // board 를 세로로 정렬할 NewBoard

        
        for(int i=0;i<board.length;i++){
            ArrayList<Integer> lineArr = new ArrayList<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i]!=0){
                    lineArr.add(board[j][i]);    
                }
            }
            newBoard.add(lineArr);
        }// ArrayList로 변경
        
        System.out.println(newBoard);
        
        
        for(int i : moves){
            if(!newBoard.get(i-1).isEmpty()){
                int doll = newBoard.get(i-1).remove(0);
                if(!bucket.isEmpty() && bucket.get(bucket.size()-1)==doll){
                    bucket.remove(bucket.size()-1);
                    answer+=2;
                }else{
                    bucket.add(doll);
                }
            }
            
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        int width = (board[0]-1)/2;
        int height = (board[1]-1)/2;
        // System.out.println(width);
        // System.out.println(height);
        int[] start = new int[]{0,0};
        for(String dir:keyinput){
            if (dir.equals("left")){
                start = left(start,width);
            }else if(dir.equals("right")){
                start = right(start,width);
            }else if(dir.equals("up")){
                start = up(start,height);
            }else{
                start = down(start,height);
            }
        }
        return start;
    }
    
    public int[] left(int[] dot,int maximum){
        if(dot[0]>(maximum*-1)){
            int garo = dot[0]-1;
            int sero = dot[1];
            int[] newdot = new int[]{garo,sero};
            return newdot;
        }else{
            return dot;
        }
    }
    
    public int[] right(int[] dot,int maximum){
        if(dot[0]<(maximum)){
            int[] newdot = new int[]{dot[0]+1,dot[1]};
            return newdot;
        }
        return dot;
    }
    
    public int[] up(int[] dot,int maximum){
        if(dot[1]<(maximum)){
            int[] newdot = new int[]{dot[0],dot[1]+1};
            return newdot;
        }return dot;
    }
    
    public int[] down(int[] dot,int maximum){
        if(dot[1]>(maximum*-1)){
            int[] newdot = new int[]{dot[0],dot[1]-1};
            return newdot;
        }return dot;
    }
}
import java.util.*;

class Solution {
    static int leftHand = 10;
    static int rightHand = 12;
    static int [][] arr={
        {},{0,0}, {0,1},{0,2},
            {1,0}, {1,1}, {1,2},
            {2,0}, {2,1}, {2,2},
            {3,0}, {3,1}, {3,2}
        };
    
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        
        left.add(1);
        left.add(4);
        left.add(7);
        right.add(3);
        right.add(6);
        right.add(9);

        for(int i : numbers){
            if (i==0){
                i=11;
            }
            if (left.contains(i)){
                answer+="L";
                leftHand=i;
            }else if(right.contains(i)){
                answer+="R";
                rightHand=i;
            }else{
                String plus = Manhatten(leftHand,rightHand,i,hand);
                answer+=plus;                
            }
        }
        
        return answer;
    }
    
    public static String Manhatten(int left,int right, int number,String hand){
//         Map<Integer,ArrayList> keyboard = new HashMap<>();
//         int key =1;
//         for(int i=0;i<4;i++){
//             for(int j=0;j<3;j++){
//                 ArrayList<Integer> board = new ArrayList<>();
//                 board.add(j); // 가로
//                 board.add(i); // 세로
//                 keyboard.put(key,board);
//                 key++;    
//             }
//         }
        
        
//         ArrayList<Integer> leftdot = keyboard.get(left);
//         ArrayList<Integer> rightdot = keyboard.get(right);
//         ArrayList<Integer> maindot = keyboard.get(number);
        int[] leftdot = arr[left];
        int[] rightdot = arr[right];
        int[] maindot = arr[number];
        
        
        double leftDistance = distance(leftdot,maindot);
        double rightDistance = distance(rightdot,maindot);
        
        if(leftDistance<rightDistance){
            leftHand = number;
            return "L";
        }else if(leftDistance>rightDistance){
            rightHand = number;
            return "R";
        }else{
            if(hand.equals("left")){
                leftHand = number;
                return "L";
            }else{
                rightHand = number;
                return "R";
            }
        }
        
        
        
    }
    
    // public static double distance(ArrayList<Integer> dot1,ArrayList<Integer> dot2){
    //     int garo = Math.abs(dot1.get(0)-dot2.get(0));
    //     int sero = Math.abs(dot1.get(1)-dot2.get(1));
    //     double dist = Math.sqrt(garo*garo+sero*sero);
    //     return dist;
    // }
    public static int distance(int[] dot1,int[] dot2){
        int garo = Math.abs(dot1[0]-dot2[0]);
        int sero = Math.abs(dot1[1]-dot2[1]);
        return garo+sero;
    }
    
}
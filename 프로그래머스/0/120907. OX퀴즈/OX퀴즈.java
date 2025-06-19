class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i=0;i<quiz.length;i++) {
            String[] math = quiz[i].split(" ");
            int num1 = Integer.parseInt(math[0]);
            int num2 = Integer.parseInt(math[2]);
            int num3 = Integer.parseInt(math[4]);
            
            if (math[1].equals("+")) {
                if (num1 + num2 == num3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";   
                }
            } else if(math[1].equals("-")) {
                if (num1 - num2 == num3) {
                    answer[i] = "O";
                } else{
                    answer[i] = "X";  
                } 
            }
        }
        return answer;
    }
}
class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture.length*k;
        String[] answer = new String[len];
        System.out.print(answer.length);
        int count=0;
        for(String line :picture){
            String newLine ="";
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i); 
                for(int j =0;j<k;j++){
                    newLine+=c;    
                }
            }
            for(int j =0;j<k;j++){
                answer[count]=newLine;
                count+=1;
            }
        }
        return answer;
    }
}
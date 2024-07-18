class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String numbers = "";
        int num = 0;
        while(numbers.length()<m*t){
            String s = Integer.toString(num,n);// n진법    
            numbers+=s.toUpperCase();
            num++;
        }        
        System.out.println(numbers);
        int count=0;// 미리 구할 숫자개수
        int index =0;// 구해야하는 숫자를 꺼낼 index
        int order = 1;
        while(count<t){
            int compare = (order%m);
            if(compare == 0){
                compare = m;
            }
            if(compare==p){
                answer+=numbers.charAt(index);
                count++;
            }
            index++;
            order++;
        }
        
        

        return answer;
    }
    
}
class Solution{
    public int solution(int n, int a, int b){
        // int answer = 0;
        // if(a<b){
        //     answer=match(a,b);
        // }else{
        //     answer=match(a,b);
        // }

        return a<b ? match(a,b) : match(b,a);
    }
    public static int match(int a,int b){// b가 더 크다. 
        int count = 1;
        while(a+1!=b || a%2!=1){ // a가 짝수이면
            count++;
            if(a%2==1){// a 가 홀수 일 때
                a+=1;
            }
            if(b%2==1){
                b+=1;
            }
            a=a/2;
            b=b/2;
        }
        return count;
        
    }
}




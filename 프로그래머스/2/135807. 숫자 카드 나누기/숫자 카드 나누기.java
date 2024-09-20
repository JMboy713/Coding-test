// 하나씩 적힌 카드를 절반씩 나누어 가짐. 
// 가장 큰 양의 정수 a의 값. 
// 첤후가 가진 카드를 모두 나눌 수 있고, 영희가 가진 카드에 적힌 숫자중 하나도 못나누는 양의 정수. 
// 거꾸로. 

// 최대 공약수 구하기. 

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int a = arrayA[0];
        int b = arrayB[0];
        
        for(int i : arrayA){
            a = getGCD(a,i);
        }
        
        for(int i : arrayB){
            b = getGCD(b,i);
        }
        boolean DivB;
        boolean DivA;
        if(a==1){
            DivB = true;           
        }else{
            DivB = canDivide(arrayB,a);
        }
        
        if(b==1){
            DivA = true;
        }else{
            DivA = canDivide(arrayA,b);        
        }
        

        if(!DivA && !DivB){
            return Math.max(a,b);
        }else if(DivA && !DivB){
            return a;
        }else if(DivB && !DivA){
            return b;
        }else{
            return 0;
        }
        
        
        
        
        
     
    }
    
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
    
    
    public boolean canDivide(int[] array , int num){
        boolean canDivide = false;
        if(num!=1){
            for(int i : array){
                if(i%num==0){
                    canDivide = true;
                }
            }
        }
        return canDivide;
    }
}
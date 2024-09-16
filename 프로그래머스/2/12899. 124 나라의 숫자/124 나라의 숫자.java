// dp 처럼 풀 수 있을까? 
import java.util.*;


class Solution {
    public String solution(int n) {
       StringBuilder answer = new StringBuilder();
        while (n > 0) {
            int remainder = n % 3;
            n /= 3;
            if (remainder == 0) {
                answer.insert(0, '4');
                n -= 1;  // 3의 배수에서 발생하는 특수 케이스 처리
            } else if (remainder == 1) {
                answer.insert(0, '1');
            } else if (remainder == 2) {
                answer.insert(0, '2');
            }
        }
        return answer.toString();
       
    }
}



/*
6 -> 몫 2 나머지 0 
2-> 2 몫 0 나머지 2
=>1 4
*/
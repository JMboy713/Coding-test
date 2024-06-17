import java.util.stream.*;

class Solution {
    public int solution(String s) {
        String number = s.startsWith("-") ? s.substring(1) : s.startsWith("+") ? s.substring(1) : s;
        
        return (s.startsWith("-") ? -1 : 1) * number.chars()
            .map(Character::getNumericValue)
            .reduce(0, (a, b) -> a * 10 + b);
    }
}
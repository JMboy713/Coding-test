import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger anum = new BigInteger(a);
        BigInteger bnum = new BigInteger(b);
        BigInteger ans = anum.add(bnum);
        StringBuilder sb = new StringBuilder();
        sb.append(ans);
        
        return sb.toString();
    }
}
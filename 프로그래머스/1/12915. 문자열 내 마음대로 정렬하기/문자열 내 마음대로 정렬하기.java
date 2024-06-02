import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String[] solution(String[] strings, int n) {


        Arrays.sort(strings, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.charAt(n) > o2.charAt(n)) {
                            return 1;
                        } else if (o1.charAt(n) < o2.charAt(n)) {
                            return -1;
                        } else if (o1.charAt(n) == o2.charAt(n)) {
                            return o1.compareTo(o2);
                        }
                        return 0;
                    } // End Override
                } // End AnnoymousObject
        );
        return strings;
    } // End solution Method
} // End class
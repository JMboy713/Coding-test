import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        // 필요한 값들을 담기 위한 ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // 주어진 범위 내에서 필요한 값만 계산해서 ArrayList에 추가
        for (long i = left; i <= right; i++) {
            int row = (int) (i / n);
            int col = (int) (i % n);
            arr.add(Math.max(row, col) + 1);
        }

        // ArrayList를 Stream을 사용하여 int[]로 변환
        int[] ans = arr.stream().mapToInt(Integer::intValue).toArray();

        return ans;
    }
}

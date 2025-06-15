import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);  // 오름차순 정렬
        int height = park.length;
        int width = park[0].length;

        // 큰 것부터 순회
        for (int idx = mats.length - 1; idx >= 0; idx--) {
            int len = mats[idx];
            boolean canPlace = false;

            for (int y = 0; y <= height - len; y++) {
                for (int x = 0; x <= width - len; x++) {
                    boolean isSquare = true;

                    for (int dy = 0; dy < len; dy++) {
                        for (int dx = 0; dx < len; dx++) {
                            if (!park[y + dy][x + dx].equals("-1")) {
                                isSquare = false;
                                break;
                            }
                        }
                        if (!isSquare) break;
                    }

                    if (isSquare) {
                        canPlace = true;
                        break;
                    }
                }
                if (canPlace) break;
            }

            // 이 크기를 못 놓는다면 return
            if (canPlace) return len;
        }

        return -1; // 모든 크기 다 놓을 수 있음
    }
}

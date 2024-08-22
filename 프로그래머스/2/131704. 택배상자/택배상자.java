import java.util.*;

class Solution {
    public int solution(int[] order) {
        List<Integer> truck = new ArrayList<>();
        Deque<Integer> belt = new ArrayDeque<>(); // 컨테이너 벨트
        
        // 벨트에 1부터 n까지의 상자를 추가
        for (int i = 1; i <= order.length; i++) {
            belt.add(i);
        }
        
        Deque<Integer> subBelt = new LinkedList<>(); // 보조 컨테이너 벨트 (스택)
        
        for (int box : order) {
            // 보조 벨트에서 먼저 확인하여 상자를 트럭에 실을 수 있는지 확인
            if (!subBelt.isEmpty() && subBelt.getFirst() == box) {
                truck.add(box);
                subBelt.removeFirst();
                continue;
            }
            
            // 벨트에서 상자를 확인하여 트럭에 실을 수 있는지 확인
            while (!belt.isEmpty() && belt.getFirst() != box) {
                subBelt.addFirst(belt.removeFirst()); // 순서가 맞지 않으면 보조 벨트로 이동
            }
            
            // 만약 벨트에서 상자를 찾았다면 트럭에 실음
            if (!belt.isEmpty() && belt.getFirst() == box) {
                truck.add(box);
                belt.removeFirst();
            }
            // 벨트에서 더 이상 상자를 찾을 수 없고, subBelt에서도 찾을 수 없을 때
            else if (belt.isEmpty() || (belt.getFirst() != box && subBelt.isEmpty())) {
                break; // 더 이상 상자를 실을 수 없으므로 루프를 중단
            }
        }
        
        return truck.size(); // 트럭에 실린 상자의 개수 반환
    }
}

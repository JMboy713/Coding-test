import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // HashMap을 이용해 전화번호를 저장
        Map<String, Integer> map = new HashMap<>();
        for (String phone : phone_book) {
            map.put(phone, 1);
        }

        // 각 전화번호의 접두사가 HashMap에 존재하는지 확인
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (map.containsKey(phone.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}

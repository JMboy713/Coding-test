// 캐시 크기 앞에 만큼 의 List에서 도시 이름이 있는지 확인한다. 
// queue의 자료구조를 사용하면 된다.
import java.util.*;


class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize==0){
            return cities.length*5;
        }
        int answer = 0;
        ArrayDeque<String> cache = new ArrayDeque<>();
        for(String str : cities){
            String city = str.toUpperCase();
            if (cache.contains(city)){
                answer+=1;
                cache.remove(city);
                cache.addLast(city);
            }else{
                answer+=5;
                if(cache.size()>=cacheSize){
                    cache.pollFirst();
                    cache.addLast(city);
                }else{
                    cache.addLast(city);
                }
            }
            // System.out.println(cache);
        }
        return answer;
    }
}


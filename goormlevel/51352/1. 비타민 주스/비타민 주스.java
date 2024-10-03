import java.io.*;
import java.util.*;



// hashmap을 통해 풀자
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Map<String,Integer> juiceMap = new HashMap<>();
		
		int n = Integer.parseInt(input);
		for(int i=0;i<n;i++){
			String a = br.readLine();
			String[] j = a.split(" ");
			int c = Integer.parseInt(j[0]);
			char[] list = j[1].toCharArray();
			Arrays.sort(list);			
      String vitaminCombo = new String(list); // 정렬된 비타민 조합
			
			juiceMap.put(vitaminCombo,Math.min(c,juiceMap.getOrDefault(vitaminCombo,Integer.MAX_VALUE)));

		}
		
		int minCost = Integer.MAX_VALUE;
		 // 주스를 1개만 사용하는 경우 (모든 비타민 포함하는 경우)
        if (juiceMap.containsKey("ABC")) {
            minCost = Math.min(minCost, juiceMap.get("ABC"));
        }

        // 주스를 2개 조합해서 사용하는 경우
        if (juiceMap.containsKey("AB") && juiceMap.containsKey("C")) {
            minCost = Math.min(minCost, juiceMap.get("AB") + juiceMap.get("C"));
        }
        if (juiceMap.containsKey("AC") && juiceMap.containsKey("B")) {
            minCost = Math.min(minCost, juiceMap.get("AC") + juiceMap.get("B"));
        }
				if (juiceMap.containsKey("AC") && juiceMap.containsKey("AB")) {
            minCost = Math.min(minCost, juiceMap.get("AC") + juiceMap.get("AB"));
        }
				if (juiceMap.containsKey("AC") && juiceMap.containsKey("BC")) {
            minCost = Math.min(minCost, juiceMap.get("AC") + juiceMap.get("BC"));
        }
				if (juiceMap.containsKey("AB") && juiceMap.containsKey("BC")) {
            minCost = Math.min(minCost, juiceMap.get("AB") + juiceMap.get("BC"));
        }
        if (juiceMap.containsKey("BC") && juiceMap.containsKey("A")) {
            minCost = Math.min(minCost, juiceMap.get("BC") + juiceMap.get("A"));
        }

        // 주스를 3개 조합해서 사용하는 경우
        if (juiceMap.containsKey("A") && juiceMap.containsKey("B") && juiceMap.containsKey("C")) {
            minCost = Math.min(minCost, juiceMap.get("A") + juiceMap.get("B") + juiceMap.get("C"));
        }
		
		
		
		if(minCost== Integer.MAX_VALUE){
			System.out.println(-1);
		}else{
			System.out.println(minCost);		
		}
		
		
		
		
	}
}
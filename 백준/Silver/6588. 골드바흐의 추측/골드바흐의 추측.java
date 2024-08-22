import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int maxInput = 0;

        // 입력 받기
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            } else {
                list.add(num);
                if (num > maxInput) {
                    maxInput = num;
                }
            }
        }

        // 에라토스테네스의 체를 사용한 소수 구하기
        boolean[] isPrime = sieveOfEratosthenes(maxInput);
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= maxInput; i++) {
            if (isPrime[i]) {
                primeList.add(i);
            }
        }

        // 결과 출력
        for (int n : list) {
            boolean found = false;
            for (int i = 0; i < primeList.size(); i++) {
                int p1 = primeList.get(i);
                if (p1 > n / 2) break; // 중복 계산 방지
                int p2 = n - p1;
                if (isPrime[p2]) {
                    System.out.println(n + " = " + p1 + " + " + p2);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }

    // 에라토스테네스의 체로 소수 판별
    public static boolean[] sieveOfEratosthenes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}

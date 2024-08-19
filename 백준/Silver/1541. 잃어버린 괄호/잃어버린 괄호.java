
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();

        int answer = 0;
        boolean subtract = false;

        StringTokenizer st = new StringTokenizer(line, "+-", true);

        while (st.hasMoreTokens()) {
            String token = st.nextToken().trim();

            if (token.equals("-")) {
                subtract = true;
            } else if (token.equals("+")) {
                continue;
            } else {
                int num = Integer.parseInt(token);
                if (subtract) {
                    answer -= num;
                } else {
                    answer += num;
                }
            }
        }

        System.out.println(answer);
        br.close();
    }
}

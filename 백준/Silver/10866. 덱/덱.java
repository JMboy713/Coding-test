

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] move = br.readLine().split(" ");

            if (move[0].equals("push_back")) {
                deque.addLast(Integer.valueOf(move[1]));
            } else if (move[0].equals("push_front")) {
                deque.addFirst(Integer.valueOf(move[1]));
            } else if (move[0].equals("pop_front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                }else{
                    Integer num = deque.pollFirst();
                    System.out.println(num);
                }
            } else if (move[0].equals("pop_back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                }else{
                    Integer poll = deque.removeLast();
                    System.out.println(poll);
                }
            } else if (move[0].equals("size")) {
                System.out.println(deque.size());
            } else if (move[0].equals("empty")) {
                if (deque.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            } else if (move[0].equals("front")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                }else {
                    System.out.println(deque.peekFirst());
                }
            } else if (move[0].equals("back")) {
                if (deque.isEmpty()) {
                    System.out.println(-1);
                }else {
                    System.out.println(deque.peekLast());
                }
            }
        }


    }

}

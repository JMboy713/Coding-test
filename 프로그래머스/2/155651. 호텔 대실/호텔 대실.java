import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;

        List<Book> list = new ArrayList<>();

        for (String[] books : book_time) {
            String st = books[0];
            String en = books[1];
            String[] stList = st.split(":");
            int startTime = translate(stList[0], stList[1]);
            String[] enList = en.split(":");
            int endTime = translate(enList[0], enList[1]);
            Book book = new Book(startTime, endTime);
            list.add(book);
        }

        // 시작 시간 기준으로 정렬
        Collections.sort(list);

        // 종료 시간을 기준으로 우선순위 큐 사용 (10분 추가 고려)
        PriorityQueue<Book> priorityQueue = new PriorityQueue<>((a, b) -> a.end - b.end);

        for (Book book : list) {
            // 큐가 비었으면 추가
            if (priorityQueue.isEmpty()) {
                priorityQueue.add(book);
            } else {
                // 큐의 가장 빠른 종료 시간 + 10분보다 현재 시작 시간이 크면 하나 제거
                if (priorityQueue.peek().end + 10 <= book.start) {
                    priorityQueue.poll();
                }
                // 현재 예약 추가
                priorityQueue.add(book);
            }
        }

        // 큐에 남아있는 요소 개수가 필요한 방 개수
        return priorityQueue.size();
    }

    public int translate(String a, String b) {
        return Integer.parseInt(a) * 60 + Integer.parseInt(b);
    }

    class Book implements Comparable<Book> {
        public int start;
        public int end;

        public Book(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Book o) {
            if (this.start != o.start) {
                return this.start - o.start;
            }
            return this.end - o.end;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}

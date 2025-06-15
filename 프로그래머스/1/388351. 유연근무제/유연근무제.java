class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for (int idx = 0;idx < schedules.length; idx++) {
            boolean isLate = false;
            
            int day          = startday;
            int goalhour     = schedules[idx] / 100;
            int goalmininute = schedules[idx] % 100;
            // 목표 출근 시간
            int goal = goalhour * 60 + goalmininute;
            
            for (int logs : timelogs[idx]) {
                if (day == 6 || day == 7) {
                    day = (day+1) % 8 + (day+1) / 8;
                    continue;
                } else {
                    int logtime = (logs / 100) * 60 + logs % 100;
                    if (goal+10 < logtime) {
                        isLate = true;
                    }
                    day++;
                }
            }
            if (!isLate) answer++;
        }
        return answer;
    }
}
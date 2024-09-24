import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        List<String[]> li = new ArrayList<>();
        
        // 입력 멜로디에서 # 처리를 미리 해줍니다.
        m = convertMelody(m);
        
        for (String music : musicinfos) {
            String[] list = music.split(",");
            String start = list[0];
            String end = list[1];
            String name = list[2];
            String sound = list[3];
            
            // 재생된 음악에서도 # 처리를 해줍니다.
            sound = convertMelody(sound);
            
            String[] ans = beforeSong(m, start, end, name, sound);
            li.add(ans);
        }
        
        int max = 0;
        for (String[] a : li) {
            System.out.println(a[0]+""+a[1]);
            if (!a[1].equals("0")) {
                int num = Integer.parseInt(a[1]);
                if (num > max) {
                    max = num;
                    answer = a[0];
                }
            }
        }
        
        return max == 0 ? "(None)" : answer;
    }
    
    // #이 붙은 음표를 다른 문자로 변환해주는 함수
    public String convertMelody(String melody) {
        return melody.replace("C#", "c")
                     .replace("D#", "d")
                     .replace("F#", "f")
                     .replace("G#", "g")
                     .replace("A#", "a");
    }
    
    public String[] beforeSong(String m, String start, String end, String name, String sound) {
        String[] startTime = start.split(":");
        String[] endTime = end.split(":");
        int hour = Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0]);
        int minute = Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]);
        int time = hour * 60 + minute;
        
        // 실제 재생된 음악을 time 길이만큼 반복해서 저장
        StringBuilder fullSound = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < time; i++) {
            fullSound.append(sound.charAt(idx));
            if (idx + 1 < sound.length() && sound.charAt(idx + 1) == '#') {
                fullSound.append(sound.charAt(idx + 1));
                idx++;  // '#' 문자를 포함한 음을 하나로 취급
            }
            idx = (idx + 1) % sound.length();  // 음이 끝나면 처음부터 다시 시작
        }

        // 재생된 음악에서 변환된 멜로디(m)가 있는지 확인
        String playedSound = fullSound.toString();
        if (playedSound.contains(m)) {
            return new String[]{name, time + ""};
        } else {
            return new String[]{"(None)", "0"};
        }
    }
}

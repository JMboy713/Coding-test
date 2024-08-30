import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        
        List<File> fileList = new ArrayList<>();
        
        for(String file : files){
            int idx = 0;
            String component = "";
            String head = "";
            String number = "";
            String tail = "";
            for(char str : file.toCharArray()){
                if(Character.isDigit(str)){ // 숫자면
                    if(idx ==0){// idx 가 0이었다면, 
                        head = component; // head에 컴포넌트를 넣는다. 
                        component ="";// 컴포넌트 초기화
                        idx=1;// idx 를 1로 바꿈. 
                    }
                    
                    if(idx ==1){ // 1이 그걸 받음. 
                        if(number.length()<5){ // 길이 5이하일 경우에만 추가. 
                            number+=str;    
                        }
                        else{ // 그게 아니라면  idx를 2로 바꿈.
                            idx+=1;
                            component+=str; // component 초기화
                        }
                    }else if(idx==2){
                        component+=str;
                    }
                    
                }else{
                    if(idx ==1){
                        idx =2;
                    }

                    component+=str;
                }
            }
            tail = component;
            File f = new File(head,number,component);
            fileList.add(f);
            
        }
        
        Collections.sort(fileList);
        System.out.println(fileList);

        String[] answer = new String[fileList.size()];
        for(int i=0;i<fileList.size();i++){
            String ans = fileList.get(i).toString();
            answer[i]=ans;
        }
        return answer;
    }
}

class File implements Comparable<File>{
    private String head;
    private String number;
    private String tail;
    
    public File(String head,String number,String tail){
        this.head = head;
        this.number = number;
        this.tail = tail;
    }
    
    public String getHead(){
        return this.head;
        // return low;
    }
    
    public int getNumber(){
        return this.number.isEmpty() ? 0 : Integer.parseInt(this.number);
    }
    

    
    @Override
    public String toString(){
        return head+number+tail;
    }
    
    @Override
    public int compareTo(File file) {
        int headComparison = this.getHead().compareToIgnoreCase(file.getHead());
    
        if (headComparison == 0) {
            // If the head strings are equal, compare the numbers
            return Integer.compare(this.getNumber(), file.getNumber());
        } else {
            return headComparison;
        }
    }

}


// import java.util.*;

// class Solution {
//     public String[] solution(String[] files) {
        
//         List<File> fileList = new ArrayList<>();
//         for (String file : files) {
//             String head = "";
//             String number = "";
//             String tail = "";
//             int idx = 0;
//             int n = file.length();

//             // head 추출
//             while (idx < n && !Character.isDigit(file.charAt(idx))) {
//                 head += file.charAt(idx);
//                 idx++;
//             }

//             // number 추출
//             while (idx < n && Character.isDigit(file.charAt(idx))) {
//                 number += file.charAt(idx);
//                 idx++;
//             }

//             // tail 추출 (남은 부분)
//             if (idx < n) {
//                 tail = file.substring(idx);
//             }

//             fileList.add(new File(head, number, tail));
//         }
        
//         // 리스트 정렬
//         Collections.sort(fileList);

//         // 정렬된 리스트를 다시 문자열 배열로 변환
//         String[] answer = new String[fileList.size()];
//         for (int i = 0; i < fileList.size(); i++) {
//             answer[i] = fileList.get(i).toString();
//         }
        
//         return answer;
//     }
// }

// class File implements Comparable<File> {
//     private String head;
//     private String number;
//     private String tail;
    
//     public File(String head, String number, String tail) {
//         this.head = head;
//         this.number = number;
//         this.tail = tail;
//     }
    
//     public String getHead() {
//         return this.head.toLowerCase(); // 대소문자 구분 없는 비교
//     }
    
//     public int getNumber() {
//         return this.number.isEmpty() ? 0 : Integer.parseInt(this.number);
//     }

//     @Override
//     public String toString() {
//         return head +","+ number +","+ tail; // 원래 파일명 형태로 반환
//     }
    
//     @Override
//     public int compareTo(File other) {
//         int headComparison = this.getHead().compareTo(other.getHead());
//         if (headComparison == 0) {
//             return Integer.compare(this.getNumber(), other.getNumber());
//         }
//         return headComparison;
//     }
// }

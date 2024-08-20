import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        
        String[] skillTree = skill.split(""); // 스킬트리를 split
        
        List<String> ST = new ArrayList<>(); // 가능한 스킬트리 넣을 list
        
        List<String> list = new ArrayList<>(); //c,b,d 나눌 리스트
        
        ST.add("");
        for(String sk : skillTree){
            if(ST.isEmpty()){// 없으면 그냥 넣고
                ST.add(sk);    
            }else{
                String str = ST.get(ST.size()-1);// 안에 있다면 맨 뒤에꺼 꺼내서 뒤에 문자 붙혀서 추가
                String newst = str+sk;
                ST.add(newst);
            }
            list.add(sk);// c,b,d 넣는 줄
        }
        System.out.println(ST);
        
        
        
        List<String> newlist = new ArrayList<>();// cbd를 제외한 문자들을 제거한 skill_trees를 만들것
        
        
        for(String st : skill_trees){
            String newSt ="";
            for(char c : st.toCharArray()){
                if(list.contains(c+"")){
                    newSt= newSt+c;
                }
            }
            newlist.add(newSt);
        }
        
        int answer =0;
        
        
        for(String str : newlist){
            if(ST.contains(str)){
                answer++;
            }
        }
        
        
        
        
        return answer;
    }
}
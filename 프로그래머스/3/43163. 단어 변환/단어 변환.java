// 단어를 한글자씩 비교해서 다른 개수를 구하고, 다른 개수가 1일 경우에만 change 한다. answer 에 1 추ㅏ
// words 끼리의 그래프를 만들어야 한다...?
// dfs

import java.util.*;


class Solution {
    class Node{
        String word;
        int count;
        public Node(String word,int count){
            this.word = word;
            this.count = count;
        }
    }
    
    
    
    public int solution(String begin, String target, String[] words) {
         
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(begin,0));
        boolean[] visited = new boolean[words.length];
        
        
        while(!queue.isEmpty()){
            Node currentNode = queue.poll();
            String currentWord = currentNode.word;
            int count = currentNode.count;
            
            if(currentWord.equals(target)){// 같으면 탈출
                return count;
            }
            for(int i=0;i<words.length;i++){
                if(canTransform(currentWord,words[i])&&visited[i]==false){
                    visited[i]=true;
                    queue.add(new Node(words[i],count+1));
                }
            }
            
            
            // for(String word : words){
            //     if(canTransform(currentWord,word)){
            //         queue.add(new Node(word,count+1));
            //     }
            // }
            
        }

        return 0;
    }
    
    public boolean canTransform(String w1,String w2){
        int diffCount =0;
        for(int i=0;i<w1.length();i++){
            if(w1.charAt(i)!=w2.charAt(i)){
                diffCount++;
            }
        }
        return diffCount==1 ? true : false;
    }
}
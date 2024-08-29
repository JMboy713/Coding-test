import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<User> list = new ArrayList<>();
        Map<String,String> nameList = new HashMap<>();
        
        
        for(String rec : record){
            String [] str = rec.split(" ");
            if(str[0].equals("Change")){
                nameList.put(str[1],str[2]);
            }else if(str[0].equals("Enter")){
                nameList.put(str[1],str[2]);
                User user = new User(str[0],str[1]);
                list.add(user);
            }else{
                User user = new User(str[0],str[1]);
                list.add(user);
            }
        }

        String[] answer = new String[list.size()];
        for(int i = 0;i<list.size();i++){
            User user = list.get(i);
            String name = nameList.get(user.getUuid());
            String move = user.getMove();
            if(move.equals("Enter")){
                answer[i]=name+"님이 들어왔습니다.";
            }else{
                answer[i]=name+"님이 나갔습니다.";
            }
        }
        
        
        return answer;
    }
}
class User{
    private String move;
    private String uuid;


    public User(String move, String uuid){
        this.move = move;
        this.uuid = uuid;

    }
    
    public String getUuid(){
        return this.uuid;
    }
    
    public String getMove(){
        return this.move;
    }


    
    public void setUuid(String uuid){
        this.uuid = uuid;
    }
    
    public void setMove(String move){
        this.move = move;
    }

    @Override
    public String toString(){
        return uuid+","+move;
    }
    

    
    
}
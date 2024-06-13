class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id=level1(new_id);
        new_id=level2(new_id);
        new_id=level3(new_id);
        new_id=level4(new_id);
        new_id=level5(new_id);
        new_id=level6(new_id);
        new_id=level7(new_id);
        
        return new_id;
    }
    
    public String level1(String id){
        id = id.toLowerCase();
        return id;
    }
    public String level2(String id){
        char[] arr = id.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char alp : arr){
            if (alp>='a' && alp<='z'){
                sb.append(alp);
            }else if(alp=='.' || alp=='_'|| alp=='-'){
                sb.append(alp);
            }else if(alp>='0' && alp<='9'){
                sb.append(alp);
            }
        }
        return sb.toString();
    }
    
    public String level3(String id){
        while(id.contains("..")){
            id=id.replace("..",".");    
        }
        return id;
    }
    public String level4(String id){
        while(id.startsWith(".")){
            id=id.substring(1);
        }
        while(id.endsWith(".")){
            id=id.substring(0,id.length()-1);
        }
        return id;
    }
    public String level5(String id){
        if(id.equals("")){
            id="a";
        }
        return id;
    }
    public String level6(String id){
        if(id.length()>=16){
            id=id.substring(0,15);
        }
        if(id.endsWith(".")){
            id=id.substring(0,id.length()-1);
        }
        return id;
    }
    public String level7(String id){
        StringBuilder sb = new StringBuilder();
        if(id.length()<=2){
            sb.append(id);
            for(int i=id.length();i<3;i++){
            char plus = id.charAt(id.length()-1);
            sb.append(plus);
            }
            return sb.toString();
        }
        return id;
    }
    
    
}
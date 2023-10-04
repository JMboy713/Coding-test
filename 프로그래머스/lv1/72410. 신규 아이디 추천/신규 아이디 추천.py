def solution(new_id):
    new_id=new_id.lower() # 1단계
    ID=''
    for i in new_id: #2단계
        if i.isdigit() or i.islower() or i in ['-','_','.']:
            ID+=i
    
    while '..' in ID: #3단계
        ID=ID.replace('..','.')
    
    ID=ID.strip('.') #4단계
    
    if ID=='': #5단계
        ID+='a'
    
    
    if len(ID)>=16:# 6단계
        ID=ID[:15]
        ID=ID.strip('.')
    
    if len(ID)<3: #7단계
        while len(ID)<3:
            ID=ID+ID[-1]
    
    return ID
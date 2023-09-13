def solution(s):
    answer=0
    for i in s:
        if i=='(':
            answer+=1
        else:
            answer-=1
        if answer==-1:
            return False
    if answer==0:
        return True
    else:
        return False
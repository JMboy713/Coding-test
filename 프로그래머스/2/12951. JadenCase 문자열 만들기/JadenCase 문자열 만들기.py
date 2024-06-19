def solution(s):
    s=s.lower()
    s=s.title()
    answer=''
    answer+=s[0]
    for i in range(len(s)-1):
        if s[i].isdigit():
            answer+=s[i+1].lower()
        else:
            answer+=s[i+1]
    return answer
        

    
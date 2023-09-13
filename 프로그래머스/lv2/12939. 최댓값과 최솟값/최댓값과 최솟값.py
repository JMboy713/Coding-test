def solution(s):
    s=s.split()
    number=[]
    for i in s:
        number.append(int(i))
    answer=''
    answer+=str(min(number))
    answer+=' '
    answer+=str(max(number))
    return answer
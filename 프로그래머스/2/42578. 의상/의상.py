# 경우의 수 각자 1개 씩 입는거 + 경우의 수들을 곱하는 것..
# 하지만 옷을 아무것도 입지 않는 것은 되지 않기 때문에 전체 경우의 수에서 -1 한다. 

def solution(clothes):
    result={}
    for i in clothes:
        if result.get(i[1],0):
            result[i[1]]+=1
        else:
            result[i[1]]=1
    vals=list(result.values())
    result=1
    for i in vals:
        result*=(i+1)
    
    return result-1

# (개수 +1 ( 아무것도 안입는다)) * (1+1)* (1+1)* (1+1)  -1 ( 아무도 안입은 경우)


# 3개라면?
# 1,1,1,0

# 2개 1개 
# 피로도를 사용해 던전을 탐험 
# 시작할때 최소 필요 피로도, 끝났을때 소모되는 소모 피로도. 
# 최소 필요 피로도가 높고, 소모 피로도가 낮은 순서대로 들어가야 많이 탐험할 수 있다. 

from itertools import permutations

def solution(k, dungeons):
    perm=permutations(dungeons,len(dungeons))
    ans=0
    for i in perm:
        result=0
        limit=k
        for j in i:
            if limit>=j[0]:
                result+=1
                limit-=j[1]
        ans=max(ans,result)
    return ans
            
    
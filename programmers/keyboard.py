from collections import deque
def solution(keymap, targets):
    answer = []
    targets=deque(targets)
    while targets!=deque([]):
        target=targets.popleft()
        ans=0
        for i in target:
            count=102
            for j in keymap:
                if i in j:
                    a=(j.index(i)+1)
                    count=min(count,a)
                else:
                    continue
            ans+=count
        if ans!=101:
            answer.append(ans)
        else:
            answer.append(-1)
    return answer
solution(["ABACD", "BCEFD"]	,["ABCD","AABB"])
                    
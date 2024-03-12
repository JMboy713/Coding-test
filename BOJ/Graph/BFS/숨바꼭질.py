# 수빈이는 N에, 동생은 K 에 있다. 
# 수빈이는 걷기, 순간이동 둘중 하나를 할 수 있다. 
# X 일때 걸으면 X+1, X-1 로 이동, 순간이동 -> 2*X 의 위치로 이동.
from collections import deque

N,K = map(int,input().split())

queue = deque()
queue.append(N)
line = [0 for _ in range(100001)]

while queue:
    val=queue.popleft() # 5를 꺼낸다.
    if val==K:
        break
    for j in (val-1,val+1,val*2):
        if 0<=j<100001 and not line[j]:
            line[j]=line[val]+1
            queue.append(j)

    
print(line[K])

    
    
    


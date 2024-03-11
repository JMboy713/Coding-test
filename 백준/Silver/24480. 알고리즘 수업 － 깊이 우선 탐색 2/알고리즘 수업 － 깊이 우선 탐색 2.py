# psuedo code 
# dfs(V, E, R) {  # V : 정점 집합, E : 간선 집합, R : 시작 정점
#     visited[R] <- YES;  # 시작 정점 R을 방문 했다고 표시한다.
#     for each x ∈ E(R)  # E(R) : 정점 R의 인접 정점 집합.(정점 번호를 오름차순으로 방문한다)
#         if (visited[x] = NO) then dfs(V, E, x);
# }
import sys
from collections import deque

# 0번째 인덱스는 더미 인덱스로 사용
N, M, R = map(int, sys.stdin.readline().split())
adj = [[] for _ in range(N+1)] # 리스트 생성. 
for _ in range(M):
    src, dst = map(int, sys.stdin.readline().split())
    # 무방향 그래프. 
    adj[src].append(dst)
    adj[dst].append(src)
for x in range(1, N+1):
    adj[x] = sorted(adj[x]) # 오름차순으로 접근하기 때문에 reverse True.


visited = [0] * (N+1) # No
nodes_cnt = [0] * (N+1) # 방문 순서 넣을 리스트
order = 1  # 방문순서 체크 변수
stack = deque()
stack.append(R)

while stack: # 스택이 비어있지 않다면. 
    cur_node = stack.pop()
    visited[cur_node] = 1 # 방문한 노드를 1로 바꿔준다. 
    if nodes_cnt[cur_node] == 0: # 방문순서가 0 (아직 방문하지 않았다면)
        nodes_cnt[cur_node] = order # 방문 순서 기록
        order += 1 # 방문순서 1 추가.. 

    for next_node in adj[cur_node]: # 인접 노드중 방문하지 않았던 노드를 스택에 넣는다. 
        if visited[next_node] == 0:
            stack.append(next_node)


print(*nodes_cnt[1:])

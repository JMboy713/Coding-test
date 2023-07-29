# from collections import deque

# def bfs(graph,start,visited):
#     queue=deque([start])
#     visited[start]=True
#     while queue:
#         v=queue.popleft()
#         print(v,end='')
#         for i in graph[v]:
#             if not visited[i]:
#                 queue.append(i)
#                 visited[i]=True
                
# graph=[
#     [],
#     [2,3,8],
#     [1,7],
#     [1,4,5],
#     [3,5],
#     [3,4],
#     [7],
#     [2,6,8],
#     [1,7]
# ]

# visited=[False]*9

# bfs(graph,1,visited)

from collections import deque
import sys
input=sys.stdin.readline

# N: 도시의 개수, M=도로의 개수, K=거리정보 (최단거리), X=출발도시의 번호.
N, M, K, X = map(int, input().split())

# 그래프를 넣을 리스트
graph = [[] for _ in range(N + 1)]

# 그래프 그리기
for _ in range(M):
    begin, end = map(int, input().split())
    graph[begin].append(end)

# 거리를 입력할 리스트
distance = [0 for i in range(N + 1)]

# 방문여부를 입력할 리스트
visited = [False] * (N + 1)

# bfs algorithm
def bfs(graph, start, visited, distance):
    queue = deque([(start, 0)])  # 거리를 함께 큐에 저장
    visited[start] = True

    while queue:
        v, count = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                queue.append((i, count + 1))
                visited[i] = True
                distance[i] = count + 1

result = bfs(graph, X, visited, distance)

# 결과 출력
found = False
for i in range(1, N + 1):
    if distance[i] == K:
        print(i, end=' ')
        found = True

if not found:
    print(-1)

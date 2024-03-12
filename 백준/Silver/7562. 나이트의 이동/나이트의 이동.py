from collections import deque
import sys

input = sys.stdin.readline
case = int(input())

dx = [2, 2, -2, -2, 1, 1, -1, -1]
dy = [1, -1, 1, -1, 2, -2, 2, -2]

for _ in range(case):
    i = int(input())
    graph = [[0 for _ in range(i)] for _ in range(i)]
    sx, sy = map(int, input().split())
    destination_x, destination_y = map(int, input().split())

    queue = deque()
    queue.append((sx, sy))
    graph[sy][sx] = 1  # 시작 지점을 방문 처리

    while queue:
        x, y = queue.popleft()

        if x == destination_x and y == destination_y:
            print(graph[y][x] - 1)  # 시작 지점을 1로 했으므로, 결과값에서 1 빼기
            break

        for j in range(8):
            nx = x + dx[j]
            ny = y + dy[j]
            if 0 <= nx < i and 0 <= ny < i and graph[ny][nx] == 0:
                graph[ny][nx] = graph[y][x] + 1
                queue.append((nx, ny))

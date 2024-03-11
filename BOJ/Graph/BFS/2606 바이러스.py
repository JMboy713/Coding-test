from collections import deque
import sys
input=sys.stdin.readline



def bfs(graph,start,visited):
    queue=deque([start])
    visited[start]=True
    count=0
    while queue:
        v=queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                count+=1
                visited[i]=True
    
    return count



if __name__=="__main__":
    computer=int(input())
    connect=int(input())
    graph=[[] for _ in range(computer+1)]
    for _ in range(connect):
        idx,number=map(int,input().split())
        graph[idx].append(number)
        graph[number].append(idx)
    
    visited=[False]*(computer+1)
    print(bfs(graph,1,visited))
from collections import deque




num=int(input())
paper=list(map(int,input().split()))
ballons=[i+1 for i in range(num)]
ballons=deque(ballons)
start=1


print(paper)
answer=[]
while paper!=[]:
    number=paper.pop(0)
    outer=int(start+number)
    out=ballons.pop()
    answer.append(out)
    
print(answer)
    
    
    



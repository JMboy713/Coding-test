N,M=map(int,input().split())

univ=[]
for i in range(N):
    univ.append(list(map(str,input().split())))

PR,PC=int(input().split())

def up(x,y,count):
    if x-1>=0:
        count+=1
        x-=1
        return x,y,count
    else:
        return count
    
def down(x,y,count):
    if x+1<=N-1:
        count+=1
        x+=1
        return x,y,count
    else:
        return count

def left(x,y,count):
    if y-1>=0:
        count+=1
        y-=1
        return x,y,count
    else:
        return count

def right(x,y,count):
    if y+1<=M:
        count+=1
        y+=1
        return x,y,count
    else:
        return count
    
def boizer(x,y):
    first=up(x,y)
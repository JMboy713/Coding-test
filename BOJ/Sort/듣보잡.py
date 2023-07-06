N,M=map(int,input().split())
nolistenandlisten=[]

for i in range(N):
    A=input()
    nolistenandlisten.append(A)
for i in range(M):
    B=input()
    nolistenandlisten.append(B)

nolistenandlisten.sort() # 모두 정렬


answer=[]
for i in range(len(nolistenandlisten)): 
    if i+1==len(nolistenandlisten):
        break
    if nolistenandlisten[i]==nolistenandlisten[i+1]:
        answer.append(nolistenandlisten[i])
print(len(answer))
for i in answer:
    print(i)
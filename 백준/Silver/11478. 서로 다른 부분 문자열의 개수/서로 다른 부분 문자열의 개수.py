import sys

input=sys.stdin.readline

S=input()
length=len(S)
stringset=[]
for i in range(length):
    for j in range(i+1,length):
        stringset.append(S[i:j])
        
answer=set(stringset)
print(len(answer))
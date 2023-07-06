N=int(input())
person=list(map(int,input().split()))
person.sort()
answer=0
wait=0
for i in person:
    wait+=i
    answer+=wait
print(answer)
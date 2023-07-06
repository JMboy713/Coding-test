N=input()
N=N.split('-')
array=[]
for i in N:
    array.append(sum(map(int,i.split('+'))))
answer=array[0]
if len(array)>=2:
    array= array[1:]
    for i in array:
        answer-=i
print(answer)
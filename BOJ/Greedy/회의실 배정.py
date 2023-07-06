N=int(input())
array=[]
for i in range(N):
    start,end=map(int,input().split())
    array.append([start,end])

array.sort(key=lambda x: (x[1], x[0]))


meeting=1
first_meeting_end=array[0][1]
array=array[1:]

for i in array:
    if i[0]>=first_meeting_end:
        meeting+=1
        first_meeting_end=i[1]

print(meeting)



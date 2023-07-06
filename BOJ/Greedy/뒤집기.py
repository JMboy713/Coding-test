import sys

S=sys.stdin.readline().rstrip()

one=0
zero=0
current_number=S[0]

if current_number=='1':
    one+=1
else:
    zero+=1

for i in S:
    if i==current_number and current_number=='0':
        continue
    elif i==current_number and current_number=='1':
        continue
    elif i!=current_number and i=='1':
        one+=1
        current_number=i
    else:
        zero+=1
        current_number=i


print(min(one,zero))
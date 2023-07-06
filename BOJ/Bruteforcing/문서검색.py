first=input()
second=input()

f_len=len(first) # 9
s_len=len(second) # 3
last=f_len-s_len # 6 ( 시작점 )

ans=[]

for start in range(s_len):
    count=0
    while start<last+1:
        if first[start:start+s_len]==second:
            count+=1
            start+=s_len
        else:
            start+=1
    ans.append(count)
print(max(ans))

'''
ababababa -> 9 
aba -> 3
'''
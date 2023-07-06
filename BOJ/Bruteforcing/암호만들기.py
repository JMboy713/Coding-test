# import sys
# from itertools import permutations
# input=sys.stdin.readline



# def recur(num):
#     if num==L:
#         vowel=0
#         consonant=0
#         vow=['a','e','i','o','u']
#         for i in rs:
#             if i in vow:
#                 vowel+=1
#             else:
#                 consonant+=1
#         if vowel>=1 and consonant>=2:
#             print(''.join(map(str,rs)))
#             return
#     for i in range(C):
#         if not rs:
#             if ch[i]==False:
#                 ch[i]=True
#                 rs.append(alp[i])
#                 recur(num+1)
#                 ch[i]=False
#                 rs.pop()
#         else:
#             if ch[i]==False and ord(rs[-1])<ord(alp[i]):
#                 ch[i]=True
#                 rs.append(alp[i])
#                 recur(num+1)
#                 ch[i]=False
#                 rs.pop()
            

# if __name__=="__main__":
#     L,C=map(int,input().split())
#     alp=sorted(map(str,input().split()))
#     rs=[]
#     ch=[False]*(C+1)
#     recur(0)



# candidate=list(permutations(alp,L))
# answer=[]
# for i in candidate:
#     TF=True
#     for j in range(len(i)-1):
#         if ord(i[j])>ord(i[j+1]):
#             TF=False
#             break
#     if TF==True:
#         i=list(i)
#         answer.append(''.join(i))

# print(*answer)


import sys
from itertools import permutations
input=sys.stdin.readline



def recur(num):
    if num==L: # 선
        print(''.join(map(str,rs)))
        return
    for i in range(C):
        if not rs:
            if ch[i]==False:
                ch[i]=True
                rs.append(alp[i])
                recur(num+1)
                ch[i]=False
                rs.pop()
        else:
            if ch[i]==False and ord(rs[-1])<ord(alp[i]):
                ch[i]=True
                rs.append(alp[i])
                recur(num+1)
                ch[i]=False
                rs.pop()
            

if __name__=="__main__":
    L,C=map(int,input().split())
    alp=sorted(map(str,input().split()))
    rs=[]
    ch=[False]*(C+1)
    recur(0)











'''
4 6
a t c i s w


'''
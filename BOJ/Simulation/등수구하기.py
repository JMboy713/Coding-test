import sys

N,new,P=map(int,sys.stdin.readline().split())


ranking=list(map(int,sys.stdin.readline().split()))
ranking=ranking[0:P]

if ranking==[]: # 비어있으면 1등
    print(1)

elif N<P: # 랭킹이 다 안차있으면
    for i in range(len(ranking)): 
        if ranking[i]<new: # 새로 들어온사람이 점수가 더 높다면
            print(i+1) # 그 자리를 그사람이 대신하고 0부터 시작이니까 +1로 랭킹 매김
            break #종료
        elif ranking[i]==new: # 만약 같다면
            print(i+1) # 랭킹이 다 안차있으니까 점수 같은사람하고 등수 같음
            break
        elif ranking[-1]>new: # 만약 맨 마지막보다 등수가 낮다면
            print(len(ranking)+1) # 등수 +1을 출력
            break        
else: # 랭킹이 다 차있는 경우
    if ranking[-1]>new: # 꼴찌보다 등수가 낮다면 -1 출력
        print(-1)
    else: 
        for i in range(len(ranking)): 
            if ranking[i]<new: # 랭킹이 등수안에 들어가면
                print(i+1) # 등수 대체
                break
            else:
                if ranking[i]==new: # 랭킹이 등수안에 들어가는데 같다면
                    if ranking[-1]==new:
                        print(-1)
                        break
                    else:
                        print(i+1)
                        break
                


# import sys
# N,new,P=map(int,sys.stdin.readline().split())

# ranking=sorted(map(int,input().split()),reverse=True)
# ranking.append(new)
# ranking.sort()
# ranking=ranking[0:P]

# if N<P:
#     if ranking.index(new):
#         print(ranking.index(new))
#     else:
#         print(-1)
# else:
#     if ranking[-1]>=new:
#         print(-1)
#     else:
#         print(ranking.index(new))
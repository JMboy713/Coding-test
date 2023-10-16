def solution(lottos, win_nums):
    rank=7
    zeronum=0
    answer=[]
    for i in lottos:
        if i in win_nums:
            rank-=1
        elif i==0:
            zeronum+=1
    if zeronum==0 and rank==7:
        answer.append(6)
        answer.append(6)
    else:
        available_rank=rank-zeronum
        answer.append(available_rank)

        if rank==7:
            rank=6
        answer.append(rank)
    return answer
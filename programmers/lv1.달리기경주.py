def solution(players, callings):
    ranking={}
    for idx,name in enumerate(players):
        ranking[name]=idx

    for i in callings:
        before,call=ranking[i]-1,ranking[i]
        ranking[i]-=1
        ranking[players[before]]+=1


        players[before],players[call]=players[call],players[before]

    return players
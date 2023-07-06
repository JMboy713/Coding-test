N=int(input())
array=[]
for i in range(N):
    a=int(input())
    team=list(map(int,input().split()))
    last_team=max(team)

    over_six=[]
    ranking=[]
    for i in range(1,last_team+1):
        if team.count(i)>=6:
            over_six.append(i)
            ranking.append(0)

    team_rank=dict(zip(over_six,ranking))

    for i in range(len(team)):
        if team[i] in over_six:
            team_rank[team[i]]+=i
            print('i is' ,i)
    print(team_rank)




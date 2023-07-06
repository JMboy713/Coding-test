N=int(input())

TEAM=[]
TIME=[]
for i in range(N):
    team,time=(input().split())
    TEAM.append(int(team))
    TIME.append(time)
Min=48
Sec=00

minute=0
second=0

team1_min=0
team2_min=0
team1_sec=0
team2_sec=0
print(TEAM,TIME)

for i in range(len(TIME)):
    if TEAM[i]==1:
        team1_min+=int(TIME[i][0:2])-minute
        team1_sec+=int(TIME[i][3:])-second
        minute=int(TIME[i][0:2])
        second=int(TIME[i][3:])
    else:
        team2_min+=int(TIME[i][0:2])-minute
        team2_sec+=int(TIME[i][3:])-second
        minute=int(TIME[i][0:2])
        second=int(TIME[i][3:])

print(team1_min,team1_min)
print(team2_min,team2_min)

            

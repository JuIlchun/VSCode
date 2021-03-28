""" ans=[]
k=[]
for i in range(999):
    x=999*i
    y=str(x)
    if (len(y)==6):
        for j in y[::-1]:
            k.append(j)
        if (y[0:2]==k[0:2]):
            ans.append(x)
print(ans) """
""" 
ans=[]
for i in range(20,1000000000):
    cnt=0
    for j in range(1,21):
        if (i%j)==0:
            cnt+=1
        if cnt==20:
            ans.append(i)
print(ans) """


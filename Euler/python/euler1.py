ans=0
for i in range(1,1000):
    if i%3==0 :
        ans+=i
    elif i%5==0 :
        ans+=i
"""     if (i%3==0)and(i%5==0):
        ans-=ans """
print(ans)
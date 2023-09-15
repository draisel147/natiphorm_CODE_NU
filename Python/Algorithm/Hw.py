def Maxcut(d,n):
    f= [0]
    for i in range(0,n+1):
        temp = 9223372036854775807
        j = 0
        m = len(d)
        while j < m and i >= d[j]:
            temp = min(f[i-d[j]],temp)
            j = j+1
        f.append(temp+1)
    return f[n]
d= [2,5,6,9,11] #จำนวนที่ใช้ตัด
n= 20 #จำนวนเชือก(เส้น)
print(Maxcut(d,n))

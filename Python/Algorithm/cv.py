ls = ['X', 'X', 'X', 'O', 'O', 'O']
rs = []
print(ls)
print(rs)

def checkdead(ls):
    count_x = ls.count(len('X'))
    count_o = ls.count(len('O'))

    if count_x > count_o:
        print('เกมส์จบแล้ว')
        
        return True
    elif count_x < count_o:
        return False
    else:
        return False

while not checkdead(ls):
    user_input = input("จำนวนคน: ")
    user_inputlist = user_input.split(',')
    rs.extend(user_inputlist)
    
    print(ls)
    print(rs)

  



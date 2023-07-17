ls = ['X', 'X', 'X', 'O', 'O', 'O']
rs = []
print(ls)
print(rs)

def checkdead(ls):
    count_x = ls.count('X')
    count_o = ls.count('O')

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

    # if user_input == 'X':
    #     ls.remove('X')
    #     rs.append('X')
    # elif user_input == 'O':
    #     ls.remove('O')
    #     rs.append('O')



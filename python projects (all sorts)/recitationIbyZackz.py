import turtle

tr = turtle.Turtle()
sc = turtle.Screen()

ex = 'X'
spots = ['-', '-', '-', '-', '-', '-', '-', '-', '-',]
#fromslides
def draw_grid():
    linez = [
        (-150, 50), (150, 50),
        (-150, -50), (150, -50),
        (-50,150), (-50,-150),
        (50,150), (50, -150)
    ]
    for i in range(0,len(linez),2):
        tr.penup()
        tr.goto(linez[i][0], linez[i][1])
        tr.pendown()
        tr.goto(linez[i+1][0], linez[i+1][1])
    tr.speed(4)
#from slides
def switch():
    global ex
    ex = '0' if ex == 'X' else 'X'
def congrats(x):
    tr.penup()
    tr.goto(0, -300)
    tr.write(x + "wins!", font-('Arial', 32))
    
#fromzack
def findwinner():
    winnerz = [
        (0, 1, 2), (3, 4, 5), (6, 7, 8), 
        (0, 3, 6), (1, 4, 7), (2, 5, 8), 
        (0, 4, 8), (2, 4, 6)
    ]
    for comboz in winnerz:
        if spots[comboz[0]] == spots[comboz[1]] == spots[comboz[2]] !='-':
            victory(spots[comboz[0]])
            return
def victory(x):
    tr.penup()
    tr.goto(0, -300)
    tr.write(f'{x} won da game', font=("Arial", 32))

    # if spots[0] == spots[1] == spots[2] != '-':
    #     tr.penup()
    #     tr.goto(0, -300)
    #     tr.write(spots[0] + " wins!", font=("Arial", 32))
    # elif spots[3] == spots[4] == spots[5] != '-':
    #     tr.penup()
    #     tr.goto(0, -300)
    #     tr.write(spots[3] + " wins!", font=("Arial", 32))
    # elif spots[6] == spots[7] == spots[8] != '-':
    #     tr.penup()
    #     tr.goto(0, -300)
    #     tr.write(spots[6] + " wins!", font=("Arial", 32))
    # elif spots[0] == spots[3] == spots[6] != '-':
    #     tr.penup()
    #     tr.goto(0, -300)
    #     tr.write(spots[6] + " wins!", font=("Arial", 32))
    # elif spots[1] == spots[4] == spots[7] != '-':
    #     tr.penup()
    #     tr.goto(0, -300)
    #     tr.write(spots[1] + " wins!", font=("Arial", 32))
    # elif spots[2] == spots[5] == spots[8] != '-':   
    #     tr.penup()
    #     tr.goto(0, -300)
    #     tr.write(spots[2] + " wins!", font=("Arial", 32))
    # elif spots[0] == spots[4] == spots[8] != '-':
    #     tr.penup()
    #     tr.goto(0, -300)
    #     tr.write(spots[0] + " wins!", font=("Arial", 32))
    # elif spots[2] == spots[4] == spots[6] != '-':
    #     tr.penup()
    #     tr.goto(0, -300)
    #     tr.write(spots[6] + " wins!", font=("Arial", 32))
#ok zack done now bye bye
#fromslides
def process_mouse(x, y):
    global spots
    tr.penup()
    tr.goto(x, y)
    tr.pendown()
    if -150 < x < -50 and 50 < y < 150:
        if spots[0] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[0] = ex
            switch()
            findwinner()
    elif -50 < x < 50 and 50 < y < 150:
        if spots[1] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[1] = ex
            switch()
            findwinner()
    elif 50 < x < 150 and 50 < y < 150:
        if spots[2] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[2] = ex
            switch()
            findwinner()
    elif -150 < x < -50 and -50 < y < 50:
        if spots[3] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[3] = ex
            switch()
            findwinner()
    elif -50 < x < 50 and -50 < y < 50:
        if spots[4] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[4] = ex
            switch()
            findwinner()
    elif 50 < x < 150 and -50 < y < 50:
        if spots[5] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[5] = ex
            switch()
            findwinner()
    elif -150 < x < -50 and -150 < y < -50:
        if spots[6] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[6] = ex
            switch()
            findwinner()
    elif -50 < x < 50 and -150 < y < -50:
        if spots[7] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[7] = ex
            switch()
            findwinner()
    elif 50 < x < 150 and -150 < y < -50:
        if spots[8] == '-':
            tr.write(ex, font=("Arial", 32))
            spots[8] = ex
            switch()
            findwinner()

draw_grid()
sc.onclick(process_mouse)
sc.mainloop()
import turtle
import math
#gonna b makings a diamond prism with a diamond inside
#help from stack and gpt this was new for me! 
wn = turtle.Screen()
wn.bgcolor("black")
logo = turtle.Turtle()
logo.color("white")
def draw(fromz, toz):
    logo.penup()
    logo.goto(fromz)
    logo.pendown()
    logo.goto(toz)
def diamondprism():
    logo.pensize(2)
    cdotz = [(-65, 107), (-130, -107), (0, -200), (130, -107), (65, 107), (0, 200)]
    for i in range(len(cdotz)):
        draw(cdotz[i], cdotz[(i + 1) % len(cdotz)])
        if i % 2 == 0:
            draw(cdotz[i], cdotz[(i + 3) % len(cdotz)])
        cent = [(-65, 0), (0, -107), (65, 0), (0, 107)]
    for i in range(len(cent)):
        draw(cent[i], cent[(i + 1) % len(cent)])

diamondprism()
logo.hideturtle()
wn.mainloop()
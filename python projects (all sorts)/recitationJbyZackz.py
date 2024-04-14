import random
from termcolor import colored
#re group J code by Zack Z
wrds = "braid basis stick smell slump bring crowd offer allow taste medal slant fever match chair chest union think haunt visit"
words = wrds.split(' ')
#1
randomword = words[random.randint(0, len(words)-1)]

#2
for i in range(6):
    #a
    uguess = input('pls put word from list as a guess to answer').lower()
    guess = list(uguess)
    rlist = list(randomword)
    #b
    if uguess == randomword:
        print('success')
        break
    if len(uguess) != 5 or uguess not in words:
        print("not 5 letter word from list.")
        continue
    #c
    displayGuess = ['_'] * len(uguess)
    for x in range(len(guess)):
        if guess[x] == rlist[x]:
            rlist[x] = '0'
            guess[x] = colored(guess[x], 'green')
    for i in range(len(guess)):
        if guess[i] in rlist:
            displayGuess = rlist.index(guess[i])
            rlist[displayGuess] = '0'
            guess[i] = colored(guess[i], 'yellow')
    print(' '.join(guess))
print(f'word was {randomword}')
print('failed, game over')
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z
#re group J code by Zack Z

import random


rounds = 6
current_round = 1
number_of_rolls = 3
dice = random.randint(1,6)
score = 0
bunco_score = 21
round_score = 0
for i in range(1, rounds + 1 ):
    current_round = i
    print('Round ', current_round)
    round_score = 0
    while(True):
        current_score = 0
        dice1 = random.randint(1,6)
        dice2 = random.randint(1,6)
        dice3 = random.randint(1,6)
        print("You rolled ",dice1, dice2, dice3 )
        if((dice1 == current_round) & (dice2 == current_round) & (dice3 == current_round)):
            current_score += 21
            print("BUNCO")
            
        #addedbyzackz
        elif dice1 == dice2 == dice3 and dice3 != current_round and dice1 != current_round and dice2 != current_round:
            current_score += 5
            print("mini bunco ;D")
        else:
            if (dice1 == current_round):
                current_score += 1
            if (dice2 == current_round):
                current_score += 1
            if (dice3 == current_round):
                current_score += 1
        round_score += current_score
        #addedbyzackz
        #addedbyzackz
        #addedbyzackz
        #addedbyzackz
        #addedbyzackz
        #addedbyzackz

        if((round_score <= bunco_score) & (current_score != 0)):
            continue
        else:
            print("your score for this round", current_round, round_score )
            score += round_score
            current_round_score = 0
            break
print("total score", score)

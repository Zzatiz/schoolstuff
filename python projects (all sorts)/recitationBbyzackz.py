import math

numwords = int(input("Please enter the number of words in the sample: "))
numsentences = int(input("Please enter the number of sentences in the sample: "))
numsyllables = int(input("Please enter the number of syllables in the sample: "))
numbwords = int(input("Please enter the number of big words in the sample: "))
numcharz = int(input("Please enter the number of characters in the sample: "))
#zackz waz here
#zackz waz here
#zackz waz here
#zackz waz here

gfix = ((numwords / numsentences) + 100 * (numbwords / numwords)) * 0.4
readease = 206.835 - 1.015 * (numwords / numsentences) - 84.6 * (numsyllables / numwords)
smix = ((int(math.sqrt(numbwords)) + 5) // 10) + 3
arix = 4.71 * (numcharz/numwords) + 0.5 * (numwords/numsentences) - 21.43
print('gun fog index: {:.4f}'.format(gfix))
print('R ease score: {:.4f}'.format(readease))
print("smog Index lev:", smix)
print('auto readability index: {:.4f}'.format(arix))
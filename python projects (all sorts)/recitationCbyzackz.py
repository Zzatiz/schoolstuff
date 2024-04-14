print("menu:\n\n\tadd\n\tsubtract\n\tmultiply\n\tdivide\n\
tfloored division\n\tmod\n\tpower\n\tsquare root\n\tabsolute value\n\tsin\n\tcos\
n")
#copy pasted print menu statement ik ik
op = input('what would u like to do?')
if op == 'add':
    i1 = float(input('\nenter yo first number '))
    i2 = float(input('enter da second:'))
    i3 = i1 + i2
    print(f'{i1} + {i2} = {i3}')
elif op == 'subract':
    i1 = float(input('\nenter yo first number '))
    i2 = float(input('enter da second:'))
    i3 = i1 - i2
    print(f'{i1} - {i2} = {i3}')
elif op == 'multiply':
    i1 = float(input('\nenter yo first number '))
    i2 = float(input('enter da second:'))
    i3 = i1 * i2
    print(f'{i1} x {i2} = {i3}')
elif op == 'divide':
    i1 = float(input('\nenter yo first number '))
    i2 = float(input('enter da second:'))
    i3 = i1 / i2
    print(f'{i1} / {i2} = {i3}')
elif op == 'floor div':
    i1 = float(input('\nenter yo first number '))
    i2 = float(input('enter da second:'))
    i3 = i1 // i2
    print(f'{i1} // {i2} = {int(i3)}')
elif op == 'mod':
    i1 = float(input('\nenter yo first number '))
    i2 = float(input('enter da second:'))
    i3 = i1 % i2
    print(f'{i1} % {i2} = {i3}'
elif op == 'power':
    i1 = float(input('\nenter yo first number '))
    i2 = float(input('enter da second:'))
    i3 = i1 ** i2
    print(f'{i1} ** {i2} = {i3}')
elif op == 'square root':
    i1 = float(input('\nenter yo first number '))
    i3 = math.sqrt(i1)
    print(f'= {i3}')
elif op == 'absolute value':
    i1 = float(input('\nenter yo first number '))
    i3 = abs(i1)
    print(f'= {i3}')
elif op == 'sin':
    i1 = float(input('\nenter yo first number '))
    i3 = math.sin(i1)
    print(f'= {i3}')
elif op == 'cos':
    i1 = float(input('\nenter yo first number '))
    i3 = math.cos(i1)
    print(f'= {i3}')


else: 
    print(f'idk how to {op} sorry')
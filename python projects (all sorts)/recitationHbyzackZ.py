import random

items = []
prices = []
quantities = []
option = 0
def menu():
    print("\nWelcome to Generic E-Commerce Store!\nWhich of the following would you like to do?\n1. Add Item\n2. Update Item\n3. Delete Item\n4. Display Items by Name\n5. Display Items by Total Price\n6. View Cart\n7. Quit\n")
def addi():
    name = input("input name of item to add: ")
    price = float(input("input price of item: "))
    quantity = int(input("input quantity of item to be purchased: "))
    items.append(name)
    prices.append(price)
    quantities.append(quantity)
    
    
def updatei():
    update = input("input name of item to update: ")
    if update in items:
        prices[items.index(update)] = float(input("input new price of the item: "))
        quantities[items.index(update)] = int(input("input new quantity of item: "))
        items[items.index(update)] = update
    else:
        print(f"{update} not found in cart")
    
def deletei():
    deletei = input("input name of item to delete: ")
    if deletei in items:
        prices.pop(items.index(deletei))
        quantities.pop(items.index(deletei))
        items.pop(items.index(deletei))
    else:
        print('not an item')
def sortname():
    sortedis = sorted(zip(items, prices, quantities), x: x[0])
    for item, price, quantity in sortedis:
        print(f'{item} @ {price:.2f} dollars each. Total: ${price * quantity:.2f}')

def sortprice():
    sortedis = sorted(zip(items, prices, quantities), x: x[1] * x[2], reverse=True)
    for item, price, quantity in sortedis:
        print(f'{item} @ {price:.2f} dollars each. Total: ${price * quantity:.2f}')
    
def show():
    sum = 0
    for i in range(len(items)):
        sum += prices[i] * quantities[i]
        print(f"{items[i]} ${prices[i]:.2f} X {quantities[i]} for {prices[i] * quantities[i]:.2f}")

    print(f"total: $$$${sum:.2f}")



while True:
    menu()
    option = int(input("input num of choice: "))
    
    if option == 1:
        addi()
    elif option == 2:
        updatei()
    elif option == 3:
        deletei()
    elif option == 4:
        sortname()
    elif option == 5:
        sortprice()
    elif option == 6:
        show()
    elif option == 7:
        print("bye")
        break
    else:
        print("not a option.")
        
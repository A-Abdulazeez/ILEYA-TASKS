user_items = []
item_quantity = []
item_price = []
totals = []

customer = input("Enter customer name: ")

while True:
    product_name = input("Enter product name: ")
    price = float(input("Enter Item Price: "))
    quantity = int(input("Enter quantity: "))

    total = price * quantity

    user_items.append(product_name)
    item_price.append(price)
    item_quantity.append(quantity)
    totals.append(total)

    choice = input("Add more userItems? (yes/no): ")
    if choice.lower() == "no":
        break

subtotal = sum(totals)
discount = subtotal * 0.10
vat = subtotal * 0.075
bill_total = subtotal - discount + vat

print("\n===== RECEIPT =====")
print(f"Customer name: {customer}")
print("-------------------------")

for index in range(len(user_items)):
    print(f"{user_items[index]} x{item_quantity[index]} @ {item_price[index]} = {totals[index]}")

print("-------------------------")
print(f"Subtotal: {subtotal}")
print(f"Discount: {discount}")
print(f"VAT (7.5%): {vat}")
print(f"Bill Total: {bill_total}")

paid = float(input("Amount Paid: "))
balance = paid - bill_total

print(f"Balance: {balance}")
print("==================")
print("    THANK YOU")
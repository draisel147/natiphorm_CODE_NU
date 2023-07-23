name = input("กรุณาใส่ชื่อ: ")
income = input("กรุณาใส่รายรับ: ")
expenses = input("กรุณาใส่รายจ่าย: ")

print("ชื่อของฉันคือ", name)
print("รายรับของฉันคือ", income, "บาท")
print("รายจ่ายของฉันคือ", expenses, "บาท")

# เพิ่มเงื่อนไขให้โปรแกรมรอรับข้อมูลเพิ่มเติม
more_info = input("ต้องการใส่ข้อมูลเพิ่มเติมหรือไม่? (ใช่/ไม่): ")
if more_info == "ใช่":
    additional_info = input("กรุณาใส่ข้อมูลเพิ่มเติม: ")
    print("ข้อมูลเพิ่มเติม:", additional_info)
else:
    print("ข้อมูลเพิ่มเติม: ไม่มี")

import cv2
import numpy as np


img = cv2.imread("C:\Users\rivai\OneDrive\เดสก์ท็อป\imagechest_xray1.jpeg")
imgresize = cv2.resize(img, None, fx=0.25, fy=0.25)

print("1.เพิ่มค่าความสว่าง")
print("2.ลดความสว่าง")
inputnum = int(input("ใส่ค่าความสว่าง (เลือกตัวเลข):"))

if inputnum == 1:
    print("เพิ่มความสว่าง")
    print("เลือกระดับความสว่าง")
    print("1.น้อย")
    print("2.กลาง")
    print("3.มาก")
    inputmax = int(input("ใส่ค่าความสว่าง (เลือกตัวเลข 1, 2, 3):"))

    if inputmax == 1:
        gamma = 0.8
    elif inputmax == 2:
        gamma = 0.6
    elif inputmax == 3:
        gamma = 0.2
    else:
        print("ระดับความสว่างที่เลือกไม่ถูกต้อง")

    gamma_img = np.array(255 * (imgresize / 255) ** gamma, dtype='uint8')
    cv2.imshow(gamma_img)

elif inputnum == 2:
    print("ลดความสว่าง")
    print("เลือกระดับความสว่าง")
    print("1.น้อย")
    print("2.กลาง")
    print("3.มาก")
    inputmin = int(input("ใส่ค่าความสว่าง (เลือกตัวเลข 1, 2, 3):"))

    if inputmin == 1:
        gamma = 1.5
    elif inputmin == 2:
        gamma = 3.5
    elif inputmin == 3:
        gamma = 10
    else:
        print("ระดับความสว่างที่เลือกไม่ถูกต้อง")

    gamma_img = np.array(255 * (imgresize / 255) ** gamma, dtype='uint8')
    cv2.imshow(gamma_img)

else:
    print("ตัวเลขที่เลือกไม่ถูกต้อง")
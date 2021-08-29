# SẮP XẾP TĂNG DẦN
def sap_xep_tang_dan(numbers):
 
    lenth = len(numbers)
 
    # Lặp từ phần tử đầu đến kế cuối,
    # Vì khi đến phần tử cuối là đã sắp xếp thànhcông
    for i in range(0, lenth - 1):
        for j in range(i + 1, lenth):
            if (numbers[i] > numbers[j]):
                # Hoán đổi vị trí
                tmp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = tmp
 
    return numbers
# SẮP XẾP GIẢM DẦN  
def sap_xep_giam_dan(numbers):
 
    lenth = len(numbers)
 
    # Lặp từ phần tử đầu đến kế cuối,
    # Vì khi đến phần tử cuối là đã sắp xếp thànhcông
    for i in range(0, lenth - 1):
        for j in range(i + 1, lenth):
            if (numbers[i] < numbers[j]):
                # Hoán đổi vị trí
                tmp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = tmp
 
    return numbers

def tongArr(n):
    lenth = len(n)
    kq = 0
    for i in range(0, lenth-1):
        kq = kq + n[i]
    return kq

if __name__ == "__main__":
    # Chương trình chính
    print("Chương trình sắp xếp mảng Python")
    print("Bạn muốn tạo mảng có bao nhiêu phần tử", end=":")
    
    length = int(input())
    numbers = []
    a = [1,3,13,2,4,77,6,5]
    for i in range(0, length):
        print("Nhập phần tử thứ ", (i + 1), end=":")
        numbers.append(int(input()))
    
    print("Mảng trước khi sắp xếp")
    print(numbers)
    print('Tổng các pt của mảng:', tongArr(numbers))
    print("Mảng sau khi sắp xếp tăng dần:",sap_xep_tang_dan(numbers))
    print("Mảng sau khi sắp xếp giảm dần:",sap_xep_giam_dan(numbers))
    print("Mảng sau khi sắp xếp A tăng dần:",sap_xep_tang_dan(a))
    print("Mảng sau khi sắp xếp A giảm dần:",sap_xep_giam_dan(a))
    
    
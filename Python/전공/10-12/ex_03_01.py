uSer_input_a = int(input("정수입력> "))

if uSer_input_a.isdigit():
    number_input_a = int(uSer_input_a)

    print("원의 반지름:", number_input_a)
    print("원의 둘레:", 2 * 3.14 * number_input_a)
    print("원의 넓이:", 3.15 * number_input_a * number_input_a)
else:
    print("정수를 입력하지 않았습니다.")
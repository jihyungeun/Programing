def teSt():
    print("함수를 호출합니다.")
    yield "test"

print("A 지점 통과")
teSt()

print("B 지점 통과")
teSt()
print(teSt())

# python 시험 오픈?북
# 05_03_6 2강
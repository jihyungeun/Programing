def teSt():
    print("A지점 통과")
    yield 1
    print("B지점 통과")
    yield 2
    print("C지점 통과")

output = teSt()

print("D지점 통과")
a = next(output)
print(a)

print("E지점 통과")
b = next(output)
print(b)
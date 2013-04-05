import sys
input = sys.stdin.readlines()
i = 0
while True:
    info = input[i].split(" ")
    if info == ['0','0','0\n'] or info == ['0','0','0'] or info == ['0','0','0\r\n']:
        break
    C = int(info[0])
    W = int(info[1])
    H = int(info[2])
    i = i + 1
    symbols = []
    for j in range(C):
        symbol = ""
        for h in range(H):
            symbol += input[i+h][(W*j):((W*j) + W)]
        symbols.append(symbol)
    i = i + H
    info = input[i].split(" ")
    TW = int(info[0])
    TH = int(info[1])
    i = i + 1
    checker = []
    chars = TW / W
    lines = TH / H
    kraja = True
    for s in range(lines):
        for o in range(chars):
            check = ""
            for p in range(H):
                check += input[i+(H*s)+p][(W*o):((W*o) + W)]
            if check not in symbols:
                kraja = False
    i = i + (H*lines)
    if kraja:
        print "Stolen"
    else:
        print "Similar"
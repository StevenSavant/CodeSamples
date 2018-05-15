symbols = ('Y','B','O','R','W');
n = 0;

for a in symbols:
    for b in symbols:
        for c in symbols:
            for d in symbols:
                for e in symbols:
                    n+=1;
                    if (n%15 == 0):
                        shifter = '\n';
                    else:
                       shifter = ',';
                    print(a + b + c + d + e, end = shifter);

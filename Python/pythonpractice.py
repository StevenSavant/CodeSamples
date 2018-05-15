import math;
print("*");
word = input("");
i = len(word);
totalSpaces = i - 2;
m = totalSpaces;
e = 0;
print( "*" * (i + 2));

middle = math.ceil(i/2);

for j in range(0,i):
    ##print(end = "*");
    if j in range(0,middle - 1 ):
        print("*" + (" " * e) + word[j] + (" " * m) + word[j] + (" " * e) + "*");
        m -= 2;
        e += 1;
        continue;
    if j == (middle - 1):
        print("*" + (" " * int((totalSpaces + 1) / 2)) + word[middle - 1] + (" " * int((totalSpaces + 1) / 2))+ "*")
        e -= 1;
        m = 1;
        continue;
    if j >= middle:
        print("*" + (" " * e) + word[j] + (" " * m) + word[j] + (" " * e)+ "*");
        m += 2;
        e -= 1;
    
print( "*" * (i + 2));

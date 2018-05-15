import math;
k = 8.99 * math.pow(10,9);
E = -1.602 * math.pow(10,-19);
r = 9.11 * math.pow(10,-31);

Q = float(input("Q: ")) * math.pow(10,-6);
q = float(input("q: ")) * math.pow(10,-6);
d1 = float(input("d: ")) /2 ;

c1 = (1 / (d1 - 0.12));
c2 = (1 / (d1 + 0.12));
c3 = (2 / d1);
d = (c1 + c2 - c3);
print(d);
A = k * Q * q * d;
print(A);

import math;
'''

d = float(input()) / 2;
Ti = float(input());
Tf = float(input());
s = float(input());
E = - ((math.pi * math.pow(d,2) * (Ti - Tf)) / s );
print(E);
'''
muNot = ( 4 * math.pi * math.pow(10,-7));
g = 9.8;
pCU = float(input("pCU: "));
dCU = float(input("dCU: ")) * math.pow(10,-4);
d = float(input("d: "));
A = float(input("A: "));
Theta = float(input("Angle: "));

answ1 = (pCU * (math.pi * math.pi) * math.pow( dCU , 2) * d * g);

answ2 = (muNot * A * math.cos(math.radians(Theta)));

answ3 = answ1 / answ2;

print(answ3);

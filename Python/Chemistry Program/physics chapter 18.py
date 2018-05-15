R1 = int(input("R1: "));
R2 = int(input("R2: "));
R3 = 6;
R4 = 12;
R5 = 6;

REQ1 =  ( 1 / ((1/R1) + (1/R3)) ) + R2;
REQ2 =  R4 + R5;
REQ =  1 / ((1/REQ1) + (1/REQ2));
print(REQ);
print("-------");

Ao1 = 12/REQ2;
Ao2 = 12/REQ1;
Ao3 = Ao2 / 2;

print(Ao1);
print(Ao2);
print(Ao3);



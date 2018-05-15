import math;
muNot = 4 * math.pi * math.pow(10,-7);

I = 2 * (muNot / (2 * math.pi)) * (math.pow(8.5,2) / 0.43) * math.cos(math.radians(30));
print(I);

Y =  - ( (muNot / (2 * math.pi)) * (math.pow(8.5,2) / 0.43) * math.cos(math.radians(30)) );

X = - ( (muNot / (2 * math.pi)) * (math.pow(8.5,2) / 0.43) * math.sin(math.radians(30)) ) + ( (muNot / (2 * math.pi)) * (math.pow(8.5,2) / 0.43));

print("-----");
Z = math.sqrt( math.pow(X,2) + math.pow(Y,2));
print(Z);

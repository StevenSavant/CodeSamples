import math;

k = 9 * math.pow(10,9);
q1 = float(input("enter Q1: "));
q2 = float(input("enter Q2: "));
r = float(input("enter r: "));

f1 = (k * (q1 * math.pow(10,-6)) * (q2 * math.pow(10,-6))) / (r * r);

print(f1);

q3 = float(input("enter Q3: "));
r2 = float(input("enter r2: "));

f2 = (k * (q1 * math.pow(10,-6)) * (q3 * math.pow(10,-6))) / (r2 * r2);

print(f2);
answer = (abs(f1) + abs(f2));

print(answer);

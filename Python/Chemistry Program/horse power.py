import math;

torque = float(input("torque: "));
rpm = float(input("rpm: "));

w = (rpm * math.pi * 2) / 60;
print(str(w));
P = (torque * w);
print(str(P));
HP = ((P/1000) / 0.745);
print(str(HP));

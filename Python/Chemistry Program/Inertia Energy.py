import math;

mI = float(input("moment of Inertia: "));
rpm = float(input("stoping rpm: "));

w = (rpm * math.pi * 2) / 60;
KE = 0.5 * (mI) * w**2;
print(str(KE));

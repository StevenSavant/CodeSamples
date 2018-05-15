import math;

rev = float(input("rev: "));
time = float(input("seconds: "));
mass = float(input("mass: "));
length = float(input("length: "));

alpha = (2 * math.pi) * (rev/time);
print("alpha = " + str(alpha));

mI = (1/3) * mass * length**2;
print("mI = " + str(mI));
torque = alpha * mI;
print("torque = " + str(torque));

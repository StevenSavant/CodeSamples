import math;
radius = float(input("radius in m: "));
mass = float(input("mass in kg: "));

mI = (0.5) * (mass) * (radius**2);

print("Moment of Inertia = " + str(mI));

rpm1 = int(input("\nRPM 1: "));
time1 = float(input("\ntime 1: "));
time2 = float(input("\ntime 2: "));

vf = (rpm1 * 2 * math.pi) / 60;
print(str(vf));

alpha = (vf/time2) * -1;
tFriction = mI * alpha;

acc = (vf / time1);

apptorque = (mI * acc) - (tFriction);

print("Torque: " + str(apptorque));

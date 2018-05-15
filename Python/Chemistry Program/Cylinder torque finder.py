# L = l*w
# L = mr^2 * pie * f
import math;

rev = float(input("speed: "));
radius = float(input("radius in m: "));
mass = float(input("mass in kg: "));

time = float(input("time in sec: "));

l = (mass * (radius**2)) /(2);
w = (rev * 2 * math.pi )/ 60;

am = (l * w);

print(str(am));

torque = (am/ time);
print(str(torque));

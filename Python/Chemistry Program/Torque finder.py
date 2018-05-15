import math;
## Torque = apF * dist
## apF = Torque / dist
## dist = Torque / apF

## Torque = apF * d * sin(angle)

Torque = float(input("Torque: "));
apF = float(input("Force applied: "));
dist = float(input("dist: "));
angle = 0;
angle = float(input("angle: "));

if Torque == 0:
    print(str(round(apF * dist,1)));
    print(str(round(apF * dist * math.sin(math.radians(angle)),3)));
elif apF == 0:
    print(str(round(Torque / dist,1)));
else:
    print(str(round(Torque / apF,1)));

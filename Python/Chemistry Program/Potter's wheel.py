import math;

rvps1 = float(input("speed: "));
mass = float(input("mass: "));
diameter = float(input("diameter of wheel: "));
cmass = float(input("chunck mass: "));
crad = float(input("chunck radius in m: "));

wrad = diameter / 2;

l1 = 0.5 * mass * wrad**2;
print(str(l1));
p1 = l1 * 2 * math.pi * rvps1
print(str(p1));
l2 = l1 + 0.5 * cmass * crad**2;
print(str(l2));

temp  = (l2 * 2 * math.pi);
print("\n" + str(p1));
print(str(temp) + "\n");

rvps2 = p1 /temp;

print(str(rvps2));

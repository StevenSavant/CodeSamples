import math;
PIE = math.pi;

v1 = float(input("initial speed in km/h: "));
v2 = float(input("final speed in km/h: "));

diameter = float(input("The diameter: "));
rotations = float(input("number of rotations: "));

v1 = (v1 * 1000.0) / 3600;
v2 = (v2 * 1000.0) / 3600;
circmf = (PIE * diameter);

radps1 = (v1/circmf) * 2 * PIE;
radps2 = (v2/circmf) * 2 * PIE;

distance = rotations * 2 * PIE;
## print("distance: " + str(distance));

ax = (radps2**2 - radps1**2)/(2*distance);
    
print(str(round(ax,1)) + " rad/s^2");

print("\nPart B:\n");
print(radps2)
time = (0 - radps2)/ax;
print (str(round(time,1)) + " seconds");

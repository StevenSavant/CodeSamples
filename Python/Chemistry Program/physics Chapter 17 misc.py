import math;
'''
qe = 1.6 * math.pow(10,-19);
Kconstant = 8.85 * math.pow(10,-12);
KNOT = float(input("material: "));
A = float(input("A in cm: "));
d = float(input("d in mm: "));

C = (Kconstant * KNOT * (math.pow((A * math.pow(10,-2)),2) / (d * math.pow(10,-3)) ));


#V = int(input("Electonic Volts: "));
#J = qe * V;
#eV = V;

print(C);
'''
k = 8.99 * math.pow(10,9);

m = float(input("m: "));
q = int(input("q: "));

q = q * math.pow(10, -6);


L = ((m + 1) * 9.8 * 2) + (q * 150 * 2);
Vn2 = L / (0.5 * m);

print(math.sqrt(Vn2));

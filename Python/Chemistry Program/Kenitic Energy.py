import math;


personmass = float(input("mass of the person: "));
radius = float(input("radius in m: "));
mI = float(input("Moment of Inertia: "));
av = float(input("angular velocity: "));

w = ( av * mI )/ (mI + (personmass * (radius**2)));
w = round(w,3);
print(str(w));
KEA = (0.5) * (mI) * (av**2);
print(str(KEA));
KEB =  (0.5) * (mI + (personmass * (radius**2))) * (w**2) ;
print(str(KEB));


def FindPersonality
personality = "";
highest = max(loving,shy,adventerous,mean);
if loving == highest:
    personality = "loving";
    if highest == shy:
        personality = " Soft Hearted";
    if highest == adventerous:
        personality = " Strong Hearted";
    if highest == mean:
        personality = " Tough Hearted";
        
elif shy == highest:
    personality = "shy";
    if highest == adventerous:
        personality = " strong and silent";
    if highest == mean:
        personality = " a ticking time bomb";
    
elif adventerous == highest:
    personality = "adventerous";
    if highest == mean:
        personality = "Really Tough";

else:
    personality = "just plain mean!";

print("You " + name + " are " + personality);


















    


#Account Simulator
Next = True;
total = int(input("Starting Funds: "));
bills = int(input("Monthly Expenses: "));
savings = int(input("Savings per check?: "));
saved = 0;
w = 1;
response = "";
def isEven(x):
    if ((x % 2) == 0):
        return True;
    return False;

def MonthEnd(y):
    if ((y % 4) == 0):
        return True;
    return False;
    
while (Next):
    print("--------------------");
    print("Week: " + str(w));
    print("Start of week:      $" + str(total) + "    savings: " + str(saved));
    total = total-80;
    print("Weekly spending      -$80");
    print("                    $" + str(total));
    
    if (isEven(w)):
        print("Payday               +$400");
        total = total + 400;
        print("                    $" + str(total));

    if (MonthEnd(w)):
        print("Bills:               -$" + str(bills));
        total = total - bills;
        print("                    $" + str(total));
        saved = saved + savings;

    response = input("ENTER to continue: ");
    if (response != ""):
        Next = False;

    w = w + 1;
    print();
    
        
    

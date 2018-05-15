## Print Welcome Statment
print("Welcome to the personality test!");
name = input("Type your name and press ENTER to begin: ");

# define global variables and list of valid responses
testing = True;
end = False;
loving = 0;
shy = 0;
adventerous = 0;
mean = 0;
responses = ("a", "b", "c", "d", "q");

## This function to analyze the answers from questions.
def analyzeresponse(r):

    global loving;
    global shy;
    global adventerous;
    global mean;
    
    case = r;
    if case == "a":
        loving += 1;
    elif case == "b":
        shy+= 1;
    elif case == "c":
        adventerous+= 1;
    elif case == "d":
        mean+= 1;
## This functions finds personality from the answers
def FindPersonality(a,b,c,d):
    personality = "";
    
    highest = max(a,b,c,d);
    if a == highest:
        personality = "loving";
        ## These statements check for mixes, from weakest to strongest emotion.
        if highest == b:
            personality = " Soft Hearted"; # loving + shy
        if highest == c:
            personality = " Strong Hearted"; # loving + adventerous
        if highest == d:
            personality = " Tough Hearted"; # loving + mean
            
    elif b == highest:
        personality = "shy";
        if highest == c:
            personality = " strong and silent"; #Shy + adventerous
        if highest == d:
            personality = " a ticking time bomb"; # Shy + Mean
        
    elif c == highest:
        personality = "Adventerous";
        if highest == d:
            personality = "Really Tough"; # Adventerous + Mean

    else:
        ## if no love, shy, or adventure is found...
        personality = "just plain mean!";

    return personality;

        
while testing:
## ---------------------Begin Test--------------------Question---1
    print("Where would you rather go, on a date?\n");
    print("A: The Movies, it's more intimate.");
    print("B: The Park, it's peacful.");
    print("C: A Restaurant, you love Food!");
    print("D: The Beach, so you can show off your body");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());
## -------------------------------------------------Question--2
    print("What role do you usually play on a team?\n");
    print("A: The Support member");
    print("B: The Minion");
    print("C: The Leader");
    print("D: The BOSS");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

## -----------------------------------------------Question----3
    print("Which of these movies would you rather watch?\n");
    print("A: The Perfect Guy.");
    print("B: Naruto");
    print("C: Taken 2");
    print("D: The Purge");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

## --------------------------------------------------Question--4
    print("Someon bumps into you, What is your response?\n");
    print("A: Are you ok?");
    print("B: Excuse Me.");
    print("C: *push them back*");
    print("D: Excuse You!");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

## ---------------------------------------------------Question--5
    print("Your taking a test... and struggling. What do you do?\n");
    print("A: Do my best.");
    print("B: Give up.");
    print("C: answer C for everything!");
    print("D: Cheat!");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

## --------------------------------------------------Question-6
    print("Which pet do you (or would you) have?\n");
    print("A: Hamster");
    print("B: Cat");
    print("C: Cheetah!");
    print("D: Dog");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

## --------------------------------------------------Question--7
    print("Which life moto best fits you?\n");
    print("A: Everyone is special.");
    print("B: Hold onto your dreams.");
    print("C: No Pain, No Gain!");
    print("D: Keep on Fighting!");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

## -------------------------------------------------Question--8
    print("Describe you patience.\n");
    print("A: a littel more than most people.");
    print("B: A LOT of patience.");
    print("C: Zero.");
    print("D: Less than zero.");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

## -------------------------------------------------Question--9
    print("Describe your friends in one word?\n");
    print("A: Family");
    print("B: Few");
    print("C: Team");
    print("D: Gang");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("complete");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

## -------------------------------------------------Question--10
    print("Which BEST describes you last social media post?\n");
    print("A: Insperational message");
    print("B: A few short words.");
    print("C: A random funny event");
    print("D: Getting Real.");

    print("\n enter Q to quit....")
    response = input("");

    while response.lower() not in responses:
        print("please enter A, B, C, D, or Q");
        response = input("");

    print("***************\nTest Complete\n****************");
    if response.lower() == "q": end = True; break;

    analyzeresponse(response.lower());

    if not end: # if test was ended with 'q' do not analyze results
        print("You " + name + " are " + FindPersonality(loving,shy,adventerous,mean));


##-----Ask to Re Test?-------------

    reTest = input("\nWould you like to test again? Yes or no?: "); #specifically for cmd window
    if reTest.lower() == "yes":
        continue;
    else:
        testing = False;
#--------------------------

print("Goodbye");
input("Press Enter to exit...")









    


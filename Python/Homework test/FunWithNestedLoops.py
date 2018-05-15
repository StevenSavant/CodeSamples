##Author: Steven Burrell
##Due Date: October 25, 2015
##Class: CSCI 2000 Section: 43078
##Instructor: Dr.Smith
##Program Assignment: 7
##Program Title: FunWithNestedLoops
##Program Description: A program that takes a number 3-20 as input and compiles
##  four different patterns of astrisks '*' according to the input it also
##  validates input and return feedback for invalid input.
##
##Plagiarism Statement:
##  I swear that I have not received or given aid on this program
##  beyond guidlines of the course including giving or receiving
##  specific code content.## Get tax income & initialize tax

## Define function to validate input
def isValid(indigit):
    if indigit.isdigit():
        if int(indigit) >= 3 and int(indigit) <= 20:
            #input is valid
            return True;
        else:
            #input is out of range
            print('outside of range (3-20)');
            return False;
    else:
        #input is not a number
        print('that was not a number, try again)');
        return False;
#initialize variables
rows = '';
vRows = 0;

##first pattern
rows = input("Pattern 1. How many rows (3-20}? ");
if isValid(rows): #cast 'rows' into interger 'vRows' (if valid)
    vRows = int(rows);
    #compute plain pattern
    for x in range(vRows):
        for i in range(vRows):
            print ('*', end = '');
        print();
print("-------------------------------");

##second pattern
rows = input("Pattern 2. How many rows (3-20}? ");
if isValid(rows): #cast 'rows' into interger 'vRows' (if valid)
    vRows = int(rows);
    #compute building pattern
    for x in range(vRows):
        i = 1;
        for i in range(x + 1):
            print ('*', end = '');
        print();
print("-------------------------------");

#third pattern
rows = input("Pattern 3. How many rows (3-20}? ");
if isValid(rows): #cast 'rows' into interger 'vRows' (if valid)
    vRows = int(rows);
    #compute reverse pattern
    for x in range(vRows):
        for i in range(vRows):
            print ('*', end = '');
        print();
        vRows -= 1;
print("-------------------------------");

#fourth pattern
rows = input("Pattern 4. How many rows (3-20}? ");
if isValid(rows): #cast 'rows' into interger 'vRows' (if valid)
    vRows = int(rows);
    #compute building space pattern
    for x in range(vRows):
        print(end = '*');
        for i in range(x):
            print(' ', end = '');
        print(end = '*');
        print();


##commandprompt compatablility code
end = input('press any key to end....');

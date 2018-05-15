##Author: Steven Burrell
##Due Date: October 11, 2015
##Class: CSCI 2000 Section: 43078
##Instructor: Dr.Smith
##Program Assignment: 5
##Program Title: ConsumerPriceIndex
##Program Description: A program that takes the consumer price index and return
##  the number of years before the CPI doubles in value assuming it rises 2.5%
##  per year.
##
##Plagiarism Statement:
##  I swear that I have not received or given aid on this program
##  beyond guidlines of the course including giving or receiving
##  specific code content.## Get tax income & initialize tax

## create a list variable holding, valid intergers
x = 1;
responses = ['0', '1'];
#list holds numbers from 0 - 2000
while (x < 2000):
    responses.append(str(x+1));
    x += 1;

#
years = 0;
initialCPI = input("Enter the CPI for July 2015: ");

#check to see if initial is in usuable range
if initialCPI in responses:
    #if so, cast usuable inpute into new variable
    endCPI = int(initialCPI);

    ## calculate response
    while endCPI < (int(initialCPI) * 2):
        endCPI *= 1.025;
        years += 1;
        
    ## change years to year if only 1
    pluralSing = "years";
    if years == 1:
        pluralSing = "year";
    #Print response and end program
    print("Consumer prices will double in " + str(years) + " " +
          pluralSing + "." );
else:
    # if not, end program
    print("Bad Input");

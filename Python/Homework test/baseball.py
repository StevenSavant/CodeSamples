##Author: Steven Burrell
##Due Date: September 16, 2015
##Class: CSCI 2000 Section: 43078
##Instructor: Dr.Smith
##Program Assignment: 2
##Program Title: Baseball
##Program Description: A program that takes the team name, number of wins
##   and number of losses as input. It then calculates the total number of games
##   and prints  the calculated percentage of wins that team has.
##
##Plagiarism Statement:
##  I swear that I have not received or given aid on this program
##  beyond guidlines of the course including giving or receiving
##  specific code content.## Get tax income & initialize tax

#Request User Input for Team Name, Games Won, and Games Lost.
teamName = input("Enter name of team: ");
won = input("Enter number of games won: ");
lost = input("Enter number of games lost: ");

#Add won and lost games to find total, then store in new variable
totalGames = int(won) + int(lost);

#Divide wins by total games to find win rate.
winRate = int(won)/totalGames;

#Print results in statment.
print(teamName + " won " + str(round(winRate * 100,1)) + "% of their games.");

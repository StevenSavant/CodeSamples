Python 3.4.3 (v3.4.3:9b73f1c3e601, Feb 24 2015, 22:43:06) [MSC v.1600 32 bit (Intel)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> ================================ RESTART ================================
>>> 
Enter name of team: dude
Enter number of games won: 50
Enter number of games won: 50
dude won 0.5 of their games
>>> ================================ RESTART ================================
>>> 
Enter name of team: dude
Enter number of games won: 50
Enter number of games won: 50
dude won 50.0% of their games
>>> 
>>> ================================ RESTART ================================
>>> 
Enter name of team: Yankees
Enter number of games won: 68
Enter number of games won: 52
Yankees won 56.666666666666664% of their games
>>> ================================ RESTART ================================
>>> 
Enter name of team: yankees
Enter number of games won: 68
Enter number of games won: 52
Traceback (most recent call last):
  File "E:/Program Assignment 2 - Steven Burell.py", line 21, in <module>
    print( teamName + " won " + str(winRate.up * 100) + "% of their games");
AttributeError: 'float' object has no attribute 'up'
>>> ================================ RESTART ================================
>>> 
Enter name of team: dude
Enter number of games won: 50
Enter number of games won: 50
Traceback (most recent call last):
  File "E:/Program Assignment 2 - Steven Burell.py", line 21, in <module>
    print( teamName + " won " + str(round(winRate.up * 100)) + "% of their games");
AttributeError: 'float' object has no attribute 'up'
>>> ================================ RESTART ================================
>>> 
>>> 
Enter name of team: 
>>> ================================ RESTART ================================
>>> 
Enter name of team: dude
Enter number of games won: 50
Enter number of games won: 50
dude won 50% of their games
>>> ================================ RESTART ================================
>>> 
Enter name of team: Yankees
Enter number of games won: 68
Enter number of games won: 52
Yankees won 57% of their games
>>> ================================ RESTART ================================
>>> 
Enter name of team: Yankees
Enter number of games won: 68
Enter number of games won: 52
Traceback (most recent call last):
  File "E:/Program Assignment 2 - Steven Burell.py", line 21, in <module>
    print( teamName + " won " + str(round(winRate * 100), 1) + "% of their games");
TypeError: str() argument 2 must be str, not int
>>> ================================ RESTART ================================
>>> 
Enter name of team: Yankees
Enter number of games won: 68
Enter number of games won: 52
Yankees won 56.7% of their games
>>> 

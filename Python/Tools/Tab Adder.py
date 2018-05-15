file = open("experimental reciept.txt", "r");

for line in file:
    text = line;
    text = text + "\n"
    print(text, end="");

file.close();

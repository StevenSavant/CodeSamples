file = open("receipt.txt", "r");

for line in file:
    text = line;
    text = text.replace("\t",";");
    print(text, end="");

file.close();

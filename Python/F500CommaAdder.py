inFile = open("Top500.txt");
demoEntry = "476Markel$5,370"
cloud = "500HereGoes Nothing$55.00";
cloud = demoEntry
newEntry = "";

for cloud in inFile.readlines():
    cloud.strip();
    index = 0;
    while cloud[index].isdigit():
        index = index + 1;

    rank = cloud[:index]

    index2 = cloud.index("$")
    Revenue =cloud[index2:]

    Name = cloud[index:index2]
    newEntry = (rank + ";" + Name + ";" + Revenue);
    print(newEntry.strip());

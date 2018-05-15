public class Item
{
   private String name;
   private int weight;
   private int value;
   
   public Item(String info)
   {
      String[] infoSet = info.split(" ");
      name = infoSet[0];
      weight = Integer.parseInt(infoSet[1]);
      value = Integer.parseInt(infoSet[2]);
   }
   
   public int getWeight()
   {
      return weight;
   }
   
   public int getValue()
   {
      return value;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String toString()
   {
      return (name + " " + weight + " " + value);
   }
}
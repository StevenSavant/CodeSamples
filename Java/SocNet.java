public class SocNet
{
   private DiGraph graph;
   private ArrayList<Users> userData;
   private int AllEdge;
   private int possibleEdges;
   ArrayList<Integer> = visited;
   
   public SocNet(String filename)
   {
      readFile(filename);
      findAllEdges();
   }
   
   public void readFile(String filename)
   {
      File inFile = new File(filename);
      Scanner s = new Scanner(inFile);
      String name;
      String follows;
      int tracker = 0;
      try
      {
         while s.hasNext()
         {
            name = s.next();
            follows = s.next();
            
            tracker = addUser(name);
            addUser(follows);
            
            userData.get(tracker).addFollower(follows);
         }
      }
      catch (exception)
      {
         System.out.println("File read error: ");
      }
   }
   
   public String mostPopular()
   {
      User popUser;
      int popCount = 0;
      for (User user : userData)
         if (popCount < user.follMe()) 
            popUser = user; 
         
      return popUser.name;
   }
   
   public String topFollower()
   {
      User topFollow;
      int follCount = 0;
      for (User user : userData)
         if (follCount < user.meFoll())
            topFollow = user; 

      return topFollow.name;
   }
   
   public Set<String> leaders()
   {
      HashSet<String> theLeaders = new HashSet<String>;
      for (User user : userData)
         if (popCount < user.follMe())
            theLeaders.put(user.name);

      return theLeaders;
   }
   
   public double density()
   {
      double dense = (graph.edges() / possibleEdges);
      return dense;
   }
   
   public double reprocity()
   {
      double s = 0;
      for (User user : userData)
         for (int i : graph.getAdj(user.userID))
            for (int j : graph.getAdj(i))
               if (j == user.userID)
                  s++;
      
      return (s / graph.edges());
   }
   
   public int distance(String user1, String user2)
   {
      int hops = 0;
      
      if (user1.equals(user2))
         return hops;
       
      hops++;
      
      int user1ID = findUserID(user1);
      int user2ID = findUSerID(user2);
      
      hops = distance(user1ID, user2ID);
      
      if (hops == 0)
         return MAX_VALUE;
      
      return hops;
   }
   
   public int distance(int user1ID, user2ID)
   {
      HashSet<Integer> breath = new HashSet<Integer>;
      breath = graph.getAdj(user1ID);
      
      for (int i : breath)
         if (i == user2ID)
            return 1;
      
      for (int i : breath)
         return (1 + distance(i, user2ID));
      
      return (-1);
   }
   
   public string path(String user1, String user2)
   {
   
   
   }
   
   public double centrality()
   {
   
   }
   
   public Set<String> reachable(String user1, String user2)
   {
   
   }
   
   public int findAllEdge()
   {
      int n = graph.vertices();
      possibleEdges = (n * (n - 1));
      
   }
   
   private int addUser(String username)
   {
      for (int i = 0; i < userData.length ; i++)
         if (userData.get(i).name.equals(username))
            return i;
      
      userData.add(new User(username, userData.length));
      return (userData.lenght - 1);
   }
   
   private int findUserID(String user)
   {
      for (int i = 0; i < userData.length ; i++)
         if (userData.get(i).name.equals(username))
            return i;
   }
}
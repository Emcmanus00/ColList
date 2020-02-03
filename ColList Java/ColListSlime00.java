class ColListSlime00 {

   public static void main(String[] args) {
   
      //create  an array and convert to list
      Character[] Eman ={'l','f','a'};
      List<Character> l = Arrays.asList(Eman);
      System.out.println("List is : ");
      output(l);
      
      //reverse and print out the list
      Collections.reverse(l);
      System.out.println("After reverse : ");
      output(l);
      
      //create a new array and new list
      Character[] newEman = new Character[3];
      List<Character> listCopy = Arrays.asList(newEman);
      
      //copy contents of list into list copy
      Collections.copy(listCopy, l);
      System.out.println("Copy of list : ");
      output(listCopy); 
      
      //fill collection with data
      Collections.fill(l, 'X');
      System.out.println("After filling the list : ");
      output(l);
   }
      
      //output method
   private static void output(List<Character> thelist) {
      
      for(Character thing: thelist)
         System.out.printf("%s ", thing);
         
      System.out.println();     
           
      
   }
}
class Main {
  public static void main(String[] args) {

    
   // Using nested loops print the alphabet letters in the following order:

  /*
   aa
   ab
   ac
   ad
   ..
   az
   ba
   bb
   ..
   bz
   .
   .
   za
   ..
   zz
  
  */
for(char ch = 'a'; ch <= 'z'; ch++)
  for(char ch2 = 'a'; ch2 <= 'z'; ch2++) {
    System.out.println(ch + "" + ch2);
  }
  }
}
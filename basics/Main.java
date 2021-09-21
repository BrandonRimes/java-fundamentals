public class Main
{
  public static String pluralize(String str, int num)
  {
    String newStr = str;
    if (num != 1)
    {
      newStr = str + "s";
    }
    return newStr;
  }

  public static void flipNHeads(int num)
  {
    int headCount = 0;
    int flipCount = 0;
    while(headCount < num)
    {
      int randInt = (int)Math.floor(Math.random()*11);
      if(randInt >= 5)
      {
        headCount++;
        System.out.println("heads");
      } else {
        System.out.println("tails");
      }
      flipCount++;
    }
    System.out.println("It took "+ flipCount +" flips to flip "+ num +" heads in a row.");
  }

  public static void main(String[] args)
  {
    System.out.println(pluralize("dog", 1));
    flipNHeads(2);
  }
}
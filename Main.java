/*Dont delete this file or the whole project will crash(TRIED ALREADY :) ) This is the only file that is executed when you run the program. */
public class Main
{
  public static void main(String args[]) throws Exception
  {
    try{
      home h = new home();
      h.main();
      //editEntry edit = new editEntry();
      //edit.main();
      /*
      newEntry nE = new newEntry();
      nE.main();
      */
    }
    catch (Exception E)
    {
      System.out.println("OOPSS! Seems like something went wrong. Please Restart the program.");
    }
  }
}
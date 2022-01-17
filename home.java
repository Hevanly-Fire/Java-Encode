import java.util.*;
import java.time.*;
import java.time.format.*;
public class home
{
  Scanner sc = new Scanner(System.in);
  boolean run = true;

  home()
  {}

  public void homescreen()
  {
    System.out.println("What you would like to do?");
    System.out.println("1. Enter new expenses\n2. Edit previous expenses\n3. Total this month's expenses\n4. Add credit card/debit card\nEnter -1 to exit");
    System.out.print("\u001b[32mINPUT-> ");
    int input = sc.nextInt();
    System.out.print("\u001b[0m");
    switch(input)
    {
      case 1: 
        newEntry newEntry = new newEntry();
        newEntry.main(); 
        break;     case 2:
        editEntry editEntry = new editEntry();
        editEntry.main();
        break;
      
      case 3:
        /* Monthly sum */
        break;
      
      case 4:
        /* add credit card/debit card */
        break;

      case -1: /*USING -1 AS AN EXIT COMMAND MAY BE CHANGED LATER*/
        System.out.println("Thank you for using this app. The app will quit now.");
        run = false;
        break;
      default:
          System.out.println("Can't get it pls try again.");   }
  }

  public void main() throws Exception
  {
    try
    {
      System.out.println("\u001b[36mWelcome to My Expenses app.\u001b[0m");
      Thread.sleep(1000);

      DateTimeFormatter dt = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
      LocalDateTime date = LocalDateTime.now();
      System.out.println("Current date/time: \u001b[36m" + date.format(dt) + "\u001b[0m");

      Thread.sleep(1000);

      while(run){
        Thread.sleep(2000);
        homescreen();
      }
    
    }
    catch (Exception E)
    {
      //E.printStackTrace();
      System.out.println("OOPSS! Seems like something went wrong. Please Restart the program.");
    }
  }
}
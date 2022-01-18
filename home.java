import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;
public class home
{
  static Scanner sc = new Scanner(System.in);
  boolean run = true;
  static String Username = null;

  home()
  {}

  public void homescreen() throws Exception
  {
    System.out.println("What you would like to do?");
    System.out.println("\u001b[31m1. Enter new expenses\n2. Edit previous expenses\n3. Total this month's expenses\n4. Add Payment Source \nEnter -1 to exit");
    System.out.print("\u001b[32mINPUT-> ");
    int input = sc.nextInt();
    System.out.print("\u001b[0m");
    switch(input)
    {
      case 1: 
        expense();
        break;     
      case 2:
        editEntry editEntry = new editEntry(Username);
        editEntry.main();
        break;
      
      case 3:
        /* Monthly sum */
        System.out.println("Choose the Month");
        break;
      
      case 4:
        /* add credit card/debit card/others */
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
      System.out.println("Enter Your username");
      Username = sc.nextLine();
      System.out.println("Welcome " + Username);
      
      while(run)
      {
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
  public static void expense() throws Exception
  {
      System.out.println("Categories are as follows");
      System.out.println("1. Transportation \n2. Food \n3. Household \n4. Apparel \n5. Dairy");
      System.out.println("Enter a category");
      int cat = sc.nextInt();
      switch (cat)
      {
        case 1:
          System.out.println("You've Chosen Transportation \nSo How much did you spend");
          int trns = sc.nextInt();
          newEntry n1 = new newEntry(Username, 1 , trns );
          break;
        case 2:
          System.out.println("You've Chosen Food \nSo How much did you spend");
          int fo = sc.nextInt();
          newEntry n2 = new newEntry(Username, 2 , fo );
          break;
        case 3:
          System.out.println("You've Chosen Household \nSo How much did you spend");
          int ho = sc.nextInt();
          newEntry n3 = new newEntry(Username,3 , ho );
          break;
        case 4:
          System.out.println("You've Chosen Apparel \nSo How much did you spend");
          int ap = sc.nextInt();
          newEntry n4 = new newEntry(Username, 4 , ap );
          break;
        case 5:
          System.out.println("You've Chosen Dairy \nSo How much did you spend");
          int dar = sc.nextInt();
          newEntry n5 = new newEntry(Username ,5 , dar );
          break;
      }
  } 
}
/* 
* Home - First homescreen page 
* Enter Expenses - to enter new expense 
* Edit Entry -  Edit previuos entries (Scope - 10 Days)
* 
**/
// Transportation, Food, Household, Apparel, Dairy
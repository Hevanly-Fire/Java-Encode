/*I was trying to use try catch block in the main but in home.java an error was showing that editEntry.main throws Exception if you can 
resolve it pls do it*/
import java.io.*;
import java.util.*;
public class editEntry 
{
  String categories[] = {"Transportation", "Food", "Household", "Apparel", "Dairy"};
  String username;
  editEntry(String username)
  {
    this.username = username;
  }
  
  public void retrieveData() throws Exception
  {
    try{
      //System.out.println("\u001b[35mEdit entry access will be available soon.");
      File data = new File("data.txt");
      BufferedReader read = new BufferedReader(new FileReader(data));
      String str;
      while((str = read.readLine()) != null)
      {  
        //System.out.println(str);
        StringTokenizer st = new StringTokenizer(str,"/");
        for(int i = 0 ; i<st.countTokens(); i++)
        {
          System.out.println(st.nextToken());
        }
      }
    }
    catch(Exception E)
    {
      //System.out.println("OOPSS! Seems like something went wrong. Please Restart the program.");
    }
  }
  public void main() throws Exception
  { 
    try
    {
      retrieveData();
    }
    catch (Exception E)
    {
      System.out.println(E);
    }
  }
}
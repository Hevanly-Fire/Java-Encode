// To enter new expenses INPUT-> 2,850
/*
HERE YOU CAN ENTER YOUR expenses
CATEGORIES-
1
2
..
n
INPUT-> 2 850
*/
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.*;
public class newEntry
{
  public String exp[];
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
  LocalDateTime now = LocalDateTime.now();  
  
  public newEntry(String username, int cat, int exp) throws Exception
  {
    try
    {
      String fileName = "data/" + username+ ".txt";
      File userFile = new File(fileName);
      if(userFile.exists())
      {
        FileWriter fw = new FileWriter(fileName, true);
        String stamp = "" + cat + "/" + exp + "/" + dtf.format(now)+"\n";
        //System.out.println(stamp);
        fw.append(stamp);
        fw.close();
        System.out.println("Entry done!");
      }
      else
      {
        userFile.createNewFile();
        FileWriter fw = new FileWriter(fileName, true);
        String stamp = "" + cat + "/" + exp + "/" + dtf.format(now) + "\n";
        //System.out.println(stamp);
        fw.write(stamp);
        fw.close();
        System.out.println("Entry done!");
      }
    }
    catch(Exception E)
    {
      System.out.println(E);
    }    
  }
  public void main()
  {
    
  }
}
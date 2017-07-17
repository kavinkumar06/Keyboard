# Keyboard
import java.io.*;
import java.util.*;
public class Keyboard
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter some strings !");
      List<String> list = new ArrayList<String>( );
      boolean loop = true;
        while(loop)
        {
          String s = sc.nextLine( );
 
            if(s.equals("")|s.equals("q"))
            {
              break;    
            }
            else
            {
              list.add(s);
            }
        }
       
    }
 
}

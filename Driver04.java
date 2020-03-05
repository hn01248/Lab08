 //name:Huy Nguyen    date:2/26/2020  
 
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
public class Driver04
{
   public static void main(String[] args) 
   {
       Scanner infile = null;
       boolean error = true;
       do
       {
           try
           {
               String filename = JOptionPane.showInputDialog("Enter filename");
               infile = new Scanner( new File(filename));
               error = false;
           }
           catch(infile == null)
           {
                JOptionPane.showMessageDialog(null, "Error: File not found.");
           }
           finally
           {
               System.out.println("Exception error");
               System.exit(0);

           }
       }while(error);
    }
}
/************************************
Sum: 3291074.1965423366
Avg: 504.3791872095535
Min: 0.027375512843708094
Max: 999.9780398236477

*************************************/
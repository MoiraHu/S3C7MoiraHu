
/**
 * Editor:Moira Hu
 *
 * Instructor: Mr.Daniel
 * 
 */
import java.util.*;
public class Library
{
   private String title;
   private String author;
   private String itemid;
   private boolean onloan;
   private Date duedate;
   private Random radom;


   public Library (String a, String b, String c, boolean d, Date e)
   {
       title=a;
       author=b;
       itemid=c;
       onloan=d;
       duedate=e;
   }
   
   public String getTitle()
   {
       return title;
   }
     public String getAuthor()
   {
       return author;
   }
     public String getItemid()
   {
       return itemid;
   }
     public Date getDuedate()
   {
       return duedate;
   }
 
   public void printDetails()
   {
      System.out.println("The title is "+getTitle());
      System.out.println("The author is "+getAuthor());
      System.out.println("The itemid is "+getItemid());
      System.out.println("The duedate is "+getDuedate());
      
   }
   
}
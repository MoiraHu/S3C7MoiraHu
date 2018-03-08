
/**
 * Editor:Moira Hu
 *
 * Instructor: Mr.Daniel
 * 
 */
import java.util.*;
public class CD
{
   private String title;
   private String artist;
   private String itemid;
   private boolean onloan;
   private Date duedate;
   private String type;
   private Random radom;

   public CD (String a, String b, String c, boolean d, Date e, String f)
   {
       title=a;
       artist=b;
       itemid=c;
       onloan=d;
       duedate=e;
       type=f;
   }
   
   public String getTitle()
   {
       return title;
   }
     public String getArtist()
   {
       return artist;
   }
     public String getItemid()
   {
       return itemid;
   }
     public Date getDuedate()
   {
       return duedate;
   }
     public String getType()
   {
       return type;
   }
   
 
   public static void main()
   {
       CD a = new CD ( "LLCG", "Moira", "X456", false, new Date(), "classical");
       System.out.println("");
   }
   
}
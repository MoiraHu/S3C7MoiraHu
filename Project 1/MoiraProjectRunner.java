/**
 *Instructor: Mr.Daniel
 *Producer:Moira Hu
 *Class:S3C7
 *Description:The project made in Mr.Daniel’s AP Computer Science Class
 */
import java.util.Scanner;
public class MoiraProjectRunner
{
  public static void main()
  {
  
      MoiraProject1 a = new MoiraProject1 (); 
      System.out.println("You are a con man and you want to make money by improper ways."+
      "This is a game tesing your ability to cheat."+
      "Choose a difficult level (1-4)");
      Scanner input = new Scanner(System.in);
      int b = input.nextInt();
      System.out.println(a.method(b));
      
  }
}

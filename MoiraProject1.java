/**
 *Instructor: Mr.Daniel
 *Producer:Moira Hu
 *Class:S3C7
 *Description:The project made in Mr.Daniel’s Computer Science Class
 */
import java.util.Random;
import java.util.Scanner;
public class MoiraProject1
{
    public String method(int a)
    {   
        int result = 0;
        if (a==1)
        {
         int total=20;
         System.out.println("One day, you want to use fake money to buy some fruits in the shop..."+ 
         "The seller tells you that you should pay $20 to him."+
         "How much fake money will you use? (input integer only.)");
         Scanner input = new Scanner(System.in);
         int money=input.nextInt();
         int possibility=money/total;
         if (possibility>95)
         {
             result = 1;
         }
         else
         {
             result = 2;
         } 
        }
        else if(a==2)
        {
         int total=1000;
         System.out.println("One day, you want to use fake money to purchase a computer..."+ 
         "The computer costs $1000."+
         "How much fake money will you use? (input integer only.)");  
         Scanner input = new Scanner(System.in);
         int money=input.nextInt();
         int possibility=money/total;
         if (possibility>80)
         {
             result = 1;
         }
         else
         {
             result = 2;
         } 
        }
        else if(a==3)
        {
         int total=30000;
         System.out.println("One day, you want to use fake Zimbabwe money to exchange Dollars in the bank..."+ 
         "You want to exchange 30000 Zimbabwe money in total."+
         "How much fake money will you use? (input integer only.)");  
         Scanner input = new Scanner(System.in);
         int money=input.nextInt();
         int possibility=money/total;
         if (possibility>60)
         {
             result = 1;
         }
         else
         {
             result = 2;
         } 

        }
        
        if (result==1)
        {
           return "Sorry, you failed. You use too much fake money.";
        }
        else
        { 
            return "You got it!";
        }
    }
}

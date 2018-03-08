
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book extends Library
{
    private boolean isrequested;
    public Book (String title, String author, int itemid, boolean itemOnloan, Double itemDuedate, boolean isrrequested)
    {
        super(title, author, itemid, itemOnloan, itemDuedate, isrrequested);
        isrrequested=isrequested;
    }
    public void printDetails()
    {
        super.printDetails();
        if(isrequested)
        {
            System.out.println("It is requested."); 
        }
        else
        {
            System.out.println("It is not requested."); 
        }
    }
    
}

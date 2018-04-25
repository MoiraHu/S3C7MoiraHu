/**
 * The answer of Q3 of frq of 2017's practice.
 *
 * @Moira

 */
public class FrqQ3
{
   public void replaceNthOccurence(String str, int a, String repl)
   {
       int loc=findNthOccurence(str, n);
       if (loc!=-1)
       {
           currentPhrase=currentPhrase.substring(0.loc)+repl+currentPhrase.substring(loc+str.length());
        }
    }
    
    public int findLastOccurence(String str)
    {
        int n=1;
        while (findNthOccurrence (str,n+1)!=-1)
        {
            n++;
        }
        return findNthOccurrence(str,n);
    }
}

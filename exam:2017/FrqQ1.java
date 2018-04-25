
/**
 * The answer of Q1 of frq of 2017's practice.
 *
 * @Moira

 */
public class FrqQ1
{
   public Digits(int num)
   {
       digitList = new Arraylist<Integer>();
       while (num>0)
       {
           digitList.add(0, new Integer(num%10));
           num/=10;
        }
       if (num==0)
       {
          digitList.add(new Integer(0));  
       }
    }
    
    public boolean isStrictlyIncreasing()
    {
        for (int i =0;i<digitList.length-1;i++)
        {
            if(digitList[i]>digitList[i+1] && digitList[i]=digitList[i+1])
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }
    
}

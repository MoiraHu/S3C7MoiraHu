
/**
 * The answer of Q4 of frq of 2017's practice.
 *
 * @Moira

 */
public class FrqQ4
{
    public static Position findPosition (int num, int[][] intArr)
    {
        for (int row=0; row<intArr.length; row++)
        {
            for (int col=0; col<intArr[0].length; col++)
            {
                if (intArrprow][col]==num)
                {
                    return new Position(row,col);
                }
            }
        }
        return null;
        
    }
    
    public static Position[][] getSuccessorArray(int[][] intArr)
    {
        Position[][] newArr=new Position [intArr.length][intArr[0].length];
        for (int row=0; row<intArr.length; row++)
        for (int col=0; col<intArr[0].length.col++)
        {
            new Arr[row][col]=findPosition(intArr[row][col]+1, intArr);
        }
        return newArr;
        
    }
    
}

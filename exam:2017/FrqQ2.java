
/**
 * The answer of Q2 of frq of 2017's practice.
 *
 * @Moira

 */
public class FrqQ2
{
    public class MultPractice implements StudyPractice
    {
        private int first;
        private int second;
        public MultPractice(int n,int m)
        {
            first=n;
            second=m;
        }
        public String getProblem()
        {
            return first +"TIMES"+second;
        }
        public void nextProblem()
        {
            second++;
        }
      
    }
}

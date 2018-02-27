import java.util.ArrayList;  
import java.util.List;  
/* 
 * A project made in Mr.Daniel's Class
 * Moira Hu
 * Counting-killing game! 
 * A set of players with their numbers make a circle, like A, B, C, D, E, F, G, then goes back to A ， 
 * If we count a number like 8, then ABCDEFGA, the eighth is A.
 * A is killed. 
 *  
 * 
 */  
public class WinterProject {  
      
    public static void main() {  
          
        final int num =8;  
        List<People> lp = new ArrayList<People>();  
          
        People p1 = new People(1,"A");  
        People p2 = new People(2,"B");  
        People p3 = new People(3,"C");  
        People p4 = new People(4,"D");  
        People p5 = new People(5,"E");  
        People p6 = new People(6,"F");  
        People p7 = new People(7,"G");  
          
        lp.add(p1);  
        lp.add(p2);  
        lp.add(p3);  
        lp.add(p4);  
        lp.add(p5);  
        lp.add(p6);  
        lp.add(p7);  
  
        int size = lp.size();  
        for (int i = 0; i < size; i++) {  
            int newSize = lp.size();  
            while(newSize<num){//Creat a set  
                lp.addAll(lp);  
                newSize=lp.size();  
            }  
            System.out.print("The circle");  
            for (People people : lp) {  
                System.out.print(" "+people.getName());  
            }  
            System.out.println("The dead："+lp.get(num-1).getName());  
            People p = lp.get(num-1);  
            while(lp.contains(p)){//Delete the deads in the game
                lp.remove(p);  
            }  
        }  
    }  
}  
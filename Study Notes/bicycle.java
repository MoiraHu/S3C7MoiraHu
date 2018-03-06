/**
 * Editor: Moira Hu
 * Instructor: Daniel Gunn 
 */
import java.util.*;

public class bicycle {
	
	private double mass; 
	private int maximumSpeed; 
	private Random random; 
	
	public bicycle (double a, int b) 
	{
		mass=a;
		maximumSpeed = b; 
		random = new Random();
	}
	
	public boolean runningonRoad() 
	{
	
		boolean a=true; 
		
		if (mass>15) 
		{ 
		    a= false;
		}
		
		
		if (maximumSpeed>12) 
		{
		    a=false;
		}
		
		return a; 
	}
	
	public double getMass() 
	{
	    return mass;
	}
	   
	public int getMaximumSpeed() 
	{
	    return maximumSpeed;
	}
	
	public void setMass(double b )
	{ 
	    mass=b;
	}
	public void setMaximumspeed(int c) 
	{
	    maximumSpeed=c;
	}
	
	public static void main ()
	{
		bicycle b = new bicycle (17,20); 
		
		System.out.println("what is the mass and the speed of this bicycle");
		System.out.println("the mass is " + b.getMass());
		System.out.println("the speed is " + b.getMaximumSpeed());
		
		System.out.println("can it pass through?");
		System.out.println(b.runningonRoad());

		
		b.setMass(13);
		b.setMaximumspeed(8);
		System.out.println("now we change into mass of "+ b.getMass() +" and the speed of "+ b.getMaximumSpeed());
		System.out.println("now can it pass through?");
		System.out.println(b.runningonRoad());
		
	
	}

	

}

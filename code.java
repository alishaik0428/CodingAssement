
import java.util.Scanner;
import java.util.*;
class Job{
	int start_time;
	int end_time;
	int earnings;
	public Job(int start_time, int end_time, int earnings) {
		super();
		this.start_time = start_time;
		this.end_time = end_time;
		this.earnings = earnings;
	}
	
}
public class Factory {

	  public static void main(String [] args)
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter how many jobs");
	    int r = sc.nextInt();
	    Job[] jb=new Job[r];
	    for(int i=0;i<r;i++) {
	    	System.out.println("enter val");
	    	jb[i]=new Job(sc.nextInt(),sc.nextInt(),sc.nextInt());
	    
	    }
	  
	    int result[] = calculate(jb);
	    for(int i: result)
	    {
	      System.out.println(i);
	    }
	  }
	  public static int[] calculate(Job[] arr)
	  {
	    int max =arr[0].earnings;
	    int sum =0;
	    int output[]=new int[2];
	    for(int i=0;i<arr.length;i++)
	    {
	      sum+=arr[i].earnings;
	      if(max<arr[i].earnings) {
	    	  max=arr[i].earnings;
	      }
	     
	    }
	    output[0] =arr.length-1;
	      output[1] = sum-max;
	      
	    return output;
	    
	  }
	}



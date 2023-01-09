
import java.util.Scanner;
import java.util.*;

public class Factory {

	  public static void main(String [] args)
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter how many jobs");
	    int r = sc.nextInt();
	    
	    System.out.println("Enter how cols");
	    int c = sc.nextInt();
	    
	    
	    int[][] arr = new int[r][c];
	    for(int i=0;i<arr.length;i++)
	    {
	      for(int j=0;j<arr[i].length;j++)
	      {
	        arr[i][j] = sc.nextInt();
	      }
	    }
	    int result[] = calculate(arr);
	    for(int i: result)
	    {
	      System.out.println(i);
	    }
	  }
	  public static int[] calculate(int[][] arr)
	  {
	    int max =arr[0][2];
	    int sum =0;
	    int output[]=new int[2];
	    for(int i=0;i<arr.length;i++)
	    {
	      sum+=arr[i][2];
	      if(max<arr[i][2]) {
	    	  max=arr[i][2];
	      }
	     
	    }
	    output[0] =arr.length-1;
	      output[1] = sum-max;
	      
	    return output;
	    
	  }
	}



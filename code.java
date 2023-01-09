public class Factory
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
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
    int max =a[0][2];
    int sum =0;
    for(int i=0;i<arr.length;i++)
    {
      sum+=a[i][2];
      result[0] =arr.length-1;
      result[1] = sum-max;
      return result;
    }
    
  }
  

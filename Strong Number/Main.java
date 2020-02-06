import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      int sum=0;
      while(n!=0)
      {
        int r=n%10;
        int s=1;
      	for(int i=1;i<=r;i++)
      	{
        	s = s*i;
        }
        sum=sum+s;
        n=n/10;
      }
      if(sum==temp)
     	 System.out.println("Yes");
      else
        System.out.println("No");	
      
      // code to find whether it is strong or not.  by naveen
	}
}
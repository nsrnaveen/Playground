import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int[]array;
      int i=0;
      array=new int [10];
      int count=0;
      while (n!=0)
      {
        int r =n%10;
        count++;
        array[i]=r;
        n=n/10;
        i++;
      }
      System.out.println(array[1]);
        
	}
}

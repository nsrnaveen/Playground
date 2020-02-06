import java.util.Scanner;
class Main {
public static void main (String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int[] arr;
int i=0;
 arr=new int[5];
 while(n!=0)
 {
 int r=n%10;
 arr[i]=r;
 n=n/10;
i++;
 }
 System.out.println(arr[i-2]);
}
}
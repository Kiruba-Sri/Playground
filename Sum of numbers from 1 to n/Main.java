import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner ob= new Scanner(System.in);
      int n=ob.nextInt();
      int sum=0;
      for(int i=1;i<=n;i++)
      {
         sum=i+sum;
      }
        System.out.println(sum);
      
	}
}
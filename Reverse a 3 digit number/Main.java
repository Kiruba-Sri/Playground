import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   int n,f,s,t,r;
    Scanner ob= new Scanner(System.in);
    n=ob.nextInt();
    f=n/100;
    s=n/10;
    s=s%10;
    t=n%10;
    r=(t*100)+(s*10)+f;
    System.out.println(r);//Type your code here
  }
}
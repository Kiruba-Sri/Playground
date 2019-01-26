import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code her
      int a,b,c;
      Scanner ob= new Scanner(System.in);
        a=ob.nextInt();
      b=ob.nextInt();
      c=ob.nextInt();
      if(a>b)
      {
        System.out.println(a);
      }
      else if(b>c)
      {
        System.out.println(b);
      }
      else
      {
        System.out.println(c);
      }
      
    }
}
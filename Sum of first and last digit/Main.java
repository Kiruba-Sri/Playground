import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner ob = new Scanner (System.in);
      int n = ob.nextInt();
      int lastDigit = n%10; 
      while (n>=10)
      {
        n=n/10;
      }
      int sum = n+lastDigit;
      System.out.println(sum);
	}
}
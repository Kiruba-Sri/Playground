import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner ob= new Scanner(System.in);
      int mark= ob.nextInt();
      if(mark>=85)
      {
        System.out.println("A");
      }
      else if(mark>=75)
      {
        System.out.println("B");
      }
      else if(mark>=65)
      {
        System.out.println("c");
      }
      else if(mark>=55)
      {
        System.out.println("D");
      }
      else if(mark>=45)
      {
        System.out.println("e");
      }
      else
      {
        System.out.println("Fail");
      }
      
       
    }
}
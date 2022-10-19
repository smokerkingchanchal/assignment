package ExceptionHandeling;
  import java.utill.InputMismatchException;
 public class ExceptionHandelingAssignment {
   // main method
 public static void main(String[] args) {
   // creating scanner class  
       Scanner sc = new Scanner(System.in);
     System.out.println("Enter two integer number:");
  try { //out try block 
      try { // inner try block
 int x = sc.nextInt();
 int y = sc.nextInt();
   System.out.println(" "+x/y);
} catch(ArithmeticException e) { // catch block in inner try block
   System.out.println(e);
} 
   } catch (Exception e) { //catch block in outer try block 
     System.out.println(e);
   }
 }
}
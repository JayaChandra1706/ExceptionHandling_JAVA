import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionExample {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        try{
	                System.out.println("Connection Established");
	                System.out.println("Enetr 2 numbers");
	                int a=scan.nextInt();
	                int b=scan.nextInt();
	                int c=a/b;
	                System.out.println(c);
	                System.out.println("Enetr Array Length");
	                int len=scan.nextInt();
	                int arr[]=new int[len];
	                System.out.println("Enetr the Element to Insert");
	                int ele=scan.nextInt();
	                System.out.println("Enetr position to Insert");
	                int pos=scan.nextInt();
	                arr[pos]=ele;
	                System.out.println("Element "+ele+" is Successfully Inserted At "+pos);
	        }
	        catch(ArithmeticException e){
	            System.out.println("Arithmetic problem Occured");
	        }
	        catch(NegativeArraySizeException e){
	            System.out.println("negitive cannot be a Array Size");
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	            System.out.println("Array out of Bound");
	        }
	        catch(InputMismatchException e){
	            System.out.println("Input is Invalid Try Again");
	        }
	        catch(Exception e){
	            System.out.println("Some Problem Occured Try Again");
	        }
	        System.out.println("Connection Terminated");
	        
	    }
}

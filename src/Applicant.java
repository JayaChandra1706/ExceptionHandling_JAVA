import java.util.Scanner;
public class Applicant {
	Scanner scan=new Scanner(System.in);
    int age;
    public void getInput(){
        System.out.println("Enter Your Age:");
        age=scan.nextInt();
    }
    public void verify() throws Exception{
        if(age < 18){
            LessAgeException lae=new LessAgeException();
            System.out.println(lae.getMessage()); 
            throw lae;
        }
        else if(age > 50){
            MoreAgeException mae=new MoreAgeException();
            System.out.println(mae.getMessage());
            throw mae;
        }
        else{
            System.out.println("Application Successfully Completed");
        }
    }
}

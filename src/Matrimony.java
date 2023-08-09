
public class Matrimony {
	public void initiate(){
	    Applicant app=new Applicant();
	    try{
	        app.getInput();
	        app.verify();
	    }
	    catch(Exception e1){
	        try {
	            app.getInput();
	            app.verify();
	        } catch (Exception e2) {
	            try {
	                app.getInput();
	                app.verify();
	            } catch (Exception e3) {
	                System.out.println("Your Application is blocked");
	            }
	        }
	    }
	}
}

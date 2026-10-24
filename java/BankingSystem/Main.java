import java.util.*;

public class Main {

	public static void main(String[] args) {

		Process process = new Process();
		Printer print = new Printer();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			
			try {
	
		        for (int i=0; true; i++){
		
		        	 print.welcome();
		        	 int num = scan.nextInt();
		        	 System.out.println("         ");
		        	 
		             if(num == 1){
		
		            	process.add(print.name(), print.age(), print.contactNo());
		            
		            	process.add();
		            	
		                
		                 
		             }else if(num == 2){
		            	
		            	 	String username = print.username();
		            	 		
		            	 	 if(process.adminLogin(username)) {
		            	 		 process.options();
		            	 		 
		            	 	 }else if(process.login(username)) {
		            	 		process.loginProcess(true);
		            	 		 
		            	 	 }
		            	
		             }
		        }
	        
	        }catch(InputMismatchException e) {
	        	System.out.println("Press number only");
	    		System.out.println("         ");
	    		scan.next();
	    	} 	
		}

	}
}

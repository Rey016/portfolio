import java.util.Scanner;

public class Printer {
	Scanner scan = new Scanner(System.in);
	
	void welcome() {
		
        System.out.println("Welcome to MyBank");
        System.out.println("1. Add Account ");
        System.out.println("2. Login");
        System.out.print("Press number: ");
        
	 }
	
	void newprocess() {
		for(int i = 0 ; i < 1000; i++) {
			System.out.print("\n");
		}
	 }
	
	String name() {
		System.out.print("Enter your name: ");
		String name = scan.next();
		return name;
	}
	
	int age() {
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		return age;
	}
	
	String contactNo() {
		for(int i = 0 ; true ; i++) {
			System.out.print("Enter contact number: +63");
			String contactno = scan.next();
			
			if(contactno.length()!=10) {
				System.out.println("Enter 10 numbers");
				
			}else {
				return contactno;
			}
		}
	}
	
	String username() {
		System.out.print("Enter username: ");
		String username = scan.next();
		return username;
	}
	
	String password() {
		System.out.print("Enter password: ");
		String password = scan.next();
		return password;
	}
	
}

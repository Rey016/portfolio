import java.util.ArrayList;
import java.util.Scanner;

public class Process extends Admin implements Login{
	Scanner scan = new Scanner(System.in);
	ArrayList<Accounts> acc = new ArrayList<Accounts>();
	ArrayList<Information> info = new ArrayList<Information>();
	Accounts admin = new Accounts();
	int index;

	void add(String name, int age, String contactno) {
		info.add(new Information(name, age, contactno));
	}
	
	void add(){
		
			
			if(acc.size()==0) {
				System.out.print("Enter username: ");
				String username = scan.next();
				System.out.print("Enter password: ");
				acc.add(new Accounts(username, scan.next()));
				System.out.println(" ");
				System.out.println("Account added successfully ");
				
				
				
			}else{
				for(int t = 0 ; true ; t++) {
					boolean isDif=false;
					System.out.print("Enter username: ");
					String username = scan.next();
					
				for(int i = 0 ; i < acc.size();i++) {
					
					if(acc.get(i).getUsername().equals(username)) {
						System.out.println("Username is already taken");
						System.out.println(" ");
						
					}else {
						isDif=true;
					}
					
				}
				
				if(isDif==true) {
					System.out.print("Enter password: ");
					acc.add(new Accounts(username, scan.next()));
					System.out.println(" ");
					System.out.println("Account added successfully ");
					break;
				}
			
				}
				
				
			}
		
		
	}
	
	boolean adminLogin(String adminusername) {
		boolean verification=false;
		int attempts=0;
		
		if(adminusername.equals(admin.getAdminUsername())) {
			
			for(int j = 0 ; true ; j++) {
				System.out.print("Enter password: ");

				if(admin.getAdminPassword().equals(scan.next())) {
					verification = true;
					break;
	
				}else{
					
					System.out.println("Incorrect password ");
					System.out.println(" ");
					attempts++;
					
					if(attempts==3) {
						break;
					}
				}
			}	
		}
		return verification;
	}

	boolean login(String username) {
		boolean verification=false;
		int attempts=0;

			for(int i = 0 ; i < acc.size();i++) {
				if(acc.get(i).getUsername().equals(username)) {
				
					for(int j = 0 ; true ; j++) {
						System.out.print("Enter password: ");
						if(acc.get(i).getPassword().equals(scan.next())) {
						
							verification = true;
							index = i;
							break;
						}else {
						
							System.out.println("Incorrect password ");
							System.out.println(" ");
							attempts++;
						
							if(attempts==3) {
								break;
							}
						}
					}
				break;
				}else {
					System.out.println("Username is not registered");
					System.out.println(" ");
					break;
				}
			}	
		return verification;
	}

	void editAccount() {

		
		System.out.println("1. Name: " + info.get(index).getName() );
		System.out.println("2. Age: " + info.get(index).getAge());
		System.out.println("3. Contact number: " + info.get(index).getContactNo());
		System.out.println("4. Username: "+acc.get(index).getUsername());
		System.out.print("5. Password: " );
		for (int i = 0 ; i < acc.get(index).getPassword().length() ; i++) {
			System.out.print("*" );
		}
		System.out.println(" " );
		System.out.println("6. exit" );
		System.out.print("press a number: " );

		switch (scan.nextInt()) {
		case 1:
			System.out.print("Enter Name: ");
			info.get(index).setName(scan.next());
			break;
		case 2: 
			System.out.print("Enter Age: ");
			info.get(index).setAge(scan.nextInt());
			break;
		case 3: 
			System.out.print("Enter Contact number: ");
			info.get(index).setContactNo(scan.next());
			break;
		case 4: 
			System.out.print("Enter Username: ");
			acc.get(index).setUsername(scan.next());
			System.out.println("Password changed");
			break;
		case 5: 
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print("Enter password: ");
				String first = scan.next();
				System.out.print("Confirm password: ");
				String second = scan.next();
				if(first.equals(second)) {
					acc.get(index).setPassword(second);
					System.out.println("Password changed");
					break;
				}else {
					System.out.println("Does not match");
				}
			}
			break;
		case 6: 
			break;
		}
	}
	
	void options() {
		for(int o = 0 ; true ; o++) {

			System.out.println("1. Show accounts ");
			System.out.println("2. Delete accounts ");
			System.out.println("3. Edit Account  ");
			System.out.println("4. logout ");
			System.out.print("press a number:  ");
			
			switch (scan.nextInt()) {
			case 1:
				showAccounts();
				continue;
			case 2: 
				deleteAccount();
				continue;
			case 3:
				editAdminAccount();
				continue;
			case 4:
				for(int i = 0 ; i < 1000; i++) {
					System.out.print("\n");
				}
				break;
				}
			break;

		}
	}
	
	void showAccounts() {
		 
		System.out.printf("%-5s%-15s%-10s" ,"No.", "Name","Balance" );
		System.out.println("" );
		System.out.println("" );
		
		for(int i = 0 ; i < acc.size() ; i++) {
			System.out.printf("%-5s%-15s%-10s", i+1,info.get(i).getName(),acc.get(i).getBalance());
			System.out.println(" " );
		}
		System.out.println(" ");
		System.out.printf("%s" , "_______________________________");
		System.out.println(" ");
	}
	
	void deleteAccount() {
		showAccounts();
		
		System.out.println("");
		System.out.print("press number: ");
		int no = scan.nextInt()-1;
		if(no < acc.size() &&  no >= 0) {
			if(acc.get(no).getBalance()==0) {
				
				acc.remove(no);
			}else {
				
				System.out.println("You can only delete account with zero (0) balance. ");
			}
		}else {
			System.out.println("Invalid input ");
		}
		
			
		}
	
	void editAdminAccount() {
		for(int i = 0 ; true ; i++) {
			
			System.out.println("1. Username: "+admin.getAdminUsername());
			System.out.println("2. Password: ****" );
			System.out.println("3. exit ");
			System.out.print("press a number:  ");
			
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter username: " );
				admin.setAdminUsername(scan.next());
				continue;
			case 2: 
				for(int j = 0 ; j < 3 ; j++) {
					System.out.print("Enter password: ");
					String first = scan.next();
					System.out.print("Confirm password: ");
					String second = scan.next();
					if(first.equals(second)) {
						admin.setAdminPassword(second);;
						System.out.println("Password changed");
					}else {
						System.out.println("Does not match");
					
					}
				}
				break;
			case 3:
				break;
			}
			break;
		
		}

	}

	public double showBalance() {
		double balance=acc.get(index).getBalance();
		return balance;

	}
	
	public void deposit(double deposit) {
		acc.get(index).deposit(deposit);
	}
	
	public void withdraw(double withdraw) {
		if(acc.get(index).getBalance() < withdraw) {
			System.out.println("Your balance is " + acc.get(index).getBalance());
		}else {
			acc.get(index).withdraw(withdraw);
		}
		
	}
	
	public void loginProcess(boolean isIn) {
		
		System.out.println("Welcome " + info.get(index).getName()+"!\n");
		if(isIn==true) {
			for(int i = 0 ; true ; i++) {

				System.out.println("1. Show Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Edit");
				System.out.println("5. logout\n");
				System.out.print("press a number: ");
				
				switch (scan.nextInt()) {
				case 1:
					System.out.println("\nyour balance is: " + showBalance() +"\n");
					continue;
				case 2: 
					System.out.print("Enter amout to deposit: " );
					double deposit = scan.nextDouble();
					deposit(deposit);
					System.out.println("You deposit " + deposit + "\n");
					continue;
				case 3:
					System.out.print("Enter amout to withdraw: " );
					double withdraw = scan.nextDouble();
					withdraw(withdraw);
					continue;
				case 4:
					editAccount();
					continue;
					
					
				case 5:
					break;
					
					}
				break;
			}
		}	
	}
}

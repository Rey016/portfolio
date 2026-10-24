 class Accounts {
	private String username,password;
	private String adminusername = "admin", adminpassword = "123";
	private int code =190;
	private double balance;
	private String name,contactno;
	private int age;
	
	Accounts(){}

	Accounts(String username, String password){
		
		this.username=username;
		this.password=password;
	}
	
	Accounts(String adminusername, String adminpassword, int code){
		
		this.adminusername=adminusername;
		this.adminpassword=adminpassword;
		this.code=code;
	}
	
	String getName() {
		return name;
	}
	
	String getContactNo() {
		return contactno;
	}
	
	String getAdminUsername() {
		return adminusername;
	}
	
	String getAdminPassword() {
		return adminpassword;
	}
	
	String getUsername() {
		return username;
	}
	
	String getPassword() {
		return password;
	}
	
	int getCode() {
		return code;
	}
	
	int getAge() {
		return age;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	void setContactNo(String contactno) {
		this.contactno=contactno;
	}
	
	void setAge(int age) {
		this.age=age;
	}

	void setBalance(double amount) {
		this.balance=amount;
	}
	
	void setUsername(String username) {
		this.username=username;
	}
	
	void setPassword(String password) {
		this.password=password;
	}
	
	void setAdminUsername(String adminusername) {
		this.adminusername=adminusername;
	}
	
	void setAdminPassword(String adminpassword) {
		this.adminpassword=adminpassword;
	}
	
	void setCode(int code) {
		this.code=code;
	}
	
	void deposit( double amount) {
		this.balance=balance+amount;
	}
	
	void withdraw( double amount) {
		this.balance=balance-amount;
	}
	
}

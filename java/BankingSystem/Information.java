
public class Information {
	private String name,contactno;
	private int age;

	Information(String name, int age, String contactno){
		
		this.name=name;
		this.age=age;
		this.contactno=contactno;
	
	}
	
	String getName() {
		return name;
	}
	
	String getContactNo() {
		return contactno;
	}
	
	int getAge() {
		return age;
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
	
}

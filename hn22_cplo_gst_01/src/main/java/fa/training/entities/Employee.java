package fa.training.entities;

public class Employee {

	String id;
	String employeeName;
	int age;
	String address;
	String email;
	String phoneNumber;
	
	public Employee(String id, String employeeName, int age, String address, String email, String phoneNumber) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Employee(String id, String employeeName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id.isEmpty()) {
			throw new IllegalArgumentException("Id cannot null");
		}this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + "]";
	}
		
}

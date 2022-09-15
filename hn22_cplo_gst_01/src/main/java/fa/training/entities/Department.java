package fa.training.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	List<Employee> employees;
	private String deptId;
	private String deptName;
	public Department(List<Employee> employees, String deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		
		Employee employee = new Employee();
		employee.id="100";
		employee.employeeName = "Hung";
		
		employees = new ArrayList<Employee>();
		
		employees.add(employee);
	}
	
}

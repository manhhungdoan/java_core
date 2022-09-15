package fa.training.main;

import java.util.Scanner;

import fa.training.dao.EmployeeDao;
import fa.training.entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee employee =  new Employee("110", "Hung");
//		employee.setEmployeeName("Hung");
		
		Scanner scanner = new Scanner(System.in);
		String id;
		do {
			System.out.println("Enter id: ");
			id = scanner.nextLine();
			try {	
				employee.setId(id);
			} catch (IllegalArgumentException e) {
			// TODO: handle exception
				continue;
			}
			break;
		}while(true);
		//Hien thi du lieu
		System.out.println(employee);
		
		//Luu vao co so du lieu
//		EmployeeDao employeeDao = new EmployeeDao();
//		employeeDao.save(employee);
//		
		
	}

}

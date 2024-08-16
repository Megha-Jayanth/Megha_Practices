package megha_practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeBasedOnGender {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("Megha","Female"));
		employees.add(new Employee("Jayant","Male"));
		employees.add(new Employee("Sruti","Female"));
		employees.add(new Employee("Rithin","Male"));
		
		Map<String,List<Employee>> groupedEmployee=EmployeeBasedOnGender(employees);
		
		System.out.println("Male Employees:");
        for (Employee employee : groupedEmployee.get("Male")) {
            System.out.println(employee.empName);
        }
		
        System.out.println("Female Employees:");
        for (Employee employee : groupedEmployee.get("Female")) {
            System.out.println(employee.empName);
        }

	}

	private static Map<String, List<Employee>> EmployeeBasedOnGender(List<Employee> employees) {
		
		
		Map<String,List<Employee>>groupedEmployee=new HashMap<>();
		
		for(Employee employee:employees) {
			
			if(!groupedEmployee.containsKey(employee.empGender)) {
				groupedEmployee.put(employee.getEmpGender(),new ArrayList<>());
				
			}
			groupedEmployee.get(employee.empGender).add(employee);
		}
		
		return groupedEmployee;
	}

}

package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
	private void empName() {
		// TODO Auto-generated method stub
System.out.println("emp name : Karthik");
	}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empName();
	Company c = new Company();
	c.companyName();
	Client c1 = new Client();
	c1.clientName();
	Project p = new Project();
	p.projectName();
	
	}
}

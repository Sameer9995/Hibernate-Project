package com.jsp.ems.view;

import java.util.Scanner;

import com.jsp.ems.controller.Controller;
import com.jsp.ems.model.Department;
import com.jsp.ems.model.Employee;
import com.jsp.ems.model.Project;

public class View {
	
	static Controller controller = new Controller();
	static Scanner myInput = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		do {

			System.out.println("SELECT THE OPERATION WHICH YOU HAVE TO PERFORM :   ");
			System.out.println("1.Add Employee \n 2.View Employee \n 3.Update Employee \n 4.Remove Employee \n 5.Add department \n 6. View Department \n 7. Add Project \n 8. View project \n 0.Close");
			System.out.println("Enter the Digit Respective to Desired Option : ");
			
			int userInput = myInput.nextInt();
			myInput.nextLine();
			
			switch (userInput) {
			case 0:
				
				myInput.close();
				System.out.println("====== |||||| === EXITED === |||||| ======");
				System.exit(userInput);
				
				break;
				
			case 1:
				
				//ADD EMPLOYEE 
				
				Employee employee = new Employee();
				
				System.out.println("Enter Employee Name : ");
				employee.setName(myInput.nextLine());
				myInput.nextLine();
				System.out.println("Enter Employee Position : ");
				employee.setPosition(myInput.nextLine());
				myInput.nextLine();
				System.out.println("Enter Employee Salary : ");
				employee.setSalary(myInput.nextDouble());
				myInput.nextLine();
				
				if (controller.AddEmployee(employee)) {
					System.out.println("Employee Details Added Successfully");
				} else {
					System.out.println("Not Inserted");
				}
				
				
				break;
				
			case 2:
				
				//VIEW EMPLOYEE DETAILS 
				System.out.println("Select the Employee ID to View :  ");
				int empIdToFind = myInput.nextInt();
				myInput.nextLine();
				
				Employee employee1 = controller.findemployee(empIdToFind);
			
				if(employee1 != null)
				{
					System.out.println("\\\\\\ ||| ==== Employee Details ==== ||| //////");
					System.out.println("Employee Id  : " +  employee1.getId());
					System.out.println("Employee name : " + employee1.getName());
					System.out.println("Employee Position : " + employee1.getPosition());
					System.out.println("Employee Salary : " + employee1.getSalary());
					System.out.println("Employee Date of Joining : " + employee1.getDate_of_joining());
						
				} else {
					System.out.println("Data Not Found With Given ID");

				}
				
				
				
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				
				//ADD DEPARTMENTS DETAILS
				
				Department department = new Department();
				
				System.out.println("Enter Department Name : ");
				department.setName(myInput.nextLine());
				myInput.nextLine();
				
				if (controller.AddDepartment(department)) {
					System.out.println("Department Details Inserted Successfully");
				} else {
					System.out.println("Department details not Inserted");
				}
				
				
				
				break;
				
			case 6:
				
				//VIEW DEPARTMENT DEPARTMENTS
				
				System.out.println("Select the Department ID to View : ");
				int deptIdToFind = myInput.nextInt();
				myInput.nextLine();
				
				Department department1 = controller.finddepartment(deptIdToFind);
				
				if(department1 != null) {
					System.out.println("\\\\\\ ||| ==== Department Details ==== ||| //////");
					System.out.println("Department ID : " + department1.getId());
					System.out.println("Department name : " + department1.getName());
				} else {
					System.out.println("Data Not Found With Given ID");
				}
				
				
				break;
				
			case 7:
				
				//ADD PROJECT DETAILS 
				
				Project project = new Project();
				
				System.out.println("Enter Project Name : ");
				project.setName(myInput.nextLine());
				myInput.nextLine();
				System.out.println("Enter Project Description : ");
				project.setDescription(myInput.nextLine());
				myInput.nextLine();
				
				
				if (controller.Addproject(project)) {
					System.out.println("Project Details inserted Successfully");
				} else {
					System.out.println("Project details not Inserted");
				}
				
				break;
				
			case 8:
				
				//VIEW PROJECT DETAILS
				
				System.out.println("Select the Project ID to View : ");
				int projectIdToFind = myInput.nextInt();
				myInput.nextLine();
				
				Project project1 = controller.findproject(projectIdToFind);
				
				if(project1 != null) {
					System.out.println("\\\\\\ ||| ==== Project Details ==== ||| //////");
					System.out.println("Project ID : " + project1.getId());
					System.out.println("Project Name : " + project1.getName());
				} else {
					System.out.println("Data Not Found With Given ID");
				}
				
				
				
				break;

			default:
				break;
			}

		} while (true);	

	}

}

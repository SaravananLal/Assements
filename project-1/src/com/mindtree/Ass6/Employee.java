package com.mindtree.Ass6;

public class Employee implements Comparable<Employee> {
	
	int EmpId;
	String Name;
	String address;
	String desgnation;
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	double Salary;
	
	Employee(int EmpId,String Name,String address,String designation,double Salary)
	{
this.EmpId=EmpId;
this.Name=Name;
this.address=address;
this.desgnation=designation;
this.Salary=Salary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesgnation() {
		return desgnation;
	}

	public void setDesgnation(String desgnation) {
		this.desgnation = desgnation;
	}

	public String toString()
	{
		return Name;
		
	}
	
	
	public int compareTo(Employee Emp) {
		// TODO Auto-generated method stub
		if(EmpId==Emp.EmpId)
		{
		return 0;
		}
		else if(EmpId>Emp.EmpId)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
}

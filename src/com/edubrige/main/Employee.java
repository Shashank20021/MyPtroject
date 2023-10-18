package com.edubrige.main;

public class Employee 
{
  public int employee_id;
  public String employee_name;
  public Long employee_sal;
public Employee(int employee_id, String employee_name, Long employee_sal) {
	super();
	this.employee_id = employee_id;
	this.employee_name = employee_name;
	this.employee_sal = employee_sal;
}
@Override
public String toString() {
	return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_sal="
			+ employee_sal + "]";
}
}

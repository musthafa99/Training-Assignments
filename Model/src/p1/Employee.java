package p1;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee(int id,String firstname,String lastname,int salary)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
	public int getID()
	{
		return id;
	}
	public String getFirstName()
	{
		return firstname;
	}
	public String getLastName()
	{
		return lastname;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getAnnualSalary()
	{
		return salary*12;
	}
	public int raiseSalary(int percent)
	{
		salary=salary+(salary*percent)/100;
		return (int)salary;
	}
	public String getName()
	{
		return firstname+" "+lastname;
	}
	public String toString()
	{
		return "EMPLOYEE[Id=" + id + " FirstName= " + firstname + " LastName= " + lastname + " Salary=" + salary +"]";
	}
}

import java.util.ArrayList;

abstract class Employee
{
    private String name;
    private int id;

    public Employee(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return name;

    }
    public int getId()
    {
        return id;
    }

    abstract public double calculateSalary();

@Override
public String toString()
{
    return "Employee[name="+name+", id="+id+", salary="+calculateSalary()+"]";
   }
}

class FullTimeEmployee extends Employee
{

    private double monthlySalary;
    public FullTimeEmployee(String name, int id, double monthlySalary)
    {
        super(name, id); // to get the name and id from super class using super keyword
        this.monthlySalary = monthlySalary;

    }

@Override

public double calculateSalary()
{
    return monthlySalary;
}

}

class PartTimeEmployee extends Employee
{
    private int hoursWorked;
    private double hourlyRate;


    public PartTimeEmployee(String name, int id, int hoursWorked,double hourlyRate)
    {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

@Override

public double calculateSalary()
{
    return hoursWorked * hourlyRate;

    }

}



class PayRollSystem
{
    private ArrayList<Employee>employeeList;

    public PayRollSystem()
    {
        employeeList = new ArrayList<>();

    }
    public void AddEmployee(Employee employee)
    {
        employeeList.add(employee);
    }
    public void RemoveEmployee(int id)
    {
        Employee employeeToremove = null;
        for(Employee employee : employeeList)
        {
            if(employee.getId() == id)
            {
                employeeToremove = employee;
                break;
            }
        }
        if(employeeToremove != null){
            employeeList.remove(employeeToremove);
        }
    }
    public void displayEmployee(){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }

}


public class main{
public static void main(String args[]){
    PayRollSystem payRollSystem = new PayRollSystem();
    FullTimeEmployee emp1 = new FullTimeEmployee("sudarshan", 1, 70000);
   
   PartTimeEmployee emp2 = new PartTimeEmployee("rohan", 2, 40,100);

   payRollSystem.AddEmployee(emp1);
   payRollSystem.AddEmployee(emp2);
   System.out.println("Initial Employee DEtails: ");
   payRollSystem.displayEmployee();
   System.out.println("Removing Employee......");
   payRollSystem.RemoveEmployee(2);
   System.out.println("Remainig Employee Details:-");
   payRollSystem.displayEmployee();
   }
}
import java.util.ArrayList;

abstract class employee{
    private String name;
    private int id;

    public employee(String naam, int id)
    {
        this.name = naam;
        this.id = id;
    }

    public String getname(){
        return name;
    }
    public int getid()
    {
        return id;
    }

    public abstract double calsalary();

    @Override
    public String toString() {
        return "Employee[name= "+name+" id= "+id+" Salary= "+calsalary()+"]";
    }
}

 class fulltimeEmployee extends employee{
    private double monthlysalary;

    public fulltimeEmployee(String name, int id, double monthlysalary)
    {
        super(name,id);
        this.monthlysalary=monthlysalary;
    }

    @Override
     public double calsalary()
    {
        return monthlysalary;
    }
 }

 class partTimeEmployee extends employee{
     private int workhours;
     private double hourRate;

     public partTimeEmployee(String name, int id, int workhours, double hourRate)
     {
         super(name,id);
         this.hourRate = hourRate;
         this.workhours = workhours;
     }

     @Override
     public double calsalary()
     {
         return workhours*hourRate;
     }

 }
 class payrollsystem
 {
     private ArrayList<employee> employeeList;

     public payrollsystem(){
         employeeList = new ArrayList<>();
     }

     public void addEmployee(employee emp)
     {
         employeeList.add(emp);
     }

     public void removeEmployee(int id)
     {
         employee empremove = null;
         for(employee emp : employeeList)
         {
             if(emp.getid()==id)
             {
                 empremove = emp;
                 break;
             }
         }
         if(empremove != null)
         {
             employeeList.remove(empremove);
         }
         System.out.println(empremove);
     }

     public void displayemployee()
     {
         for(employee emp: employeeList)
         {
             System.out.println(emp);
         }
     }
 }
public class EmployeePayrollSystem {
    public static void main(String[] args) throws Exception{

        payrollsystem prs = new payrollsystem();
        fulltimeEmployee e1 = new fulltimeEmployee("Ram", 101, 32000);
        partTimeEmployee p1 = new partTimeEmployee("Raj", 301,5,500);

        prs.addEmployee(e1);
        prs.addEmployee(p1);

        System.out.println("Intial employee details: ");
        prs.displayemployee();

        System.out.print("Removing employee: ");
        prs.removeEmployee(301);
        System.out.println("Remaining Employees");
        prs.displayemployee();
    }
}

package Employee;

class EmployeeTest
{
    public static void main(String []args)
    {
        Employee []staff = new Employee[3];
        staff[0] = new Employee("Adil" , 20000);
        staff[1] = new Employee("Umar" , 24000);
        staff[2] = new Employee("Arif" , 20430);
        for(Employee e : staff)
        {
            System.out.println("Name :" + e.getName() + "\t Salary :" + e.getSalary() + "\n");
        }
    }
}
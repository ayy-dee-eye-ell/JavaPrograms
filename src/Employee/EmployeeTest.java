public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp[] = new Employee[3];

        emp[0] = new Employee("Adil" , 60000);
        emp[1] = new Employee("Arif" , 20000);
        emp[2] = new Employee("Adnan" , 30000);

        for(Employee e : emp) {
            e.setId();
            System.out.println("Employee_Id : " + e.getId() + "\tName : " + e.getName() + "\tSalary : " + e.getSalary());
        }
    }
}

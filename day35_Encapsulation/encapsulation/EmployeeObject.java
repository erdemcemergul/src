package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tahir", 'M', 30, 120000);

        employee1.setAge(32);


        Employee employee2 = new Employee("Aygün", 'F', 31, 115000);
        employee2.setName("David");
        employee2.setSalary( employee2.getSalary() + 15000 );

        System.out.println(employee1);
        System.out.println(employee2);


    }

}

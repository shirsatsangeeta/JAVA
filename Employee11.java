class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void putdata() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee11 extends Person {
    String emp_desig;
    int emp_sal;
    public Employee11(String name, int age, String emp_desig, int emp_sal) {
        super(name, age);
        this.emp_desig = emp_desig;
        this.emp_sal = emp_sal;
    }
    public void putdata() {
        super.putdata(); 
        System.out.println("Employee Details:");
        System.out.println("Designation: " + emp_desig);
        System.out.println("Salary: " + emp_sal);
    }
    public static void main(String[] args) {
        Employee11 demo = new Employee11("Rudra", 20, "SDE", 200000);
        demo.putdata(); 
    }
}

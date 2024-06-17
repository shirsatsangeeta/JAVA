public class Person {
    String name;
    int age;

    void getdata(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void putdata() {
        System.out.println("employee details:");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}

public class Employee11 extends Person {
    String emp_desig;
    int emp_sal;

    public void getdata(String name, int age, String emp_desig, int emp_sal) {
        super.getdata(name, age);
        this.emp_desig = emp_desig;
        this.emp_sal = emp_sal;
    }

    public void putdata() {
        super.putdata();
        System.out.println("Employee Designation: " + emp_desig);
        System.out.println("Employee Salary: " + emp_sal);
    }
	 public static void main(String args[]) {
        Employee demo = new Employee();
        demo.getdata("Rudra", 20, "SDE", 200000);
        demo.putdata();
    }
}

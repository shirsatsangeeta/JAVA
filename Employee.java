import java.util.Scanner;

class Employee {
    Scanner sc = new Scanner(System.in);
    
    int Employee_id;
    Float salary;
    
    void getdata() {
        System.out.print("\nEnter the Employee ID: ");
        Employee_id = sc.nextInt();
        System.out.print("Enter the Employee Salary: ");
        salary = sc.nextFloat();
    }
    
    void putdata() {
        System.out.println("\nEmployee ID: " + Employee_id);
        System.out.println("Employee Salary: " + salary);
    }
    
    public static void main(String arg[]) {
        Employee[] emp = new Employee[3];
        
        for (int i = 0; i < 3; i++) {
            emp[i] = new Employee();
            emp[i].getdata();
        }
        
        for (int i = 0; i < 3; i++) {
            emp[i].putdata();
        }
    }
}

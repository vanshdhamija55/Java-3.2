import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Simulated "Database Table"
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Amit", 55000));
        employees.add(new Employee(102, "Neha", 60000));
        employees.add(new Employee(103, "Ravi", 48000));
        employees.add(new Employee(104, "Priya", 72000));
        employees.add(new Employee(105, "Raj", 51000));

        System.out.println("============ EMPLOYEE DATABASE SIMULATION ============");
        System.out.println("<form action='EmployeeServlet' method='post'>");
        System.out.println("   Search Employee by ID: <input type='text' name='empid'>");
        System.out.println("   <input type='submit' value='Search'>");
        System.out.println("</form>");
        System.out.println("======================================================");
        System.out.println();

        System.out.println("=== Displaying All Employee Records ===");
        System.out.println("<table border='1'>");
        System.out.println("<tr><th>EmpID</th><th>Name</th><th>Salary</th></tr>");
        for (Employee e : employees) {
            System.out.println("<tr><td>" + e.empId + "</td><td>" + e.name + "</td><td>" + e.salary + "</td></tr>");
        }
        System.out.println("</table>");

        System.out.println("\nEnter an Employee ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for (Employee e : employees) {
            if (e.empId == searchId) {
                System.out.println("\n================= SERVER RESPONSE =================");
                System.out.println("<h3>Employee Details</h3>");
                System.out.println("<p>EmpID: " + e.empId + "</p>");
                System.out.println("<p>Name: " + e.name + "</p>");
                System.out.println("<p>Salary: " + e.salary + "</p>");
                System.out.println("==================================================");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\n================= SERVER RESPONSE =================");
            System.out.println("<h3 style='color:red;'>No Employee Found with ID: " + searchId + "</h3>");
            System.out.println("==================================================");
        }

        sc.close();
    }
}

class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

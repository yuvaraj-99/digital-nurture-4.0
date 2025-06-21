public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        // Corrected Employee constructor usage
        manager.addEmployee(new Employee(1, "Alice", "Developer", 50000));
        manager.addEmployee(new Employee(2, "Bob", "Manager", 60000));

        System.out.println("All employees:");
        manager.traverseEmployees();

        System.out.println("Searching for employee with ID 2:");
        Employee emp = manager.searchEmployee(2);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Deleting employee with ID 1:");
        manager.deleteEmployee(1);
        manager.traverseEmployees();
    }
}

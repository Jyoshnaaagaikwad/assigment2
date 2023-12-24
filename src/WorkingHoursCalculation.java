import java.util.Random;

public class WorkingHoursCalculation {
    public static void main(String[] args) {
        // Displaying the welcome message
        System.out.println("Welcome to Employee wega");

        // Using Random to check employee's type (0 for full-time, 1 for part-time)
        Random rand = new Random();
        int employeeType = rand.nextInt(2); // Generates either 0 or 1 for employee type
        int workingDaysPerMonth = 20; // Assumed working days per month
        int totalWorkingHours = 100; // Assumed total working hours

        EmployeeWegaCalculation.calculateEmployeeWage(employeeType, workingDaysPerMonth, totalWorkingHours);
    }
}

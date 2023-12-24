public class EmployeeWegaCalculation {
    public static void calculateEmployeeWage(int employeeType, int workingDaysPerMonth, int totalWorkingHours) {
        int wagePerHourFT = 20; // Full-time employee's wage per hour
        int fullDayHoursFT = 8; // Full-time employee's full day hours

        int wagePerHourPT = 10; // Part-time employee's wage per hour
        int fullDayHoursPT = 8; // Part-time employee's full day hours

        int totalHoursWorked = 0; // Total hours worked
        int totalDaysWorked = 0; // Total days worked

        switch (employeeType) {
            case 0: // Full-time employee
                System.out.println("Full-time Employee is present");
                while (totalHoursWorked < totalWorkingHours && totalDaysWorked < workingDaysPerMonth) {
                    int dailyWageFT = wagePerHourFT * fullDayHoursFT;
                    totalHoursWorked += fullDayHoursFT;
                    totalDaysWorked++;
                    if (totalHoursWorked <= totalWorkingHours) {
                        System.out.println("Daily wage (Full-time): $" + dailyWageFT);
                    }
                }
                break;
            case 1: // Part-time employee
                System.out.println("Part-time Employee is present");
                while (totalHoursWorked < totalWorkingHours && totalDaysWorked < workingDaysPerMonth) {
                    int dailyWagePT = wagePerHourPT * fullDayHoursPT;
                    totalHoursWorked += fullDayHoursPT;
                    totalDaysWorked++;
                    if (totalHoursWorked <= totalWorkingHours) {
                        System.out.println("Daily wage (Part-time): $" + dailyWagePT);
                    }
                }
                break;
            default:
                System.out.println("Invalid employee type");
                break;
        }
        System.out.println("Total hours worked: " + totalHoursWorked);
        System.out.println("Total days worked: " + totalDaysWorked);
    }
    }

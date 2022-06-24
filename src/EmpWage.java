public class EmpWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        // TODO Auto-generated method stub
        int employeePresent = 1;
        int employeePartTime = 2;
        int wagePerHour = 20;
        int numberOfHours = 8;
        int numberOfHoursForPartTime = 4;
        int isPresent = (int) Math.floor(Math.random() * 3);
        if (isPresent == employeePresent) {
            System.out.println("Employee is Present");
            System.out.println("Employee earn = " + numberOfHours * wagePerHour);
        } else if (isPresent == employeePartTime) {
            System.out.println("Employee is doing Part Time");
            System.out.println("Employee earn = " + numberOfHoursForPartTime * wagePerHour);
        }
        else {
            System.out.println("Employee is not Present");
            System.out.println("Employee earn = 0");
        }
    }
}
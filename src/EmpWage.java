public class EmpWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        // TODO Auto-generated method stub
        int employeePresent = 1;
        int employeePartTime = 2;
        int wagePerHour = 20;
        int numberOfHours = 8;
        int numberOfHoursForPartTime = 4;
        int workingDayInAMonth = 20;
        int isPresent = (int) Math.floor(Math.random() * 3);
        switch (isPresent) {
            case 0:
                System.out.println("Employee is Present");
                System.out.println("Employee earn = " + numberOfHours * wagePerHour);
                int totalHourPerMonth = 1;
                while (totalHourPerMonth <= 100) {
                    totalHourPerMonth++;
                }
                System.out.println("Employee earn in a month =" + totalHourPerMonth * wagePerHour);
                break;
            case 1:
                System.out.println("Employee is doing Part Time");
                System.out.println("Employee earn = " + numberOfHoursForPartTime * wagePerHour);
                System.out
                        .println("Employee earn per Month =" + numberOfHoursForPartTime * wagePerHour * workingDayInAMonth);

                break;
            case 2:
                System.out.println("Employee is not Present");
                System.out.println("Employee earn = 0");
                System.out.println("Employee earn = 0");
                break;
        }
    }
}
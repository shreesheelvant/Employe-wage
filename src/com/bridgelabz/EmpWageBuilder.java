package com.bridgelabz;



public class EmpWageBuilder {


    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private final String company;
    private final int empRatePerHour;
    private final int numofWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    


    //           public static final int EMP_RATE_PER_HOUR = 20;
//       public static final int NUM_OF_WORKING_DAYS = 20;
//        public static final int MAX_HRS_IN_MONTH = 10;
    public EmpWageBuilder(String company,  int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numofWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, numOfWorkingDays = 0 ;
            while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day# " + totalWorkingDays + " Emp Hr: " + empHrs);
            }
            totalEmpWage = totalEmpHrs * empRatePerHour;
        }
        public String toString() {
        return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
        }
        public static void main(String[] args) {
        EmpWageBuilder dMart = new EmpWageBuilder("Dmart", 20, 2, 10);
        EmpWageBuilder reliance = new EmpWageBuilder("Reliance", 10, 4, 20);
        boolean dmart;
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);

    }
}















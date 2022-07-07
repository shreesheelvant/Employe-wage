package com.bridgelabz;


    interface IEmployeeWage {
        public void addCompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth);
        public void computeEmpWage();
    }

    public class CompanyInfo {
        private String companyName;
        private int empRatePerHour;
        private int noOfWorkingDays;
        private int maxHoursPerMonth;
        private int totalEmpWage;


        public CompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth, int totalEmpWage) {
            this.companyName = companyName;
            this.empRatePerHour = empRatePerHour;
            this.noOfWorkingDays = noOfWorkingDays;
            this.maxHoursPerMonth = maxHoursPerMonth;
            this.totalEmpWage = totalEmpWage;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public int getEmpRatePerHour() {
            return empRatePerHour;
        }

        public void setEmpRatePerHour(int empRatePerHour) {
            this.empRatePerHour = empRatePerHour;
        }

        public int getNoOfWorkingDays() {
            return noOfWorkingDays;
        }

        public void setNoOfWorkingDays(int noOfWorkingDays) {
            this.noOfWorkingDays = noOfWorkingDays;
        }

        public int getMaxHoursPerMonth() {
            return maxHoursPerMonth;
        }

        public void setMaxHoursPerMonth(int maxHoursPerMonth) {
            this.maxHoursPerMonth = maxHoursPerMonth;
        }

        public int getTotalEmpWage() {
            return totalEmpWage;
        }

        public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }


        @Override
        public String toString() {
            return "CompanyInfo{" +
                    "companyName='" + companyName + '\'' +
                    ", empRatePerHour=" + empRatePerHour +
                    ", noOfWorkingDays=" + noOfWorkingDays +
                    ", maxHoursPerMonth=" + maxHoursPerMonth +
                    ", totalEmpWage=" + totalEmpWage +
                    '}';
        }
    }


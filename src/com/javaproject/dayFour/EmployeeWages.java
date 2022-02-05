package com.javaproject.dayFour;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println();

        EmployeeWages abc = new EmployeeWages();
        abc.employeeWageUC1();
        System.out.println("--------------------------------------------------");
        abc.employeeWageUC2();
        System.out.println("--------------------------------------------------");
        abc.employeeWageUC3();
        System.out.println("--------------------------------------------------");
        abc.employeeWageUC4();
        System.out.println("--------------------------------------------------");
        abc.employeeWageUC5();
        System.out.println("--------------------------------------------------");
        abc.employeeWageUC6();
        System.out.println("--------------------------------------------------");
    }
    public void employeeWageUC1() {
        int is_Present = 1;
        double emp_Check = Math.floor(Math.random() * 10) % 2;
        if (is_Present == emp_Check) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public void employeeWageUC2() {
        int is_Full_Time = 1;
        int emp_Hrs;
        int emp_Wage_Per_Hrs = 20;
        int emp_Wage;
        double emp_Check = Math.floor(Math.random() * 10) % 2;
        if (emp_Check == is_Full_Time) {
            System.out.println("Employee is an Full Time Employee");
            emp_Hrs = 8;
            emp_Wage = emp_Hrs * emp_Wage_Per_Hrs;
            System.out.println("Salary of an Employee who is an Full Time Employee : " + emp_Wage);
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public void employeeWageUC3() {
        int is_Full_Time = 1;
        int is_Part_Time = 0;
        int emp_Hrs;
        int emp_Wage_Per_Hrs = 20;
        int emp_Wage;
        double emp_Check = Math.floor(Math.random() * 10) % 2;
        if (emp_Check == is_Full_Time) {
            System.out.println("Employee is an Full Time Employee");
            emp_Hrs = 8;
            emp_Wage = emp_Hrs * emp_Wage_Per_Hrs;
            System.out.println("Salary of an Employee who is an Full Time Employee : " + emp_Wage);
        } else if (emp_Check == is_Part_Time) {
            System.out.println("Employee is an Part Time Employee");
            emp_Hrs = 4;
            emp_Wage = emp_Hrs * emp_Wage_Per_Hrs;
            System.out.println("Salary of an Employee who is an Part Time Employee : " + emp_Wage);
        } else {
            System.out.println("Employee is absent");
        }
    }

    public void employeeWageUC4() {
        int is_Full_Time = 1;
        int is_Part_Time = 2;
        int emp_Hrs;
        int emp_Wage_Per_Hrs = 20;
        int emp_Wage;
        double emp_Check = Math.floor(Math.random() * 10) % 2;
        switch ((int) emp_Check) {
            case 1:
                System.out.println("Employee is an Full Time Employee");
                emp_Hrs = 8;
                emp_Wage = emp_Hrs * emp_Wage_Per_Hrs;
                System.out.println("Salary of an Employee who is an Full Time Employee : " + emp_Wage);
                break;
            case 2:
                System.out.println("Employee is an Part Time Employee");
                emp_Hrs = 4;
                emp_Wage = emp_Hrs * emp_Wage_Per_Hrs;
                System.out.println("Salary of an Employee who is an Part Time Employee : " + emp_Wage);
                break;
            default:
                emp_Wage = 0;
                System.out.println("Employee is Absent" + emp_Wage);
                break;
        }
    }

    public void employeeWageUC5() {
        int is_Full_Time = 1;
        int is_Part_Time = 2;
        int emp_Hrs;
        int emp_Wage_Per_Hrs = 20;
        int emp_Wage;
        int num_of_Working_Days = 20;
        int total_Employee_Wage = 0;
        for (int day = 1 ; day < num_of_Working_Days ; day++) {
            double emp_Check = Math.floor(Math.random() * 10) % 3;
            switch ((int)emp_Check) {
                case 1:
                    System.out.println("Employee is an Full Time Employee");
                    emp_Hrs = 8;
                    emp_Wage = emp_Hrs * emp_Wage_Per_Hrs;
                    total_Employee_Wage = total_Employee_Wage + emp_Wage;
                    System.out.println("Salary of an Employee who is an Full Time Employee : " + total_Employee_Wage);
                    break;
                case 2 :
                    System.out.println("Employee is an Part Time Employee");
                    emp_Hrs = 4;
                    emp_Wage = emp_Hrs * emp_Wage_Per_Hrs;
                    total_Employee_Wage = total_Employee_Wage + emp_Wage;
                    System.out.println("Salary of an Employee who is an Part Time Employee : " + total_Employee_Wage);
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }
        }
        System.out.println("Salary of an Employee :" + total_Employee_Wage);
    }
    public void employeeWageUC6(){
        int is_Full_Time = 1;
        int is_Part_Time = 2;
        int emp_Rate_Per_Hr = 20;
        int num_Of_Working_Days = 20;
        int total_Working_Days = 0;
        int max_Working_Hrs = 100;
        int total_Employee_Wage=0;
        int total_Emp_Hrs = 0;
        int emp_Hrs = 0;

        while(total_Emp_Hrs < max_Working_Hrs && total_Working_Days < num_Of_Working_Days){
            total_Working_Days++;
            double emp_Check = Math.floor(Math.random() * 10) % 3;
            if(emp_Check == is_Full_Time){
                System.out.println("Employee is an Full Time Employee");
                emp_Hrs = 8;
            }
            else if(emp_Check == is_Part_Time){
                System.out.println("Employee is an Part Time Employee");
                emp_Hrs = 4;
            }
            else{
                System.out.println("Employee is Absent");
            }
            total_Emp_Hrs =total_Emp_Hrs + emp_Hrs;
            System.out.println("Total Employee Hours is " +total_Emp_Hrs);
        }
        total_Employee_Wage = total_Emp_Hrs * emp_Rate_Per_Hr;
        System.out.println("Total Salary of an Employee is " +total_Employee_Wage);
    }
}

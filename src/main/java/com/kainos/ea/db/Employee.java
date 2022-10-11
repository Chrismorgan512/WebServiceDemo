package com.kainos.ea.db;


public class Employee {

       private int EmployeeID;
       private String EmployeeName;
       private int Salary;

       private int BankNo;

       private String NIN;

       private String EmployeePhoneNo;

       private String EmployeeCountryCode;




    public Employee(short empnum, String name, int salary){
        setEmployeeID(empnum);
        setEmployeeName(name);
        setSalary(salary);

    }


    public int calcPay() {
        return getSalary() / 12;
    }



    public int getEmployeeID() {
        return EmployeeID;
    }

    public boolean setEmployeeID(short thisEmployeeID) {
        if(thisEmployeeID > 0) {
            EmployeeID = thisEmployeeID;
            return true;
        }  else {
            return false;
        }
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;

    }



    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.EmployeeName = employeeName;
    }

    public int getBankNo() {
        return BankNo;
    }

    public void setBankNo(int bankNo) {
        BankNo = bankNo;
    }

    public String getNIN() {
        return NIN;
    }

    public void setNIN(String NIN) {
        this.NIN = NIN;
    }

    public String getEmployeePhoneNo() {
        return EmployeePhoneNo;
    }

    public void setEmployeePhoneNo(String employeePhoneNo) {
        EmployeePhoneNo = employeePhoneNo;
    }

    public String getEmployeeCountryCode() {
        return EmployeeCountryCode;
    }

    public void setEmployeeCountryCode(String employeeCountryCode) {
        EmployeeCountryCode = employeeCountryCode;
    }

//Comparator<Employee> Salary = new Comparator<Employee>() {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        return 0;
//    };





}







//public class surnamecomparator implements comparator <Employee>
//public int compare(Employee e1, Employee e2){
//return CharSequence.compare(
//e1.getEmployeeName().split(regex: " ") [1], e2.getEmployeeName.split(regex: " ")[1]


package com.practice2.restemployee.model;

public class EmployeeDetail
{
    private String EmployeeName;
    private String EmmployeeRoll;
    private String EmployeeId;
    private String EmployeeSalary;

    public EmployeeDetail() {

    }

    public EmployeeDetail(String employeeName, String emmployeeRoll, String employeeId, String employeeSalary)
    {
        EmployeeName = employeeName;
        EmmployeeRoll = emmployeeRoll;
        EmployeeId = employeeId;
        EmployeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmmployeeRoll() {
        return EmmployeeRoll;
    }

    public void setEmmployeeRoll(String emmployeeRoll) {
        EmmployeeRoll = emmployeeRoll;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        EmployeeSalary = employeeSalary;
    }
}

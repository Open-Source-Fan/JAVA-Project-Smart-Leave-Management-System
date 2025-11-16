package com.hr.users;

import com.hr.main.SmartLeaveSystem;

public class Employee extends User {
    public Employee(int empId, String name, String email, String password, int leaveBalance, int totalLeavesAllowed) {
        super(empId, name, email, password, leaveBalance, totalLeavesAllowed);
    }

    @Override
    public void viewDashboard(SmartLeaveSystem sys) {
        sys.employeeMenu(this);
    }
}

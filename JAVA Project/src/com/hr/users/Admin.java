package com.hr.users;

import com.hr.main.SmartLeaveSystem;

public class Admin extends User {
    public Admin(int empId, String name, String email, String password, int leaveBalance, int totalLeavesAllowed) {
        super(empId, name, email, password, leaveBalance, totalLeavesAllowed);
    }

    @Override
    public void viewDashboard(SmartLeaveSystem sys) {
        sys.adminMenu(this);
    }
}
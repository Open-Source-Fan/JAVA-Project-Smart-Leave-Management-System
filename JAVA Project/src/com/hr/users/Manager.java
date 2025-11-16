package com.hr.users;

import com.hr.main.SmartLeaveSystem;

public class Manager extends User {
    public Manager(int empId, String name, String email, String password, int leaveBalance, int totalLeavesAllowed) {
        super(empId, name, email, password, leaveBalance, totalLeavesAllowed);
    }

    @Override
    public void viewDashboard(SmartLeaveSystem sys) {
        sys.managerMenu(this);
    }
}

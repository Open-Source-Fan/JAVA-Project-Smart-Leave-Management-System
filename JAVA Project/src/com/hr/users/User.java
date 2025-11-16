package com.hr.users;

public abstract class User {
    private int empId, leaveBalance, badges;
    private final int totalLeavesAllowed;
    private String name, email, password, lastLogin;

    public User(int empId, String name, String email, String password, int leaveBalance, int totalLeavesAllowed) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.leaveBalance = leaveBalance;
        this.badges = 0;
        this.lastLogin = "Never";
        this.totalLeavesAllowed = totalLeavesAllowed;
    }

    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public int getLeaveBalance() { return leaveBalance; }
    public void setLeaveBalance(int lb) { this.leaveBalance = lb; }
    public int getBadges() { return badges; }
    public void setBadges(int b) { this.badges = b; }
    public int getTotalLeavesAllowed() { return totalLeavesAllowed; }
    public String getLastLogin() { return lastLogin; }
    public void setLastLogin(String ll) { this.lastLogin = ll; }

    public abstract void viewDashboard(com.hr.main.SmartLeaveSystem sys);
}

package com.hr.requests;

public class LeaveRequest {
    private static int counter = 1000;
    private int reqId, empId, requestedDays;
    private String start, end, type, status, comments;

    public LeaveRequest(int eid, String start, String end, String type, String comm, int days) {
        this.reqId = counter++;
        this.empId = eid;
        this.start = start;
        this.end = end;
        this.type = type;
        this.status = "PENDING";
        this.comments = comm;
        this.requestedDays = days;
    }

    public int getReqId() { return reqId; }
    public int getEmpId() { return empId; }
    public String getStart() { return start; }
    public String getEnd() { return end; }
    public String getType() { return type; }
    public String getStatus() { return status; }
    public void setStatus(String s) { this.status = s; }
    public String getComments() { return comments; }
    public int getRequestedDays() { return requestedDays; }
}

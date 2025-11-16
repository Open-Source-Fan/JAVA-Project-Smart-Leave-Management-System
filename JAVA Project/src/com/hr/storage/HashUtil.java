package com.hr.storage;

import com.hr.requests.LeaveRequest;

public class HashUtil {
    public static String hashLeave(LeaveRequest req) {
        String content = req.getReqId() + ":" + req.getEmpId() + ":" + req.getStart() + ":"
                       + req.getEnd() + ":" + req.getType() + ":" + req.getStatus();
        return Integer.toHexString(content.hashCode());
    }
}
package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService {

    @Autowired
    private LeaveRepo leaveRepository;

    public List<Leave> getAllLeaves() {
        return leaveRepository.findAll();
    }

    public Leave getLeaveById(Long leaveId) {
        return leaveRepository.findById(leaveId).orElse(null);
    }

    public Leave createLeave(Leave leave) {
        return leaveRepository.save(leave);
    }

    public Leave updateLeave(Long leaveId, Leave leave) {
        leave.setLeaveId(leaveId);
        return leaveRepository.save(leave);
    }

    public void deleteLeave(Long leaveId) {
        leaveRepository.deleteById(leaveId);
    }
}

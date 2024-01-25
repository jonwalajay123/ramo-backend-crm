package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @GetMapping
    public List<Leave> getAllLeaves() {
        return leaveService.getAllLeaves();
    }

    @GetMapping("/{leaveId}")
    public Leave getLeaveById(@PathVariable Long leaveId) {
        return leaveService.getLeaveById(leaveId);
    }

    @PostMapping
    public Leave createLeave(@RequestBody Leave leave) {
        return leaveService.createLeave(leave);
    }

    @PutMapping("/{leaveId}")
    public Leave updateLeave(@PathVariable Long leaveId, @RequestBody Leave leave) {
        return leaveService.updateLeave(leaveId, leave);
    }

    @DeleteMapping("/{leaveId}")
    public ResponseEntity<Void> deleteLeave(@PathVariable Long leaveId) {
        leaveService.deleteLeave(leaveId);
        return ResponseEntity.noContent().build();
    }
}
   

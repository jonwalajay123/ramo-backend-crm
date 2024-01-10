package com.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leads")
@CrossOrigin(origins = "http://localhost:3000")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @GetMapping
    public List<Lead> getAllLeads() {
        return leadService.getAllLeads();
    }

    @GetMapping("/{leadId}")
    public Lead getLeadById(@PathVariable Long leadId) {
        return leadService.getLeadById(leadId);
    }

    @PostMapping
    public Lead createLead(@RequestBody Lead lead) {
        return leadService.createLead(lead);
    }

    @PutMapping("/{leadId}")
    public Lead updateLead(@PathVariable Long leadId, @RequestBody Lead updatedLead) {
        return leadService.updateLead(leadId, updatedLead);
    }

    @DeleteMapping("/{leadId}")
    public void deleteLead(@PathVariable Long leadId) {
        leadService.deleteLead(leadId);
    }
}

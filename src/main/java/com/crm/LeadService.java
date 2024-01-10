package com.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadService {

    @Autowired
    private LeadRepository leadRepository;

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    public Lead getLeadById(Long leadId) {
        return leadRepository.findById(leadId).orElse(null);
    }

    public Lead createLead(Lead lead) {
        return leadRepository.save(lead);
    }

    public Lead updateLead(Long leadId, Lead updatedLead) {
        if (leadRepository.existsById(leadId)) {
            updatedLead.setLeadId(leadId);
            return leadRepository.save(updatedLead);
        }
        return null;
    }

    public void deleteLead(Long leadId) {
        leadRepository.deleteById(leadId);
    }
}



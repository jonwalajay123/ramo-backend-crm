package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceItemService {

    @Autowired
    private InvoiceItemRepo invoiceItemRepository;

    public List<InvoiceItem> getAllInvoiceItems() {
        return invoiceItemRepository.findAll();
    }

    public InvoiceItem getInvoiceItemById(Long serviceId) {
        return invoiceItemRepository.findById(serviceId).orElse(null);
    }

    public InvoiceItem createInvoiceItem(InvoiceItem invoiceItem) {
        return invoiceItemRepository.save(invoiceItem);
    }

    public InvoiceItem updateInvoiceItem(Long serviceId, InvoiceItem updatedInvoiceItem) {
        if (invoiceItemRepository.existsById(serviceId)) {
            updatedInvoiceItem.setServiceId(serviceId);
            return invoiceItemRepository.save(updatedInvoiceItem);
        }
        return null;
    }

    public void deleteInvoiceItem(Long serviceId) {
        invoiceItemRepository.deleteById(serviceId);
    }
}

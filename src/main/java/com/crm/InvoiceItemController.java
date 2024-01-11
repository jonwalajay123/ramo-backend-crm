package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoice-items")
@CrossOrigin(origins = "http://localhost:3000")
public class InvoiceItemController {

    @Autowired
    private InvoiceItemService invoiceItemService;

    @GetMapping
    public List<InvoiceItem> getAllInvoiceItems() {
        return invoiceItemService.getAllInvoiceItems();
    }

    @GetMapping("/{serviceId}")
    public InvoiceItem getInvoiceItemById(@PathVariable Long serviceId) {
        return invoiceItemService.getInvoiceItemById(serviceId);
    }

    @PostMapping
    public InvoiceItem createInvoiceItem(@RequestBody InvoiceItem invoiceItem) {
        return invoiceItemService.createInvoiceItem(invoiceItem);
    }

    @PutMapping("/{serviceId}")
    public InvoiceItem updateInvoiceItem(@PathVariable Long serviceId, @RequestBody InvoiceItem updatedInvoiceItem) {
        return invoiceItemService.updateInvoiceItem(serviceId, updatedInvoiceItem);
    }

    @DeleteMapping("/{serviceId}")
    public void deleteInvoiceItem(@PathVariable Long serviceId) {
        invoiceItemService.deleteInvoiceItem(serviceId);
    }
}

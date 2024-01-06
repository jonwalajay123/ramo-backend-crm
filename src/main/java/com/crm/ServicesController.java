package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "http://localhost:3000")
public class ServicesController {

    @Autowired
    private ServicesService servicesService;

    @GetMapping
    public List<Services> getAllServices() {
        return servicesService.getAllServices();
    }

    @GetMapping("/{serviceId}")
    public ResponseEntity<Services> getServiceById(@PathVariable long serviceId) {
        Optional<Services> service = servicesService.getServiceById(serviceId);
        return service.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Services> createService(@RequestBody Services service) {
        Services createdService = servicesService.createService(service);
        return new ResponseEntity<>(createdService, HttpStatus.CREATED);
    }

    @PutMapping("/{serviceId}")
    public ResponseEntity<Services> updateService(@PathVariable long serviceId, @RequestBody Services service) {
        Services updatedService = servicesService.updateService(serviceId, service);
        return updatedService != null ?
                new ResponseEntity<>(updatedService, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{serviceId}")
    public ResponseEntity<Void> deleteService(@PathVariable long serviceId) {
        servicesService.deleteService(serviceId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


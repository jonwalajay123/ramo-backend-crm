package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    private ServicesRepository servicesRepository;

    @Override
    public List<Services> getAllServices() {
        return servicesRepository.findAll();
    }

    @Override
    public Optional<Services> getServiceById(long serviceId) {
        return servicesRepository.findById(serviceId);
    }

    @Override
    public Services createService(Services service) {
        return servicesRepository.save(service);
    }

    @Override
    public Services updateService(long serviceId, Services service) {
        if (servicesRepository.existsById(serviceId)) {
            service.setServiceId(serviceId);
            return servicesRepository.save(service);
        } else {
            // Handle not found scenario
            return null;
        }
    }

    @Override
    public void deleteService(long serviceId) {
        servicesRepository.deleteById(serviceId);
    }
}


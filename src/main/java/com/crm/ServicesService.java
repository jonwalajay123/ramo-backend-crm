package com.crm;

import java.util.List;
import java.util.Optional;

public interface ServicesService {
    List<Services> getAllServices();

    Optional<Services> getServiceById(long serviceId);

    Services createService(Services service);

    Services updateService(long serviceId, Services service);

    void deleteService(long serviceId);
}


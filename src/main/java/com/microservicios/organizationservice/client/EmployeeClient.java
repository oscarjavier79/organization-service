package com.microservicios.organizationservice.client;

import com.microservicios.organizationservice.client.Response.Organization;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="employee-service")
public interface EmployeeClient {

    @GetMapping("/get")
    Organization findByIdOrganization(@RequestParam("idOrganization") Long idOrganization);
}

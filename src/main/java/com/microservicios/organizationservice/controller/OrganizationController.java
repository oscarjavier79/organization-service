package com.microservicios.organizationservice.controller;

import com.microservicios.organizationservice.client.EmployeeClient;
import com.microservicios.organizationservice.client.Response.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {

    @Autowired
    EmployeeClient employeeClient;

    @GetMapping("/getEmployee/{id}")
    public Organization findByIdWithDepartments(@PathVariable("id") Long id) {
        Organization organization = employeeClient.findByIdOrganization(id);
        return organization;
    }
}

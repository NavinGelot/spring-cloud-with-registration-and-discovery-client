package com.client.serviceregistrationanddiscoveryclient.rest;

import com.client.core.dto.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInstanceRestController {

    @RequestMapping("/employee")
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Navin Gelot");
        employee.setSalary(5000.0);
        return employee;
    }

    @RequestMapping("/greeting")
    public String groot() {
        return "Im Groot";
    }

}

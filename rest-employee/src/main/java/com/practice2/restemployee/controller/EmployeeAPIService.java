package com.practice2.restemployee.controller;

import com.practice2.restemployee.model.EmployeeDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeedetail")

public class EmployeeAPIService
{
    @GetMapping("{employeeId}")
    public EmployeeDetail getEmployeeDetail(String employeeId)
    {
        return new EmployeeDetail("kalyani","Devloper","777","6LPA");
    }

}

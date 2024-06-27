package com.example.HR.controller;

import com.example.HR.model.Employee;
import com.example.HR.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Bu anatasyon, bu sınııfın bir control sınıfı/Restful web servisi olduğunu belirtir.
@RequestMapping("/api/employees") // Temel Urlsini belirtir

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/api/employess") //Bu anatasyon ile işaretlenen bu metot,bir çalışanı işe almak için
    public Employee hireEmployee(@RequestBody Employee employee) { //RequestParam(long employee)
        return employeeService.hireEmployee(employee);
    }


    @GetMapping
    // Çalışanları getirmek için servise sınıfımızdan oluşturduğumuz "getAllEmployees" metotu çağırarak döndürüyoruz
    public List<Employee>getAllEmployes(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/id")
    public Optional<Employee>getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

}

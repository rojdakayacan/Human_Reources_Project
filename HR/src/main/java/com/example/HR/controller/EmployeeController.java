package com.example.HR.controller;

import com.example.HR.model.Employee;
import com.example.HR.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Bu anatasyon, bu sınııfın bir control sınıfı/Restful web servisi olduğunu belirtir.
@RequestMapping("/api/employees") // Temel Urlsini belirtir

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/hire") //Bu anatasyon ile işaretlenen bu metot,bir çalışanı işe almak için
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Personel başarıyla kaydedildi"),
            @ApiResponse(responseCode = "400", description = "Hatalı istek")
    })

    @Operation(summary = "Yeni personel kaydı yapar")
    public Employee hireEmployee(@RequestBody Employee employee) { //RequestParam(long employee)
        return employeeService.hireEmployee(employee);
    }


    @GetMapping
    // Çalışanları getirmek için servise sınıfımızdan oluşturduğumuz "getAllEmployees" metotu çağırarak döndürüyoruz
    @Operation(summary ="Tüm personelleri getirip listeler")
    public List<Employee>getAllEmployes(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Belilrli bir personeli id numarasını getirip listeler")
    public Optional<Employee>getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}") // Belirtilen kimlikteki çalışan bilgilerini bu metot ile update/güncelliyoruz.
    @Operation(summary = "Bir personelin bilgilerini günceller.")
    public Employee upDateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
        return employeeService.updateEmployee(id,employeeDetails);
    }

    @DeleteMapping("/fire/{id}")
    @Operation(summary = "Bir personeli siler")
    public void fireEmployee(@PathVariable Long id){
        employeeService.fireEmployee(id);
    }


}
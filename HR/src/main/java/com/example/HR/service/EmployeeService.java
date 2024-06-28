package com.example.HR.service;

import com.example.HR.model.Employee;
import com.example.HR.repositary.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired // Spring bu alanı otomatik olrak inject/enjekte eder
    private EmployeeRepository employeeRepository;

    // CRUD'UN C harfi
    public Employee hireEmployee(Employee employee) {
        // yeni bir çalışanı veritabanına Jpa'dan gelen 'save' metodu ilekaydeder

        return employeeRepository.save(employee);
    }

    // CRUD'UN R HARFİ
    public List<Employee> getAllEmployee() {
        //Tüm çalışanları veritabanından "findAll" metodu ile getirir
        return employeeRepository.findAll();
    }


    public Optional<Employee> getEmployeeById(Long id) {
        // Belirtilen kimlikteki çalışanı veritabınından getirir.
        return employeeRepository.findById(id);
    }



    // CRUD' U harfi

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Çalışan bulunamadı"));
        //orElse yani if döngüsünün else ksımı gibi düşünebilirz .Aradığımız çalışan bulunmadığı durumlarda kullanıcıya böyle bir metin iletir

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setJobTitle(employeeDetails.getJobTitle());

        return employeeRepository.save(employee);


    }

    //CRUD'UN D HARFİ
    public void fireEmployee(Long id){ // Belirtilen kimlikteki çalışanı silen metot

        Employee employee =employeeRepository.findById(id).orElseThrow(()->new RuntimeException("ÇALIŞAN BULUNAMADI"));


        // silme işlemini yapan "delete" metotunu JPA repository içerisinden çağırarak kullandık.
        employeeRepository.delete(employee);

    }

}









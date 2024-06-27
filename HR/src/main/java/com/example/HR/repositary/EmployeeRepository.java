package com.example.HR.repositary;


import com.example.HR.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Bu anatasyon bu sınıfın bir Spring veritabanı depusu olduğunu gösterir

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}

//Jpa--> Crud (oluşturma , okuma , güncelleme ve silme) işlemleri için gerekli metotları sağlar
//CRUD--> Create,Read,Update,Delete
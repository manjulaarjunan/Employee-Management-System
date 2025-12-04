package com.example.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagementsystem.entity.employee;
@Repository
public interface employeerepository extends JpaRepository<employee,Long>{


}

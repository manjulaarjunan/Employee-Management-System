package com.example.employeemanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.entity.employee;
import com.example.employeemanagementsystem.repository.employeerepository;

@Service
public class employeeservice {
	private final employeerepository er;

	public employeeservice(employeerepository er) {
		this.er = er;
	}

	public employee addemployee(employee a) {
		return er.save(a);
	}

	public List<employee> getallemployee() {
		return er.findAll();
	}

	public employee getemployeeid(long id) {

		return er.findById(id).orElse(null);
	}

	public employee updateemployee(long id, employee a) {
		return er.findById(id).map(a1 -> {

			a1.setEmployeename(a.getEmployeename());
			a1.setEmail(a.getEmail());
			return er.save(a1);

		}).orElse(null);
	}

	public employee fullupdateemployee(long id, employee a) {
		return er.findById(id).map(a1 -> {
			a1.setEmployeeid(a.getEmployeeid());
			a1.setEmployeename(a.getEmployeename());
			a1.setDob(a.getDob());
			a1.setEmail(a.getEmail());
			a1.setMobilenumber(a.getMobilenumber());
			a1.setAddress(a.getAddress());
			a1.setDoj(a.getDoj());
			a1.setDesignation(a.getDesignation());
			a1.setExperience(a.getExperience());
			a1.setSkills(a.getSkills());

			return er.save(a1);

		}).orElse(null);
	}

	public String deleteall(long id) {
		er.deleteAll();
		return "delete all employee records";

	}

}

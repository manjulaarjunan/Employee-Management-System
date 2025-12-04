package com.example.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.entity.employee;
import com.example.employeemanagementsystem.service.employeeservice;

@RestController
@RequestMapping("/employee")
public class employeecontroller {
	private final employeeservice es;

	public employeecontroller(employeeservice es) {
		this.es = es;
	}
	@PostMapping("/add")
	public employee addemployee(@RequestBody employee a)
	{
		return es.addemployee(a);
	}
	@GetMapping("/getall")
	public List<employee> getallemployee()
	{
		return es.getallemployee();
	}
	@GetMapping("/getid/{id}")
	public employee getemployeeid(@PathVariable long id)
	{
		return es.getemployeeid(id);
	}
	
	@PatchMapping("/update/{id}")
	public employee updateemployee(@PathVariable long id,@RequestBody employee a)
	{
		return es.updateemployee(id, a);
	}
	@PutMapping("/fullupdate/{id}")
	public employee fullupdateemployee(@PathVariable long id, @RequestBody employee a)
	{
		return es.fullupdateemployee(id, a);
	}
	@DeleteMapping("/deleteall/{id}")
	public String deleteall(@PathVariable long id)
	{
		return es.deleteall(id);
	}
	
	}

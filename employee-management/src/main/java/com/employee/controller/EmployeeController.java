package com.employee.controller;



	import org.springframework.web.bind.annotation.*;
	import java.util.List;
	import com.employee.entity.Employee;
	import com.employee.service.EmployeeService;

	@RestController
	@RequestMapping("/api/employees")
	public class EmployeeController {

	    private final EmployeeService service;

	    public EmployeeController(EmployeeService service) {
	        this.service = service;
	    }

	    @GetMapping
	    public List<Employee> getAll() {
	        return service.getAllEmployees();
	    }

	    @GetMapping("/{id}")
	    public Employee getOne(@PathVariable Long id) {
	        return service.getEmployeeById(id);
	    }

	    @PostMapping
	    public Employee add(@RequestBody Employee emp) {
	        return service.saveEmployee(emp);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.deleteEmployee(id);
	    }
	}


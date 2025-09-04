package com.employee.service;



	import java.util.List;
	import org.springframework.stereotype.Service;
	import com.employee.entity.Employee;
	import com.employee.repository.EmployeeRepository;

	@Service
	public class EmployeeService {
	    private final EmployeeRepository repo;

	    public EmployeeService(EmployeeRepository repo) {
	        this.repo = repo;
	    }

	    public List<Employee> getAllEmployees() {
	        return repo.findAll();
	    }

	    public Employee getEmployeeById(Long id) {
	        return repo.findById(id).orElse(null);
	    }

	    public Employee saveEmployee(Employee emp) {
	        return repo.save(emp);
	    }

	    public void deleteEmployee(Long id) {
	        repo.deleteById(id);
	    }
	}


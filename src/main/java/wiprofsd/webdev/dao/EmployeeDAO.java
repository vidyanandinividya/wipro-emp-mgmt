package wiprofsd.webdev.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wiprofsd.webdev.entity.Employee;
import wiprofsd.webdev.repository.EmployeeRepository;

@Repository
public class EmployeeDAO {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> get()
	{
		return employeeRepository.findAll();
	}
	
	public Employee save(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	public void delete(int id)
	{
		employeeRepository.deleteById(id);
	}

}

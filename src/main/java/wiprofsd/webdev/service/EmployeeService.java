package wiprofsd.webdev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wiprofsd.webdev.dao.EmployeeDAO;
import wiprofsd.webdev.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	public List<Employee> get()
	{
		return employeeDAO.get();
	}
	public Employee save(Employee employee)
	{
		return employeeDAO.save(employee);
	}
	public void delete(int id)
	{
		employeeDAO.delete(id);
	}

}

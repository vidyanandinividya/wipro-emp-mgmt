package wiprofsd.webdev.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import wiprofsd.webdev.entity.Employee;
import wiprofsd.webdev.model.Response;
import wiprofsd.webdev.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping
	public ResponseEntity<Response> get()
	{
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(employeeService.get(),new Date()));
	}
	@CrossOrigin("http://localhost:4200")
	@PostMapping
	public ResponseEntity<Response> save(@RequestBody Employee employee)
	{
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(employeeService.save(employee),new Date()));
	}
	@CrossOrigin("http://localhost:4200")
	@PutMapping
	public ResponseEntity<Response> update(@RequestBody Employee employee)
	{
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(employeeService.save(employee),new Date()));
	}
	@CrossOrigin("http://localhost:4200")
	@DeleteMapping
	public ResponseEntity<Response> delete(@RequestParam("id") int id)
	{
		employeeService.delete(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(true,new Date()));
	}

}

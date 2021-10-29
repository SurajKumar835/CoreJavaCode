package suraj_pkg.myfinalproject.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import suraj_pkg.myfinalproject.entity.Employee;
import suraj_pkg.myfinalproject.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController1 {
		private EmployeeRepository employeeRepo;
		//constructor injection
		public EmployeeRestController1(EmployeeRepository employeeRepo) {
			this.employeeRepo = employeeRepo;
		}
		@RequestMapping(value="/lists",method = RequestMethod.GET)
		public List<Employee> findAll(){			
			return employeeRepo.findAll();			
		}
		
		@RequestMapping(value="/lists/{employeeId}",method=RequestMethod.GET)
		public Employee getEmployee(@PathVariable int employeeId)
		{
			Optional<Employee> result=employeeRepo.findById(employeeId);
			Employee e;
			if(result.isPresent())
			{
				e=result.get();
			}else
			{
				throw new RuntimeException ("Employee id not found");
			}
			return e;
		}
		
		@RequestMapping(value = "/lists",method = RequestMethod.POST)
		public Employee saveEmployee(@RequestBody Employee employee)
		{
			employee.setEmployeeId(0);//not an update method
			employeeRepo.save(employee);
			return employee;
		}
		
		@RequestMapping(value = "/lists/{employeeId}",method = RequestMethod.PUT)
		public Employee updateEmployee(@PathVariable int employeeId,@RequestBody Employee employee)
		{
			Optional<Employee> result=employeeRepo.findById(employeeId);
			employee.setEmployeeId(employeeId);
			if(result.isPresent())
			{
				employeeRepo.save(employee);
			}
			else {
				throw new RuntimeException("employeeid didnot exist in db");
			}
			return employee;
		}
		
		@RequestMapping(value="/lists/{employeeId}",method=RequestMethod.DELETE)
		public String deleteEmployee(@PathVariable int employeeId)
		{
			Optional<Employee> result=employeeRepo.findById(employeeId);
			if(result.isPresent())
			{
				employeeRepo.deleteById(result.get().getEmployeeId());
			}
			else {
				throw new RuntimeException("EmployeeId didnot exist");
			}
			return "Employee deleted at "+employeeId;
		}
		
}


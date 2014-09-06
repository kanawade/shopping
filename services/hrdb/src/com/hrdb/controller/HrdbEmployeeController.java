package com.hrdb.controller; 

// Generated 6 Sep, 2014 4:37:30 PM


import com.hrdb.service.EmployeeService;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrdb.*;
import org.springframework.web.bind.annotation.PathVariable;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

/**
 * Controller object for domain model class Employee.
 * @see com.hrdb.Employee
 */

@RestController
@RequestMapping("/hrdb/Employee")
public class HrdbEmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HrdbEmployeeController.class);

	@Autowired
	@Qualifier("hrdb.EmployeeService")
	private EmployeeService service;

	/**
	 * Processes requests to return lists all available Employees.
	 * 
	 * @param model
	 * @return The name of the  Employee list view.
	 */
	 
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public Page<Employee> findAll(
			@RequestBody QueryFilter[] queryFilters,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Rendering Employees list");
		Pageable pageable = new PageRequest(page - 1, size);
		return service.findAll(queryFilters, pageable);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Page<Employee> getEmployees(
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Rendering Employees list");
		Pageable pageable = new PageRequest(page - 1, size);
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public Long countAll() {
		LOGGER.debug("counting Employees");
		Long count = service.countAll();
		return count;
	}


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    	public Employee getEmployee(@PathVariable("id") Integer id) throws EntityNotFoundException {
    		LOGGER.debug("Getting person with id: {}" , id);
    		Employee instance = service.findById(id);
    		LOGGER.debug("Employee details with id: {}" , instance);
    		return instance;
    	}

    	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    	public boolean delete(@PathVariable("id") Integer id) throws EntityNotFoundException {
    		LOGGER.debug("Deleting Employee with id: {}" , id);
    		Employee deleted = service.delete(id);
    		return deleted != null;
    	}

    	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    	public Employee editEmployee(@PathVariable("id") Integer id, @RequestBody Employee instance) throws EntityNotFoundException {
            LOGGER.debug("Editing Employee with id: {}" , instance.getEid());
            instance.setEid(id);
    		instance = service.update(instance);
    		LOGGER.debug("Employee details with id: {}" , instance);
    		return instance;
    	}



	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee instance) {
		LOGGER.debug("Create Employee with information: {}" , instance);
		instance = service.create(instance);
		LOGGER.debug("Created Employee with information: {}" , instance);
	    return instance;
	}
	
	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setEmployeeService(EmployeeService service) {
		this.service = service;
	}
}


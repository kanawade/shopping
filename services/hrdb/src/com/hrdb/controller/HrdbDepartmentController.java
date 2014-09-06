package com.hrdb.controller; 

// Generated 6 Sep, 2014 4:37:30 PM


import com.hrdb.service.DepartmentService;
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
 * Controller object for domain model class Department.
 * @see com.hrdb.Department
 */

@RestController
@RequestMapping("/hrdb/Department")
public class HrdbDepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HrdbDepartmentController.class);

	@Autowired
	@Qualifier("hrdb.DepartmentService")
	private DepartmentService service;

	/**
	 * Processes requests to return lists all available Departments.
	 * 
	 * @param model
	 * @return The name of the  Department list view.
	 */
	 
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public Page<Department> findAll(
			@RequestBody QueryFilter[] queryFilters,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Rendering Departments list");
		Pageable pageable = new PageRequest(page - 1, size);
		return service.findAll(queryFilters, pageable);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Page<Department> getDepartments(
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Rendering Departments list");
		Pageable pageable = new PageRequest(page - 1, size);
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public Long countAll() {
		LOGGER.debug("counting Departments");
		Long count = service.countAll();
		return count;
	}


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    	public Department getDepartment(@PathVariable("id") Integer id) throws EntityNotFoundException {
    		LOGGER.debug("Getting person with id: {}" , id);
    		Department instance = service.findById(id);
    		LOGGER.debug("Department details with id: {}" , instance);
    		return instance;
    	}

    	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    	public boolean delete(@PathVariable("id") Integer id) throws EntityNotFoundException {
    		LOGGER.debug("Deleting Department with id: {}" , id);
    		Department deleted = service.delete(id);
    		return deleted != null;
    	}

    	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    	public Department editDepartment(@PathVariable("id") Integer id, @RequestBody Department instance) throws EntityNotFoundException {
            LOGGER.debug("Editing Department with id: {}" , instance.getDeptid());
            instance.setDeptid(id);
    		instance = service.update(instance);
    		LOGGER.debug("Department details with id: {}" , instance);
    		return instance;
    	}



	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Department createDepartment(@RequestBody Department instance) {
		LOGGER.debug("Create Department with information: {}" , instance);
		instance = service.create(instance);
		LOGGER.debug("Created Department with information: {}" , instance);
	    return instance;
	}
	
	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setDepartmentService(DepartmentService service) {
		this.service = service;
	}
}


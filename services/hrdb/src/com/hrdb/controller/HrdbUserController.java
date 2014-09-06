package com.hrdb.controller; 

// Generated 6 Sep, 2014 4:37:30 PM


import com.hrdb.service.UserService;
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
 * Controller object for domain model class User.
 * @see com.hrdb.User
 */

@RestController
@RequestMapping("/hrdb/User")
public class HrdbUserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HrdbUserController.class);

	@Autowired
	@Qualifier("hrdb.UserService")
	private UserService service;

	/**
	 * Processes requests to return lists all available Users.
	 * 
	 * @param model
	 * @return The name of the  User list view.
	 */
	 
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public Page<User> findAll(
			@RequestBody QueryFilter[] queryFilters,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Rendering Users list");
		Pageable pageable = new PageRequest(page - 1, size);
		return service.findAll(queryFilters, pageable);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Page<User> getUsers(
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Rendering Users list");
		Pageable pageable = new PageRequest(page - 1, size);
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public Long countAll() {
		LOGGER.debug("counting Users");
		Long count = service.countAll();
		return count;
	}


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    	public User getUser(@PathVariable("id") Integer id) throws EntityNotFoundException {
    		LOGGER.debug("Getting person with id: {}" , id);
    		User instance = service.findById(id);
    		LOGGER.debug("User details with id: {}" , instance);
    		return instance;
    	}

    	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    	public boolean delete(@PathVariable("id") Integer id) throws EntityNotFoundException {
    		LOGGER.debug("Deleting User with id: {}" , id);
    		User deleted = service.delete(id);
    		return deleted != null;
    	}

    	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    	public User editUser(@PathVariable("id") Integer id, @RequestBody User instance) throws EntityNotFoundException {
            LOGGER.debug("Editing User with id: {}" , instance.getUserid());
            instance.setUserid(id);
    		instance = service.update(instance);
    		LOGGER.debug("User details with id: {}" , instance);
    		return instance;
    	}



	@RequestMapping(value = "/", method = RequestMethod.POST)
	public User createUser(@RequestBody User instance) {
		LOGGER.debug("Create User with information: {}" , instance);
		instance = service.create(instance);
		LOGGER.debug("Created User with information: {}" , instance);
	    return instance;
	}
	
	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setUserService(UserService service) {
		this.service = service;
	}
}


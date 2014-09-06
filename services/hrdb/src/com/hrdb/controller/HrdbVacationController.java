package com.hrdb.controller; 

// Generated 6 Sep, 2014 4:37:30 PM


import com.hrdb.service.VacationService;
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
 * Controller object for domain model class Vacation.
 * @see com.hrdb.Vacation
 */

@RestController
@RequestMapping("/hrdb/Vacation")
public class HrdbVacationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HrdbVacationController.class);

	@Autowired
	@Qualifier("hrdb.VacationService")
	private VacationService service;

	/**
	 * Processes requests to return lists all available Vacations.
	 * 
	 * @param model
	 * @return The name of the  Vacation list view.
	 */
	 
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public Page<Vacation> findAll(
			@RequestBody QueryFilter[] queryFilters,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Rendering Vacations list");
		Pageable pageable = new PageRequest(page - 1, size);
		return service.findAll(queryFilters, pageable);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Page<Vacation> getVacations(
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Rendering Vacations list");
		Pageable pageable = new PageRequest(page - 1, size);
		return service.findAll(pageable);
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public Long countAll() {
		LOGGER.debug("counting Vacations");
		Long count = service.countAll();
		return count;
	}


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    	public Vacation getVacation(@PathVariable("id") Integer id) throws EntityNotFoundException {
    		LOGGER.debug("Getting person with id: {}" , id);
    		Vacation instance = service.findById(id);
    		LOGGER.debug("Vacation details with id: {}" , instance);
    		return instance;
    	}

    	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    	public boolean delete(@PathVariable("id") Integer id) throws EntityNotFoundException {
    		LOGGER.debug("Deleting Vacation with id: {}" , id);
    		Vacation deleted = service.delete(id);
    		return deleted != null;
    	}

    	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    	public Vacation editVacation(@PathVariable("id") Integer id, @RequestBody Vacation instance) throws EntityNotFoundException {
            LOGGER.debug("Editing Vacation with id: {}" , instance.getId());
            instance.setId(id);
    		instance = service.update(instance);
    		LOGGER.debug("Vacation details with id: {}" , instance);
    		return instance;
    	}



	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Vacation createVacation(@RequestBody Vacation instance) {
		LOGGER.debug("Create Vacation with information: {}" , instance);
		instance = service.create(instance);
		LOGGER.debug("Created Vacation with information: {}" , instance);
	    return instance;
	}
	
	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setVacationService(VacationService service) {
		this.service = service;
	}
}


package com.hrdb.service;
// Generated 6 Sep, 2014 4:37:30 PM


import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hrdb.*;
/**
 * Service object for domain model class Vacation.
 * @see com.hrdb.Vacation
 */

public interface VacationService {

   /**
	 * Creates a new vacation.
	 * 
	 * @param created
	 *            The information of the created vacation.
	 * @return The created vacation.
	 */
	public Vacation create(Vacation created);

	/**
	 * Deletes a vacation.
	 * 
	 * @param vacationId
	 *            The id of the deleted vacation.
	 * @return The deleted vacation.
	 * @throws EntityNotFoundException
	 *             if no vacation is found with the given id.
	 */
	public Vacation delete(Integer vacationId) throws EntityNotFoundException;

	/**
	 * Finds all vacations.
	 * 
	 * @return A list of vacations.
	 */
	public Page<Vacation> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Vacation> findAll(Pageable pageable);
	
	/**
	 * Finds vacation by id.
	 * 
	 * @param id
	 *            The id of the wanted vacation.
	 * @return The found vacation. If no vacation is found, this method returns
	 *         null.
	 */
	public Vacation findById(Integer id) throws EntityNotFoundException;

	/**
	 * Updates the information of a vacation.
	 * 
	 * @param updated
	 *            The information of the updated vacation.
	 * @return The updated vacation.
	 * @throws EntityNotFoundException
	 *             if no vacation is found with given id.
	 */
	public Vacation update(Vacation updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the vacations in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the vacation.
	 */

	public long countAll();

}


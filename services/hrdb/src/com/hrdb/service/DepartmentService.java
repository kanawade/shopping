package com.hrdb.service;
// Generated 6 Sep, 2014 4:37:30 PM


import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hrdb.*;
/**
 * Service object for domain model class Department.
 * @see com.hrdb.Department
 */

public interface DepartmentService {

   /**
	 * Creates a new department.
	 * 
	 * @param created
	 *            The information of the created department.
	 * @return The created department.
	 */
	public Department create(Department created);

	/**
	 * Deletes a department.
	 * 
	 * @param departmentId
	 *            The id of the deleted department.
	 * @return The deleted department.
	 * @throws EntityNotFoundException
	 *             if no department is found with the given id.
	 */
	public Department delete(Integer departmentId) throws EntityNotFoundException;

	/**
	 * Finds all departments.
	 * 
	 * @return A list of departments.
	 */
	public Page<Department> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Department> findAll(Pageable pageable);
	
	/**
	 * Finds department by id.
	 * 
	 * @param id
	 *            The id of the wanted department.
	 * @return The found department. If no department is found, this method returns
	 *         null.
	 */
	public Department findById(Integer id) throws EntityNotFoundException;

	/**
	 * Updates the information of a department.
	 * 
	 * @param updated
	 *            The information of the updated department.
	 * @return The updated department.
	 * @throws EntityNotFoundException
	 *             if no department is found with given id.
	 */
	public Department update(Department updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the departments in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the department.
	 */

	public long countAll();

}


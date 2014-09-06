package com.hrdb.controller;
// Generated 6 Sep, 2014 4:37:31 PM 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;
import org.apache.commons.lang.exception.ExceptionUtils;

import com.hrdb.service.QueryExecutorService;
import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@RestController
@RequestMapping("/hrdb/queryExecutor")
public class HrdbQueryExecutionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HrdbQueryExecutionController.class);

	@Autowired
	@Qualifier("hrdb.queryExecutorService")
	private QueryExecutorService queryService;
	
	

	@RequestMapping(value = "/queries/wm_custom", method = RequestMethod.POST)
	public Page<Object> executeWMCustomQuery(@RequestBody CustomQuery query,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		Pageable pageable = new PageRequest(page - 1, size);
		Page<Object> result = queryService.executeWMCustomQuerySelect(query, pageable);
		LOGGER.debug("got the result {}" + result);
		return result;
	}

	@RequestMapping(value = "/queries/wm_custom_update", method = RequestMethod.POST)
    	public int executeWMCustomQuery(@RequestBody CustomQuery query) {
    		int result = queryService.executeWMCustomQueryUpdate(query);
    		LOGGER.debug("got the result {}" + result);
    		return result;
    	}

}


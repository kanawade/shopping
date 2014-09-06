package com.hrdb.service;
// Generated 6 Sep, 2014 4:37:31 PM 


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service("hrdb.queryExecutorService")
public class QueryExecutorServiceImpl implements QueryExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutorServiceImpl.class);

	@Autowired
	@Qualifier("hrdbWMQueryExecutor")
	private WMQueryExecutor queryExecutor;


	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) {
	    return queryExecutor.executeCustomQuery(query, pageable);
	}

	@Transactional(value = "hrdbTransactionManager")
    @Override
    public int executeWMCustomQueryUpdate(CustomQuery query) {
        return queryExecutor.executeCustomQueryForUpdate(query);
    }
}


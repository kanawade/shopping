package com.hrdb.repository; 
// Generated 6 Sep, 2014 4:37:30 PM 

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hrdb.*;
/**
 * Specifies methods used to obtain and modify Vacation related information
 * which is stored in the database.
 */
@Repository("hrdb.VacationDao")
public class VacationRepository extends WMGenericDaoImpl <Vacation, Integer> {

   @Autowired
   @Qualifier("hrdbTemplate")
   private HibernateTemplate template;

   public HibernateTemplate getTemplate() {
        return this.template;
   }
}


package org.test.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.spring.Model.Flight;

//perform all the crud operation
@Repository
public interface FlightDao extends CrudRepository<Flight, Long>{

}

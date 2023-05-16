package org.test.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.spring.Model.Booking;

@Repository
public interface BookingDao extends CrudRepository<Booking,Long> {

}

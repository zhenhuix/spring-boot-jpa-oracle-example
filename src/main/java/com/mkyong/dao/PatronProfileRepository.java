package com.mkyong.dao;


import com.mkyong.model.PatronProfile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public interface PatronProfileRepository extends CrudRepository<PatronProfile, Long> {

    List<PatronProfile> findByEmail(String email);

    //@Query("select c from PATRON_PROFILE c where c.emailaddress = :email")
   // Stream<PatronProfile> findByEmailReturnStream(@Param("email") String email);

   // List<PatronProfile> findByDate(Date date);

    //@Query("select c from Customer c")
    //Stream<Customer> findAllAndStream();

    //List<Customer> findByDateBetween(Date from, Date to);

}

package com.mkyong;


import com.mkyong.dao.PatronProfileRepository;
import com.mkyong.model.PatronProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.util.*;


@RestController
public class TestController {

    @Autowired
    DataSource dataSource;

    @Autowired
    PatronProfileRepository patronProfileRepository;

    @RequestMapping(path = "/test")
    public String hello(){
        return "Hello BE Team.";
    }

    @RequestMapping(path = "/test2")
    public String hello2(){

       // PatronProfile customer =null;
        System.out.println("DATASOURCE = " + dataSource.toString());
        String customer = "My email is: ";

        System.out.println("\n2.findByEmail(String email)...");
        for (PatronProfile customer2 : patronProfileRepository.findByEmail("zhenhuix@gmail.com")) {

            System.out.println(customer2);
            customer += customer2.toString() +"\n";
        }
      //  String customer = patronProfileRepository.findByEmail("zhenhuix@gmail.com");
        return customer;
    }


}

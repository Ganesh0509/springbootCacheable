package com.gani.demo.service;

import com.gani.demo.doa.CustomerDao;
import com.gani.demo.entity.Customer;
import com.gani.demo.entity.CustomerParams;
import com.gani.demo.entity.Offer;
import com.gani.demo.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CustomerService {
  @Autowired
  private CustomerDao customerDao;
//
////    Customer c1 = new Customer(new BigInteger("12345687"), new Offer("1000", "10", "20"));
////    Customer c2 = new Customer(new BigInteger("12345688"), new Offer("1000", "10", "20"));
////    private Map<BigInteger, Customer> repository = Arrays.asList(new Customer[]{c1,c2}).
////                      stream().
////                      collect(
////                               Collectors.toConcurrentMap(s -> s.getCustomer_id(),Function.identity())
////                              );
////
//
//    public CustomerParams read(Long id) {
//        CustomerParams cp =  customerDao.getEmployeeList(id);
//        if (cp == null) {
//            new CustomerNotFoundException(id);
//
//        }
//        else {
//            return cp;
//        }
//   }
}

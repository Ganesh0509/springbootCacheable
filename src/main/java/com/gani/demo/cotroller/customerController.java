package com.gani.demo.cotroller;

import com.gani.demo.doa.CustomerDao;
import com.gani.demo.entity.Customer;
import com.gani.demo.entity.CustomerParams;
import com.gani.demo.service.CustomerService;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import java.math.BigInteger;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheConfig;


@RestController
@RequestMapping("/students")
@CacheConfig(cacheNames = "customers")
public class customerController{
    @Autowired
    private CustomerService service;

    @Autowired
    private CustomerDao customerDao;

    @GetMapping("/hi")
    public String getCutomer() {
      return "test";
    }

    @GetMapping("/{id}")
    @Cacheable()
    public CustomerParams read(@PathVariable("id") long id) {
        return customerDao.getEmployeeList(id);
    }
}

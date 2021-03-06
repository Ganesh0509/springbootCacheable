package com.gani.demo.doa;

import com.gani.demo.entity.CustomerParams;
import com.gani.demo.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CustomerDao  {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public CustomerParams getEmployeeList(Long id) {
        CustomerParams cp = new CustomerParams();
        System.out.println("Am here");
        String message = "SELECT ObjectID ,Attr_name,Value FROM Cus_params where ObjectID = "+id +";";
        List<Map<String, Object>> employees = jdbcTemplate.queryForList(message);
        System.out.println(employees.isEmpty());
        if (!employees.isEmpty()) {
            employees.stream().forEach(e -> {
                System.out.println("am here");
                if (e.get("Attr_name").equals("SMSPLAN")) {
                    cp.setSms((String) e.get("Value"));
                } else if (e.get("Attr_name").equals("VOICEPLAN")) {
                    cp.setVoice((String) e.get("Value"));
                } else if (e.get("Attr_name").equals("DATAPLAN")) {
                    cp.setData((String) e.get("Value"));
                }
            });
            cp.setCustomer_id(id);
          return cp ;
        } else {
            throw  new CustomerNotFoundException(id);

        }
    }

}

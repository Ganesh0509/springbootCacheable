package com.gani.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(
		properties = "spring.datasource.type=com.zaxxer.hikari.HikariDataSource"
)


class DemoApplicationTests {

	@Test
	void contextLoads() {
	}


	@Autowired
	private DataSource dataSource;

	@Test
	public void hikariConnectionPoolIsConfigured() {
		assertEquals("com.zaxxer.hikari.HikariDataSource", dataSource.getClass().getName());
	}
}

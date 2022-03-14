package com.cg.jdbcAssignment;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="com.cg.jdbcAssignment")
@PropertySource("classpath:dbconfig.properties")
public class configuration {
	


}

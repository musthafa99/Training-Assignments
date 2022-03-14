package com.cg.jdbcAssigments;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="com.cg.jdbcAssigments")
@PropertySource("classpath:dbconfig.properties")
public class configuration {
	


}

package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Person;
import com.example.demo.model.Vehicle;

@Configuration
public class AppConfig {
@Bean
public Vehicle getVehicle()
{
	Vehicle v=new Vehicle();
	v.setName("Honda");
	return v;
}
@Bean
public Person getPerson()
{
	Person p=new Person();
	p.setName("Ravi");
	p.setVeh(getVehicle());
	return p;
}
}

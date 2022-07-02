package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.LaptopRepo;

@Service
public class LaptopService 
{
	
@Autowired
LaptopRepo lrepo;
	
	public Laptop addLaptop(Laptop l)
	{
		lrepo.save(l);
		return l;
		
	}
	

}

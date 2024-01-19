package com.infosys.mock.controller;



import java.text.ParseException;
import java.time.LocalDate;

import java.util.List;



import javax.xml.bind.JAXBException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;


import com.infosys.mock.dto.MockDTO;
import com.infosys.mock.entity.Mock;
import com.infosys.mock.exception.MockException;

import com.infosys.mock.service.MockServiceImpl;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/item")
public class MockController {

	@Autowired
	private MockServiceImpl mockService;
	@Autowired
	
	
	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(MockController.class);
	

@PostMapping("/readcsv")
public ResponseEntity<String>addCSV(){
	mockService.readCSV();
	return new ResponseEntity<String>("db created",HttpStatus.OK);
}

@GetMapping("/{date1}/{date2}/{Material}")
public ResponseEntity<Double>getCostCostDiffBetweenDates(@PathVariable("date1") String date1,@PathVariable("date2") String date2 ,@PathVariable("Material")String Material) 
{
	LocalDate firstDate=LocalDate.parse(date1);
	LocalDate secondDate=LocalDate.parse(date2);
	double  diff = mockService.getCostDiffBetweenDates(firstDate,secondDate,Material);
	return new ResponseEntity<Double >(diff, HttpStatus.OK);
}



	

}
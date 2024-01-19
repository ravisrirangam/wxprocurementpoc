package com.infosys.mock.service;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infosys.mock.entity.Mock;

import com.infosys.mock.dto.MockDTO;



@Transactional
@Service
public class MockServiceImpl {
	public static final String CSV_FILE_PATH ="C:\\Users\\amal.a03\\Downloads\\goods reciept data sample1.csv";
	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(MockServiceImpl.class);
	private final Map<Integer,Mock> database = new HashMap<>();
	int i=1;
	
	public void readCSV() {
		try(BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH)))
		{
		int i=0;
		String line;
		line = br.readLine();
		
		while((line = br.readLine()) != null) {
			logger.info(line);
			String[] data = line.split(",");
			Mock mock = new Mock();
			mock.setPlnt(data[0]);
			mock.setPurchDoc(data[1]);
			mock.setCreatedOn(data[2]);
			mock.setVendor(data[3]);
			mock.setpOrg(data[4]);
			mock.setMaterial(data[5]);
			mock.setCommodity(data[6]);
			mock.setOrderQuantity(Double.parseDouble(data[7]));
			mock.setGrQty(Double.parseDouble(data[8]));
			mock.setGrValue(Double.parseDouble(data[9]));
			mock.setNetPrice(Double.parseDouble(data[10]));
			mock.setCurrency(data[11]);
			mock.setPer(Double.parseDouble(data[12]));
			mock.setMatDoc(data[13]);
			mock.setPstgDate(data[14]);
			database.put(++i, mock);
		
		}}
		catch(IOException e){
			e.printStackTrace();	
		}
	}
	
	public double getCostDiffBetweenDates(LocalDate date1,LocalDate date2 ,String itemId)  {
		logger.info("hi");
		
		double cost1 = 0;
		double cost2 = 0;
		for(Mock item: database.values()) {
			LocalDate d = LocalDate.parse(item.getCreatedOn());
		    int month = d.getMonthValue();
		    int day = d.getDayOfMonth();
		    logger.info(String.valueOf(month));
		    logger.info(String.valueOf(d));
		   logger.info("hi");
		   logger.info(String.valueOf(date1));
		   logger.info(String.valueOf(date2));
		   logger.info(String.valueOf(cost1));
		   logger.info(String.valueOf(cost2));
		   
		    
		   
		    if(date1.isEqual(d)&&itemId.equals(item.getMaterial())) {
		    	cost1=item.getNetPrice();
		    	logger.info(String.valueOf(cost1));
		    	
		    	   	
		    	}
		    else if (date2.isEqual(d)&&itemId.equals(item.getMaterial())) {
		    		cost2=item.getNetPrice();
		    		logger.info(String.valueOf(cost2));

			    	
		    	}
		   
		    }
		 return cost2-cost1;
		    
		
		
		}
		
		
	}














	

	

	
	
	
	
	
	
	


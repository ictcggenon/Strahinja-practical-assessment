package com.ictcg.restdatetime.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ictcg.restdatetime.model.JsonDateAndTime;
import com.ictcg.restdatetime.model.RestDateAndTime;

@Service
public class RestDateTimeService implements IRestDateTime{
	
	public Logger logger = LoggerFactory.getLogger(this.getClass());

	// First try
	@Override
	public RestDateAndTime getRestUnformattedDateAndTime() {
		logger.debug("CALLED SERVICE in " + this.getClass().getName());
		RestDateAndTime rdt = new RestDateAndTime();
/*		rdt.setDate(LocalDate.now());
		rdt.setTime(LocalTime.now());
 		NOT CLEAN :
 		you can pass from day d at 23:59:59.9999... to day d+1 at 00:00:00.0000...
 		=> discrepancy between the day and the time
 		=> get the whole date and time as below 								*/
		LocalDateTime currentDateTime = LocalDateTime.now();
		logger.debug("ACQUIRED DATE = " + currentDateTime);
		rdt.setDate(currentDateTime.toLocalDate());
		rdt.setTime(currentDateTime.toLocalTime());
		logger.debug("RETURN VALUE = " + rdt.getDate() + " , " + rdt.getTime());		
		return rdt;
	}

	// Second try
	@Override
	public String getRestStringDateAndTime() {
		logger.debug("CALLED SERVICE in " + this.getClass().getName());
		LocalDateTime currentDateTime = LocalDateTime.now();
		String currentDate = currentDateTime.toLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String currentTime = currentDateTime.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm"));
		logger.debug("ACQUIRED DATE = " + currentDateTime);
		logger.debug("RETURN VALUE = " + currentDate + " , " + currentTime);		
		return "date: " + currentDate + "\ntime: " + currentTime ;
	}

	// Third try, and the good one
	@Override
	public JsonDateAndTime getRestJsonDateAndTime() {
		JsonDateAndTime jdt = new JsonDateAndTime();
		logger.debug("CALLED SERVICE in " + this.getClass().getName());
		LocalDateTime currentDateTime = LocalDateTime.now();
		logger.debug("ACQUIRED DATE = " + currentDateTime);
		jdt.setDate(currentDateTime.toLocalDate());
		jdt.setTime(currentDateTime.toLocalTime());
		logger.debug("RETURN VALUE = " + jdt.getDate() + " , " + jdt.getTime());		
		return jdt;
	}

}
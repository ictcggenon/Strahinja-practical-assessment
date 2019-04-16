package com.ictcg.restdatetime.service;

//import java.time.LocalDate;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ictcg.restdatetime.model.restDateAndTime;

@Service
public class RestDateTimeService implements IRestDateTime{
	
	public Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public restDateAndTime getRestDateAndTime() {
		restDateAndTime rdt = new restDateAndTime();
		logger.debug("CALLED SERVICE in " + this.getClass().getName());
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

}
package com.ictcg.restdatetime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ictcg.restdatetime.model.JsonDateAndTime;
import com.ictcg.restdatetime.model.RestDateAndTime;
import com.ictcg.restdatetime.service.IRestDateTime;


@RestController
@RequestMapping(value = "date")
public class RestDateTimeController {
	//TODO add isUS parameter if true send as am/pm format
	@Autowired
	private IRestDateTime restDateTimeService;

	@RequestMapping(value = "/getUnformattedDate", method = RequestMethod.GET)
	public RestDateAndTime getDateAndTime() {
		try { // ? TODO: set return status ?
			return restDateTimeService.getRestUnformattedDateAndTime();
		} catch (Exception e) {
			e.printStackTrace(); // ? TODO: set return status ?
			return null; 
		}
	}	
	
	@RequestMapping(value = "/getStringDate", method = RequestMethod.GET)
	public String getStringDateAndTime() {
		try { // ? TODO: set return status ?
			return restDateTimeService.getRestStringDateAndTime();
		} catch (Exception e) {
			e.printStackTrace(); // ? TODO: set return status ?
			return null; 
		}
	}	
	@RequestMapping(value = "/getDate", method = RequestMethod.GET)
	public JsonDateAndTime getJsonDateAndTime() {
		try { // ? TODO: set return status ?
			return restDateTimeService.getRestJsonDateAndTime();
		} catch (Exception e) {
			e.printStackTrace(); // ? TODO: set return status ?
			return null; 
		}
	}	
	
}
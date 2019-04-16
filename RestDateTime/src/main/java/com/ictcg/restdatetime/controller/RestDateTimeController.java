package com.ictcg.restdatetime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ictcg.restdatetime.model.restDateAndTime;
import com.ictcg.restdatetime.service.IRestDateTime;


@RestController
@RequestMapping(value = "date")
public class RestDateTimeController {
	
	@Autowired
	public IRestDateTime restDateTimeService;

	@RequestMapping(value = "/getDate", method = RequestMethod.GET)
	public restDateAndTime getDateAndTime() {
		try {
			return restDateTimeService.getRestDateAndTime();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}	
	
}

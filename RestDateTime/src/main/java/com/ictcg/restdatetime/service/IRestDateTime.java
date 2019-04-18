package com.ictcg.restdatetime.service;

import com.ictcg.restdatetime.model.JsonDateAndTime;
import com.ictcg.restdatetime.model.RestDateAndTime;

public interface IRestDateTime {
	
	public RestDateAndTime getRestUnformattedDateAndTime();
	public String getRestStringDateAndTime();
	
	public JsonDateAndTime getRestJsonDateAndTime();

}

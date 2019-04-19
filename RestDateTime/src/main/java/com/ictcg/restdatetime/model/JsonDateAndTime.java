package com.ictcg.restdatetime.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class JsonDateAndTime implements Serializable{
	//TODO read about project lombok and use it here for all fields, const, equals and hashCode, toString
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6022357107138773910L;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate date;
	@JsonFormat(pattern="HH:mm")
	private LocalTime time;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JsonDateAndTime other = (JsonDateAndTime) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JsonDateAndTime [date=");
		builder.append(date);
		builder.append(", time=");
		builder.append(time);
		builder.append("]");
		return builder.toString();
	}
	

	
}

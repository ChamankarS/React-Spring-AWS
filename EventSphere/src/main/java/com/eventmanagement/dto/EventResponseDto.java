package com.eventmanagement.dto;

import java.util.ArrayList;
import java.util.List;

import com.eventmanagement.entity.Event;

import lombok.Data;

@Data
public class EventResponseDto extends CommonApiResponse {

	private List<Event> events = new ArrayList();

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	

}

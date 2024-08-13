package com.eventmanagement.dto;

import java.util.ArrayList;
import java.util.List;

import com.eventmanagement.entity.Booking;

import lombok.Data;

@Data
public class BookingResponseDto extends CommonApiResponse {

	private List<Booking> bookings = new ArrayList();

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	
	

}

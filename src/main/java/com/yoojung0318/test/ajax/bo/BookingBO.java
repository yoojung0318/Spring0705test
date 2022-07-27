package com.yoojung0318.test.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.test.ajax.dao.BookingDAO;
import com.yoojung0318.test.ajax.model.Booking;

@Service
public class BookingBO {

	@Autowired
	private BookingDAO bookingDAO;
	// 예약 리스트 가져오기
	public List<Booking> getBookingList() {
		return bookingDAO.selectBookingList();	
	}
	
	public int addBooking(String name
			, String date
			, int day
			, int headcount
			, String phoneNumber
			, String state) {
			
		return bookingDAO.insertBookingList(name, date, day, headcount, phoneNumber, state);
	}
	
}

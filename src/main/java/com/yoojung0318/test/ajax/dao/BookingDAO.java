package com.yoojung0318.test.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yoojung0318.test.ajax.model.Booking;
import com.yoojung0318.test.jstl.model.Weather;

public interface BookingDAO {

	// 예약정보 모두 가져오기 
		public List<Booking> selectBookingList();
		
		public int insertBookingList(String name
				,@Param("date") String date
				,@Param("day") int day
				,@Param("headcount")int headcount
				,@Param("phoneNumber") String phoneNumber
				,@Param("state") String state);
}

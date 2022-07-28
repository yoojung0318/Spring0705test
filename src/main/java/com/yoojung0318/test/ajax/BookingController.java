package com.yoojung0318.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoojung0318.test.ajax.bo.BookingBO;
import com.yoojung0318.test.ajax.model.Booking;
import org.apache.ibatis.annotations.Param;

@Controller
@RequestMapping("/ajax/booking")
public class BookingController {

	
	@Autowired
	private BookingBO bookingBO;
	
	//리스트페이지
	@GetMapping("/list")
	public String bookingList(Model model) {
		
	List<Booking> booking = bookingBO.getBookingList();
	model.addAttribute("bookingList",booking);
	
	return "/ajax/bookingInfo";
	}
	
	//입력 페이지
	@GetMapping("/input")
	public String bookingInput() {
	
	return "/ajax/bookingInput";
	}
	
	//입력한 데이터 리스트 추가
	@GetMapping("/insert")
	@ResponseBody
	public String addBooking(
			@RequestParam("name") String name
			,@RequestParam("date") String date
			,@RequestParam("day") int day
			,@RequestParam("headcount")int headcount
			,@RequestParam("phoneNumber") String phoneNumber
			,@RequestParam("state") String state) {
		
		int count = bookingBO.addBooking(name, date, day, headcount, phoneNumber, state);
		
		return "삽입결과: " + count;
		//return "redirect:/ajax/bookingInfo";
	}
	
	
}
			
	


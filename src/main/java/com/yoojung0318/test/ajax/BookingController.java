package com.yoojung0318.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yoojung0318.test.ajax.bo.BookingBO;
import com.yoojung0318.test.ajax.model.Booking;

@Controller
@RequestMapping("/booking")
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
	
}

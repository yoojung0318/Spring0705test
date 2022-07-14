package com.yoojung0318.test.realtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yoojung0318.test.mybatis.bo.RealtorBO;
import com.yoojung0318.test.mybatis.model.Realtor;

@Controller
@RequestMapping("/jsp/realtor")
public class RealtorController {

	@Autowired
	private RealtorBO realtorBO;
	
	// /input페이지 jsp 연결
		@GetMapping("/input")
		public String realtorInput() {
			return "jsp/realtorInput";
		}
		
	//insertPage
	@GetMapping("/insert")
	public String addRealtor(
			//model - jsp와 java를 연결하기위해사용
			@ModelAttribute Realtor realtor, Model model) {
		
		int count = realtorBO.addRealtor(realtor);
		model.addAttribute("realtor",realtor);
		
		return "jsp/realtorInfo";
		
	}
	

}

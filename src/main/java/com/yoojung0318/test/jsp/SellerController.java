package com.yoojung0318.test.jsp;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoojung0318.test.jsp.bo.SellerBO;
import com.yoojung0318.test.jsp.model.Seller;

@Controller
@RequestMapping("/jsp/seller")
public class SellerController {

	@Autowired
	private SellerBO sellerBO;
	
	@PostMapping("/insert")
	@ResponseBody
	public String addSeller(
			@Param("nickname") String nickname
			, @Param("profileImage")String profileImage
			, @Param("temperature") double temperature) {
		
		int count = sellerBO.addSeller(nickname, profileImage, temperature);
		return "삽입결과:" + count;
		
	}
	
	//jsp 연결
		@GetMapping("/input") //get page
		public String sellerInput() {
			
			return"jsp/SellerInput"; //jsp폴더 / userInput 파일
			
		}
		//메소드 이름으로 연결 , 기본: getmapping
		@GetMapping("/info")
		//model: 알아서 생성되는 매개체, 여기에 만든 값 넣어서 사용
		public String sellerInfo(@RequestParam(value="id", required=false)Integer id, Model model) {
			// 값이 전달되면 그 값으로 셋팅
			// 값이 전달이 안되면 null
//			Seller seller = null;
//			if(id == null) {			
//				seller = sellerBO.getLastSeller();
//				
//			} else {
//				seller = sellerBO.getSeller(id);
//			}
			
			Seller seller = sellerBO.getSeller(id);
			model.addAttribute("result", seller);
			
			return "jsp/SellerInfo";
		}

}

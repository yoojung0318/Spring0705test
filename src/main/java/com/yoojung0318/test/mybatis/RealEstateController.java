package com.yoojung0318.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoojung0318.test.mybatis.bo.RealEstateBO;
import com.yoojung0318.test.mybatis.model.RealEstate;

@Controller
public class RealEstateController {

	@Autowired
	private RealEstateBO realEstateBO;
	
	// realEstate 정보 하나 json으로 response에 출력
	// id 가 5인 real_estate 행 json으로 response에 출력
	@RequestMapping("/mybatis/test01/01")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		RealEstate realEstate = realEstateBO.getRealEstate(id);
	
		return realEstate;
		
	}
	
	//rentPrice 정보 json으로 response에 출력
	// rentPrice 정보 담긴 real_estate 행 json으로 response에 출력
	@RequestMapping("/mybatis/test01/02")
	@ResponseBody
	public List<RealEstate> compareRentPrice (@RequestParam("rentPrice") int rentPrice) {
		 List<RealEstate> compareRentPrice = realEstateBO.getRentPrice(rentPrice);
	
		return compareRentPrice;
	}
	
	// area, price 모두 전달
	@ResponseBody
	@RequestMapping("/mybatis/test01/03")
	public List<RealEstate> realEstateByAreaPrice(
			@RequestParam("area") int area
			,@RequestParam("price") int price)
	{
		return realEstateBO.getRealEstateByAreaPrice(area, price);
	}
}
	

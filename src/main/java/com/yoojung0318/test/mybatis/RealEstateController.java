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
@RequestMapping("/mybatis/")
public class RealEstateController {

	@Autowired
	private RealEstateBO realEstateBO;
	
	// realEstate 정보 하나 json으로 response에 출력
	// id 가 5인 real_estate 행 json으로 response에 출력
	@RequestMapping("/test01/01")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		RealEstate realEstate = realEstateBO.getRealEstate(id);
	
		return realEstate;
		
	}
	
	//rentPrice 정보 json으로 response에 출력
	// rentPrice 정보 담긴 real_estate 행 json으로 response에 출력
	@RequestMapping("/test01/02")
	@ResponseBody
	public List<RealEstate> compareRentPrice (@RequestParam("rentPrice") int rentPrice) {
		 List<RealEstate> compareRentPrice = realEstateBO.getRentPrice(rentPrice);
	
		return compareRentPrice;
	}
	
	// area, price 모두 전달
	@ResponseBody
	@RequestMapping("/test01/03")
	public List<RealEstate> realEstateByAreaPrice(
			@RequestParam("area") int area
			,@RequestParam("price") int price)
	{
		return realEstateBO.getRealEstateByAreaPrice(area, price);
	}
	
	/*insert다루기 1.객체로 insert 하기*/
	//realtorId : 3, address : 푸르지용 리버 303동 1104호, area : 89, type : 매매,price : 100000
	// 입력 성공한 행의 수를 출력
	
	@ResponseBody
	@RequestMapping("/test02/01")
	public String addRealEstateByObject() {
		RealEstate realestate = new RealEstate();
		realestate.setRealtorId(3);
		realestate.setAddress("푸르지용 리버 303동 1104호");
		realestate.setArea(89);
		realestate.setType("매매");
		realestate.setPrice(100000);
		
		int count = realEstateBO.addRealEstateByObject(realestate);
		return "삽입결과 : " + count;
	}
	/*insert 다루기 2.field로 insert 하기*/
	//address : 썅떼빌리버 오피스텔 814호, area : 45, type : 월세, price : 100000, rentPrice : 120
	// 입력 성공한 행의 수를 출력
	@ResponseBody
	@RequestMapping("/test02/02")
	public String addRealEstate() {
		
		int count = realEstateBO.addRealEstate("썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		return "삽입결과" + count;
	}
}
	

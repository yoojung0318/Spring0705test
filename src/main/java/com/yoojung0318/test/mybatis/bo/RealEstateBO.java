package com.yoojung0318.test.mybatis.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.test.mybatis.dao.RealEstateDAO;
import com.yoojung0318.test.mybatis.model.RealEstate;

//id가 5인 real estate 정보 전달

	@Service
	public class RealEstateBO {
		
		@Autowired
		private RealEstateDAO realEstateDAO;
		
		// id 정보를 real estate로 정보 전달
		public RealEstate getRealEstate(int id) {
			 RealEstate realEstate = realEstateDAO.selectRealEstate(id);
			 
			 return realEstate;
		}
		
		//rentprice 정보를 real estate로 정보 전달
		public  List<RealEstate> getRentPrice(int rentPrice) {
			 List<RealEstate> compareRentPrice = realEstateDAO.selectRentPrice(rentPrice);
			
				return compareRentPrice ;
		}
		public List<RealEstate> getRealEstateByAreaPrice(int area, int price){
			 return realEstateDAO.selectRealEstateByAreaPrice(area,price);
			
		}
		
	}
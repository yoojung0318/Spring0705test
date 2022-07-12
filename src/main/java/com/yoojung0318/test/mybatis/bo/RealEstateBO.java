package com.yoojung0318.test.mybatis.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.test.mybatis.dao.RealEstateDAO;
import com.yoojung0318.test.mybatis.model.RealEstate;

// bo역할 주문 -> 메뉴 레시피 제공
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
		
		
	/* insert 다루기 1. 객체로 insert 하기*/

		
			public int addRealEstateByObject(RealEstate realestate) {
				
				return realEstateDAO.insertRealEstateByObject(realestate);
				
			}
		
	/*insert 다루기 2.field로 insert 하기*/		
			public int addRealEstate(int realtorId, String address, int area, String type, int price, int rentPrice) {
				
				return realEstateDAO.insertRealEstate(realtorId, address, area, type, price, rentPrice);
			}
	/*update 다루기*/
			public int updateRealEstate(int id, String type, int price) {
				return realEstateDAO.updateRealEstate(id, type, price);
				
			}
			
	/*delete 다루기*/	
			public int deleteRealEstate(int id) {
				return realEstateDAO.deleteRealEstate(id);
			}
	}
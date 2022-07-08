package com.yoojung0318.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yoojung0318.test.mybatis.model.RealEstate;

@Repository
public interface RealEstateDAO {

	//id가 5인 RealEstate 정보 전달
	// 한 행 정보씩 관리하기 위해, model 사용(model: 재료를 저장 , mapper.xml:재료)
	// xml 변수를 java에서 쓰기위해, @Param 사용
	// 변수하나당 @Param("")이 세트
	
	public RealEstate selectRealEstate(@Param("id") int id);
	public List<RealEstate> selectRentPrice(@Param("rentPrice") int rentPrice);
	public List<RealEstate> selectRealEstateByAreaPrice(
			@Param("area") int area
			,@Param("price") int price);
	
}

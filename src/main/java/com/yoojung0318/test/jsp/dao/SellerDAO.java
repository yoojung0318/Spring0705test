package com.yoojung0318.test.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yoojung0318.test.jsp.model.Seller;

@Repository
public interface SellerDAO {
	
	public int insertUser(
			@Param("nickname")String nickname			
			,@Param("profileImage") String profileImage
			,@Param("temperature") double temperature);

	public Seller selectLastSeller();
		
		public Seller selectSeller(@Param("id") int id);
}

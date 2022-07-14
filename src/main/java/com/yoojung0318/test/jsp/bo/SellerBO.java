package com.yoojung0318.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.test.jsp.dao.SellerDAO;
import com.yoojung0318.test.jsp.model.Seller;

@Service
public class SellerBO {
	@Autowired //spring에서 알아서 객체 생성 즉, 생성된 객체를 활용하기만 하면 됨 , private사용
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickname, String profileImage, double temperature) {
		
		return sellerDAO.insertUser(nickname, profileImage, temperature);
	}
	public Seller getLastSeller() {
	 	return sellerDAO.selectLastSeller();
	}
public Seller getSeller(Integer id) {
		
		if(id == null) {
			return sellerDAO.selectLastSeller();
		} else {
			return sellerDAO.selectSeller(id);
		}
	}
}

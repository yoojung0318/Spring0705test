package com.yoojung0318.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.test.database.dao.StoreDAO;
import com.yoojung0318.test.database.model.Store;

//주문 -> 제조 , data 조작 
// 제조를 위한 재료준비가 필요한데, 이 재료준비를 storedao가 진행함
@Service
public class StoreBO {

	@Autowired // spring이 객체를(객체생성) 알아서 관리 StoreDAO : 클래스 이름(사용하고자 하는(storedao)) 
	private StoreDAO storeDAO;
	
	//Store 데이터 모두 가져오는 메소드
	public List<Store> getStoreList(){
		List<Store> list = storeDAO.selectStoreList();
		
		return list;
		
	}
}

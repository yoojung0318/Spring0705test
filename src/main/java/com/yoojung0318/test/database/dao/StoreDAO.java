package com.yoojung0318.test.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yoojung0318.test.database.model.Store;

//데이터 조작, interface로 구현, 1.메소드 호출, 4.list에 저장,  
// 제조 -> 재료 준비 ( 재료 : mapping.xml)
@Repository
public interface StoreDAO {
		//Store 에서 모든 데이터 조회
		public List<Store> selectStoreList();
}

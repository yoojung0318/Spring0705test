package com.yoojung0318.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoojung0318.test.database.bo.StoreBO;
import com.yoojung0318.test.database.model.Store;

@Controller
public class StoreController {

	@Autowired// 객체 알아서 관리
	// storebo에서 제조한 음료 손님에게 전달
	private StoreBO storeBO;
	
	// store 안에 있는 내용을 json으로 전달
	@RequestMapping("/database/test01/01")
	@ResponseBody
	public List<Store>/*반환하고자 하는 값의 타입*/ ex01(){
		
		List<Store> list = storeBO.getStoreList();
		
		return list;
	}
	
}

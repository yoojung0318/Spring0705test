package com.yoojung0318.test.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.test.mybatis.dao.RealtorDAO;
import com.yoojung0318.test.mybatis.model.Realtor;

@Service
public class RealtorBO {

	@Autowired
	private RealtorDAO realtorDAO;
	public int addRealtor(Realtor realtor) {
		return realtorDAO.insertRealtor(realtor);
		
	}
}

package com.yoojung0318.test.mybatis.dao;

import org.springframework.stereotype.Repository;

import com.yoojung0318.test.mybatis.model.Realtor;

@Repository
public interface RealtorDAO {

	public int insertRealtor(Realtor realtor);
}

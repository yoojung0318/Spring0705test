package com.yoojung0318.test.jstl.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoojung0318.test.jstl.dao.WeatherDAO;
import com.yoojung0318.test.jstl.model.Weather;

@Service
public class WeatherBO {
	
	@Autowired
	private WeatherDAO weatherDAO;
	
	// 날씨 정보 리스트 가져오기 
	public List<Weather> getWeatherHistory() {
		return weatherDAO.selectWeatherHistory();
	}
	
	// 날씨 정보 입력하기 
	public int addWeather(Date date
			, String weather
			, double temperatures
			, double precipitation
			, String microDust
			, double windSpeed) {
		
		return weatherDAO.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
	}
}


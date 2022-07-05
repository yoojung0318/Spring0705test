package com.yoojung0318.test.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/test01")
public class Test02Controller {

	
	@RequestMapping("/3")
	@ResponseBody
	public List<Map<String,Object>> movieList() {
		
		List<Map<String, Object>> movieList = new ArrayList<>();
	    Map<String, Object> movie = new HashMap<>();
	    	
	    		movie.put("rate",15);
	    		movie.put("director","봉준호");
	    		movie.put("time","131");
	    		movie.put("title","기생충");
	    		movieList.add(movie);
	    
	    	
	    		movie.put("rate",0);
	    		movie.put("director","로베르토 베니니");
	    		movie.put("time",116);
	    		movie.put("title","인생은 아름다워");
	    		movieList.add(movie);
	    	
	    
	    		movie.put("rate",12);
	    		movie.put("director","크리스토퍼 놀란");
	    		movie.put("time",147);
	    		movie.put("title","인셉션");
	    		movieList.add(movie);
	    	
	    	
	    		movie.put("rate",19);
	    		movie.put("director","윤종빈");
	    		movie.put("time",133);
	    		movie.put("title","범죄와의 전쟁 : 나쁜놈들 전성시대");
	    		movieList.add(movie);
	    		
	    		return movieList;
	    
	    		
	
	    	
	
	    
    	
	
	}
}

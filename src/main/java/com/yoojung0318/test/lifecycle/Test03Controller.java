package com.yoojung0318.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test03Controller {
	@RequestMapping("/lifecycle/test03/01")
	public String view() {
		return "lifecycle/test03";
	}
}

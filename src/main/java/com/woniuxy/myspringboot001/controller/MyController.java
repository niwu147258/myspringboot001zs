package com.woniuxy.myspringboot001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping(value="/first.do")
	@ResponseBody
	public String test01() {
		return "aaa";
	}
	
	@RequestMapping(value="/second")
	@ResponseBody
	public String test02() {
		return "vvvv";
	}
}

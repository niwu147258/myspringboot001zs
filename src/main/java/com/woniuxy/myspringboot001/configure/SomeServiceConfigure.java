package com.woniuxy.myspringboot001.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.woniuxy.myspringboot001.service.SomeService;

//@Configuration
public class SomeServiceConfigure {
	
	//@Bean("someService")
	public SomeService getSomeService() {
		return new SomeService();
	}
}

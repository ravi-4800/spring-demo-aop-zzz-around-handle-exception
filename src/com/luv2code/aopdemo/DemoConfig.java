package com.luv2code.aopdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.luv2code.aopdemo.aspect.MyDemoLoggingAspect;
import com.luv2code.aopdemo.dao.AccountDAO;


@Configuration
@ComponentScan("com.luv2code.aopdemo")
@EnableAspectJAutoProxy
public class DemoConfig {
	
//	@Bean
//    public MyDemoLoggingAspect myDemoLoggingAspect() {
//        return new MyDemoLoggingAspect();
//    }
//	
//	@Bean
//    public AccountDAO accountDAO() {
//        return new AccountDAO();
//    }
}

package com.xushishu.api.controller;

import org.apache.logging.log4j.spi.LoggerRegistry.WeakMapFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//如果注册中心时consol/zookeeper，可以使用此注解，向注册中心注册此服务
@EnableDiscoveryClient
public class AppMember {
	public static void main(String[] args) {
		SpringApplication.run(AppMember.class, args);
		 
	}
	
}

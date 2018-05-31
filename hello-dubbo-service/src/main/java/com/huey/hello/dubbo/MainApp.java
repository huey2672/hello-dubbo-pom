package com.huey.hello.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		appCtx.start();
		System.out.println("服务已启动。");
		System.in.read();
		appCtx.close();
		System.out.println("服务已停止。");
	}

}

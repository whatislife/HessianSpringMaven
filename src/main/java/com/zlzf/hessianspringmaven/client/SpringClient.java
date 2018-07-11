package com.zlzf.hessianspringmaven.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zlzf.hessianspringmaven.common.SayHello;



public class SpringClient {
	public static void main(String[] args) {  
		 ApplicationContext contex = 
				 new ClassPathXmlApplicationContext("client/hessian-client.xml");
        // 获得客户端的Hessian代理工厂bean  
        SayHello i = (SayHello) contex.getBean("hessianClient");  
        System.out.println(i.sayHello("masongchao"));  
	}  
}

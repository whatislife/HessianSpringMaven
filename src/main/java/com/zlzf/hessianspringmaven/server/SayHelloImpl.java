package com.zlzf.hessianspringmaven.server;

import com.zlzf.hessianspringmaven.common.SayHello;

public class SayHelloImpl implements SayHello{

	@Override
	public String sayHello(String name) {
		System.out.println("服务端方法被调用！");
		return "Hello,"+name+"!";
	}
	
}

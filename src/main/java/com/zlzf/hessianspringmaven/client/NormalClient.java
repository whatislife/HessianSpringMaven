package com.zlzf.hessianspringmaven.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zlzf.hessianspringmaven.common.SayHello;


public class NormalClient {
	  
    public static void main(String[] args) throws MalformedURLException {  
        //Spring Hessian代理Servelet  
        String url = "http://localhost:8080/HessianSpringMaven/hessian/sayHello";  
        HessianProxyFactory factory = new HessianProxyFactory();  
        SayHello api = (SayHello) factory.create(SayHello.class, url);  
  
        System.out.println(api.sayHello("masongchao"));  
    }  

}

package com.te.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Demo implements InitializingBean, DisposableBean {

	public Demo() {
		System.out.println("the bean is instantiated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From set of properties");

	}

	public void name() {
		System.out.println("after setting the properties");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("deestroying the bean");

	}

}

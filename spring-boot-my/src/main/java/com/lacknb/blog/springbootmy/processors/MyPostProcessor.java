package com.lacknb.blog.springbootmy.processors;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2024/3/28 15:04
 **/
public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		if ("myPostProcessor".equals(beanName)) {
			System.out.println(beanName + " MyPostProcessor.postProcessBeforeInitialization");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		if ("myPostProcessor".equals(beanName)) {
			System.out.println(beanName + " MyPostProcessor.postProcessAfterInitialization");
		}
		return bean;
	}

}

package com.aim.inherit.inherit_core.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 配置
 * @author xjd
 *
 */
public class SpringContext {
	private static ClassPathXmlApplicationContext ctx;

	/**
	 * 加载spring配置
	 */
	public static void inizSpringCtx(String filePath) {
		ctx = new ClassPathXmlApplicationContext(filePath);
		ctx.registerShutdownHook();
	}

	/**
	 * 根据beanId获取bean
	 * 
	 * @param beanId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String beanId) {
		return (T) ctx.getBean(beanId);
	}

}

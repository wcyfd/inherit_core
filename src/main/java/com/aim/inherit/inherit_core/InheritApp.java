package com.aim.inherit.inherit_core;

import com.aim.inherit.inherit_core.utils.SpringContext;

/**
 * Hello world!
 *
 */
public class InheritApp {
	static final String SPR_FILE_PATH = "ApplicationContext.xml";

	public static void main(String[] args) {
		SpringContext.inizSpringCtx(SPR_FILE_PATH);
	}
}

package com.aim.inherit.inherit_core.utils;

import com.jolbox.bonecp.BoneCPDataSource;

public class DataSource extends BoneCPDataSource {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2794294650474219519L;
	
	public static String jdbcUrl = null;
	public DataSource() {
		setJdbcUrl(jdbcUrl);
	}

}

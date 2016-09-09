package com.aim.inherit.inherit_core.scheduler;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RoleUpdateScheduled {
	private static ScheduledExecutorService roleUpdate = new ScheduledThreadPoolExecutor(1);

	public static void startScheduled() {
		roleUpdate.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}

		}, 1, 30, TimeUnit.MINUTES);
	}

}

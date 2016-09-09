package com.aim.inherit.inherit_core.scheduler;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BossScheduled {
	private static ScheduledExecutorService bossScheduled = new ScheduledThreadPoolExecutor(1);

	public static void startScheduled() {
		createBoss();
	}

	private static void createBoss() {
		bossScheduled.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println("boss 出现");
			}
		}, 0, 1, TimeUnit.SECONDS);
	}
}

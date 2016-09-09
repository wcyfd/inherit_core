package com.aim.inherit.inherit_core.service.fight.service;

public interface FightService {
	/**
	 * 开始战斗
	 * 
	 * @param roleId
	 * @author wcy 2016年9月9日
	 */
	void start(int roleId);

	/**
	 * 攻击
	 * 
	 * @param roleId
	 * @author wcy 2016年9月9日
	 */
	void attack(int roleId);

	/**
	 * 死亡
	 * 
	 * @param roleId
	 * @author wcy 2016年9月9日
	 */
	void dead(int roleId);

	/**
	 * 撤退
	 * 
	 * @param roleId
	 * @author wcy 2016年9月9日
	 */
	void retreat(int roleId);

	/**
	 * 通知战况（主推）
	 * 
	 * @author wcy 2016年9月9日
	 */
	void noticeBossStatus();

}

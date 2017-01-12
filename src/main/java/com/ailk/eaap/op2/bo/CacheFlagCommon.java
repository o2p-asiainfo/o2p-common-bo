package com.ailk.eaap.op2.bo;

public class CacheFlagCommon {
	
	public final static String TASK_MAP_FLAG = "TASK_MAP_FLAG";
	
	// 任务缓存标示
	public final static String TASK_FLAG = "TASK_OBJID_";
	
	//含有分发任务的扩展标示
	public final static String PUB_FLAG = "_PUB_";
	
	//任务在缓存中的准备状态（已进入队列）
	public final static Integer TASK_STATUS_READY = 0;
	
	//任务在缓存中的运行状态（已被队列消费）
	public final static Integer TASK_STATUS_RUNNING = 1;
	
	//任务在缓存中的异常状态
	public final static Integer TASK_STATUS_EXCEPTION = 2;
	
	//任务在缓存中的完成状态
	public final static Integer TASK_STATUS_OVER = 3;

}

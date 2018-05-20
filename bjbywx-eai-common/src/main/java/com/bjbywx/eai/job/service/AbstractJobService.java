/*
 * Copyright (c) 2018-2025 北京博艺网讯    bjbywx.com
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bjbywx.eai.job.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractJobService implements JobService {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected List<String> serverList = new ArrayList<>();

	/**
	 * 
	 * <b>描述:</b>开始执行JOB程序<br>
	 * 
	 * @param scheduleName
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午10:17:03 <br>
	 *       <b>版本:</b> 1.0
	 */
	protected void execute(String scheduleName, String eventId) {
		boolean running = true;
		int i = 0;// 尝试5次
		int j = 0;
		while (running && i < 5) {
			i++;
			executeSharding(eventId);// 执行任务分片
			currentPerform(eventId);// 执行当前分片任务

			try {
				Thread.sleep(1 * 60 * 1000L);
			} catch (InterruptedException e) {
				logger.error(e.getMessage(), e);
			}

			if (reExecuteSharding(eventId)) {
				// 如果重新执行分片则重新开始累计
				j++;
				i = 0;
			}
			if (j >= 5) {
				// 5次重新分片则直接跳出
				running = false;
			}

			if (getJobStatus(eventId).equalsIgnoreCase("SUCCESS") || j >= 5) {
				running = false;
			}
		}
	}

	protected void currentPerform(String eventId) {
		// 告诉服务说已经打算开始执行当前服务器的任务
		// 查询服务的分片信息
		executeShardingJob(eventId, null);
		// 过滤掉已经完成的
		// 告诉服务说任务已经执行完成
	}

	protected String getJobStatus(String eventId) {
		// 获取服务器池中各个程序的执行状态
		// 所有服务执行成功则成功，任何一个服务执行中整个job执行中，任何一个服务执行失败， 都执行失败则为失败
		return "SUCCESS";
	}

}

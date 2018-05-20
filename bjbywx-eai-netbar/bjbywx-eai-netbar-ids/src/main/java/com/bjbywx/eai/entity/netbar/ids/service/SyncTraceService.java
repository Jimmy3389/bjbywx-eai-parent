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
package com.bjbywx.eai.entity.netbar.ids.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;

import com.bjbywx.eai.entity.domain.TraceRecord;
import com.bjbywx.eai.entity.netbar.ids.provider.trace.TraceService;
import com.bjbywx.eai.job.service.AbstractJobService;

@Service
public class SyncTraceService extends AbstractJobService {

	@Inject
	private TraceService traceService;

	/**
	 * 
	 * <p>
	 * Title: executeSharding
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see com.bjbywx.eai.job.netbar.service.JobService#executeSharding()
	 */
	@Override
	public void executeSharding(String eventId) {
		// 获取这项任务的Leader
		// 如果没有 则推选自己
		try {
			Thread.sleep(Math.round(Math.random() * 1000));
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
		// 获取这项任务的Leader
		// 如果是自己就开始分片
		// 告诉大家自己在分片
		// 告诉大家分片完成
	}

	@Override
	public boolean reExecuteSharding(String eventId) {
		// 查询当前任务所有节点执行情况
		// 找出损失掉的服务或者执行失败的服务
		// 损失的服务或者执行失败的服务执行结果清理
		// 损失掉的服务或者执行失败的服务任务取出，重新分片
		return false;
	}

	@Override
	public void doJob(String jobName, String eventId) {
		super.execute(jobName, eventId);// 开始执行任务程序
	}

	@Override
	public void executeShardingJob(String eventId, Map<String, Object> paramMap) {
		long start = System.currentTimeMillis();
		logger.info("EVENT【{}】:  Execute Sharding Job Start ...", eventId);
		List<TraceRecord> list = new ArrayList<>();
		if (MapUtils.isNotEmpty(paramMap)) {// 说明
			if (paramMap.get("pageSize") != null && paramMap.get("pageSize") != null) {
				list.addAll(traceService.getTraceListByPage(paramMap.get("date") != null ? (Date) paramMap.get("date") : DateUtils.addDays(new Date(), -1),
						(int) paramMap.get("currentPage"), (int) paramMap.get("pageSize")));
			} else {
				list.addAll(traceService.getTraceListByDay(paramMap.get("date") != null ? (Date) paramMap.get("date") : DateUtils.addDays(new Date(), -1)));
			}
		} else {
			list.addAll(traceService.getYesterdayTraceList());
		}
		if (CollectionUtils.isEmpty(list)) {
			logger.warn("EVENT【{}】:  Execute Sharding Job , Has one Warn, Frond Trace is empty!", eventId);
		} else {

		}
		logger.info("EVENT【{}】:  Execute Sharding Job completed, time consuming: {} milliseconds, ", eventId, System.currentTimeMillis() - start);
	}

}

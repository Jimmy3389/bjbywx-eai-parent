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
package com.bjbywx.eai.entity.netbar.ids.task;

import java.util.UUID;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.bjbywx.eai.entity.netbar.ids.handler.SyncTraceHandler;
import com.bjbywx.eai.integration.repository.TraceInfoRepository;

/**
 * 
 * <b>描述:</b> <br>
 * 轨迹同步任务 <br>
 * <br>
 * <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy Zou</a>
 * <br>
 * <b>邮箱:</b> <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a>
 * 
 * @version 1.0
 * @Note <b>项目名称:</b> bjbywx-eai-netbar-job <br>
 *       <b>包名:</b> com.bjbywx.eai.job.netbar.task <br>
 *       <b>类名:</b> SyncTraceSchedule <br>
 *       <b>创建日期:</b> 2018年5月19日 下午3:47:17
 */
@Component
public class SyncTraceSchedule {

	private static final Logger logger = LoggerFactory.getLogger(SyncTraceSchedule.class);

	@Inject
	private SyncTraceHandler syncTraceHandler;

	@Inject
	private TraceInfoRepository traceInfoRepository;

	@Scheduled(fixedRate = 5 * 60 * 1000)
	public void syncNetbarTrace() {
		String eventId = UUID.randomUUID().toString().replaceAll("-", "");
		long start = System.currentTimeMillis();
		logger.info("EVENT【{}】:  Synchronizing Internet café trajectory information ...", eventId);
		traceInfoRepository.count();
		boolean result = syncTraceHandler.execute(eventId);
		logger.info("EVENT【{}】: Synchronized Internet café trajectory information completed, time consuming: {} milliseconds, result is {} ", eventId,
				System.currentTimeMillis() - start, result);
	}
}

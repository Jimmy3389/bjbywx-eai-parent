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
package com.bjbywx.eai.entity.netbar.ids.handler;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bjbywx.eai.entity.netbar.ids.service.SyncTraceService;
import com.bjbywx.eai.job.handler.AbstractJobHandler;

@Service
public class SyncTraceHandler extends AbstractJobHandler {

	@Inject
	private SyncTraceService syncTraceService;

	private static String JOB_NAME = "JOB_SYNC_TRACE";

	@Override
	public boolean execute(String eventId) {
		syncTraceService.doJob(JOB_NAME, eventId);// 执行Job程序
		return false;
	}

}

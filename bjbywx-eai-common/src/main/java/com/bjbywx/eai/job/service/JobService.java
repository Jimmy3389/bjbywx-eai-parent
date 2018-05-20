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

import java.util.Map;

public interface JobService {

	/**
	 * 
	 * <b>描述:</b>执行任务分片<br>
	 * 
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午10:08:21 <br>
	 *       <b>版本:</b> 1.0
	 */
	public void executeSharding(String eventId);

	/**
	 * 
	 * <b>描述:</b>重新执行分片<br>
	 * 
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午10:44:53 <br>
	 *       <b>版本:</b> 1.0
	 */
	public boolean reExecuteSharding(String eventId);

	public void executeShardingJob(String eventId, Map<String, Object> paramMap);

	public void doJob(String jobName, String eventId);
}

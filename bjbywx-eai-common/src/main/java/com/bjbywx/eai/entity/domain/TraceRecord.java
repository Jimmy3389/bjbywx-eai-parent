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
package com.bjbywx.eai.entity.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class TraceRecord {

	/** 轨迹ID */
	private String TraceId;

	/** 场所编码 */
	private String serviceCode;

	/** 身份类型 */
	private String idType;

	/** 身份编码 */
	private String idCode;

	/** 虚拟身份类型 */
	private String vidType;

	/** 虚拟身份类型 */
	private String vidCode;

	/** 真实身份登陆时间 */
	private Timestamp loginAt;

	/** 真实身份退出时间 */
	private Timestamp logoutAt;

	/** 虚拟身份登陆时间 */
	private Timestamp onlineAt;

	/** 虚拟身份退出时间 */
	private Timestamp offlineAt;

	/** 当日登陆序号 */
	private Integer sequence;

}

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
package com.bjbywx.eai.entity.netbar.ids.provider.trace;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.bjbywx.eai.entity.domain.TraceRecord;

/**
 * 
 * <b>描述:</b> <br>
 * 轨迹服务数据 <br>
 * <br>
 * <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy Zou</a>
 * <br>
 * <b>邮箱:</b> <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a>
 * 
 * @version 1.0
 * @Note <b>项目名称:</b> bjbywx-eai-netbar-ids <br>
 *       <b>包名:</b> com.bjbywx.eai.entity.netbar.ids.provider.trace <br>
 *       <b>类名:</b> TraceService <br>
 *       <b>创建日期:</b> 2018年5月18日 下午10:04:37
 */
@Service
public class TraceService {

	@Inject
	@Qualifier("netbarIdsJdbcTemplate")
	private JdbcTemplate netbarIdsJdbcTemplate;

	private static SimpleDateFormat formarForMonth = new SimpleDateFormat("yyyy_M");

	private static SimpleDateFormat formarForDay = new SimpleDateFormat("yyyy-MM-dd");

	private static Logger logger = LoggerFactory.getLogger(TraceService.class);

	// 查询并统计当天场所的身份、虚拟身份情况
	private static final String QUERY_STATS_NETBAR_ID_FOR_DAY = "SELECT P.* , ROWNUMBER() OVER() AS RN  FROM (SELECT  T.SESSION_ID AS TRACE_ID, T.SERVICE_CODE AS SERVICE_CODE,T.ID_CODE AS R_ID,T.ID_TYPE AS R_ID_TYPE,TV.ID_TYPE AS V_ID_TYPE,TV.ID_CODE AS V_ID_CODE,T.LOGIN_AT AS R_LOGIN_AT,T.LOGOUT_AT AS R_LOGOUT_AT,TV.ONLINE_AT AS V_ONLINE_AT,TV.OFFLINE_AT AS V_OFFLINE_AT FROM IDS.TRACE_%s AS T LEFT JOIN IDS.TRACE_VID_%s TV ON T.SESSION_ID=TV.SESSION_ID WHERE T.LOGIN_AT > TIMESTAMP('%s','00:00:00')  AND  T.LOGIN_AT  < TIMESTAMP('%s','00:00:00') + 1 DAY ORDER BY T.LOGIN_AT ) P";

	private static final String QUERY_STATS_NETBAR_ID_FOR_DAY_COUNT = "SELECT COUNT(*) FROM (" + QUERY_STATS_NETBAR_ID_FOR_DAY + ")  A";

	private static final String QUERY_STATS_NETBAR_ID_FOR_DAY_PAGE = "SELECT * FROM (" + QUERY_STATS_NETBAR_ID_FOR_DAY + " ) AS A  WHERE A.RN BETWEEN  %d	AND  %d";

	private static String queryStatsNetbarIdForDay(Date date) {
		String sql = String.format(QUERY_STATS_NETBAR_ID_FOR_DAY, formarForMonth.format(date), formarForMonth.format(date), formarForDay.format(date), formarForDay.format(date));
		if (logger.isDebugEnabled()) {
			logger.debug("Execute sql is : " + sql);
		}
		return sql;
	}

	private static String queryStatsNetbarIdForCount(Date date) {
		String sql = String.format(QUERY_STATS_NETBAR_ID_FOR_DAY_COUNT, formarForMonth.format(date), formarForMonth.format(date), formarForDay.format(date),
				formarForDay.format(date));
		if (logger.isDebugEnabled()) {
			logger.debug("Execute sql is : " + sql);
		}
		return sql;
	}

	private static String queryStatsNetbarIdForDay(Date date, int start, int end) {
		String sql = String.format(QUERY_STATS_NETBAR_ID_FOR_DAY_PAGE, formarForMonth.format(date), formarForMonth.format(date), formarForDay.format(date),
				formarForDay.format(date), start, end);
		if (logger.isDebugEnabled()) {
			logger.debug("Execute sql is : " + sql);
		}
		return sql;
	}

	/**
	 * 
	 * <b>描述:</b>按照日期获取轨迹数据<br>
	 * 
	 * @param date
	 * @return
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午3:21:56 <br>
	 *       <b>版本:</b> 1.0
	 */
	public List<TraceRecord> getTraceListByDay(Date date) {
		return netbarIdsJdbcTemplate.query(queryStatsNetbarIdForDay(date), new TraceRecordRowMapper());
	}

	/**
	 * 
	 * <b>描述:</b>按照日期获取轨迹数量<br>
	 * 
	 * @param date
	 * @return
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午3:22:29 <br>
	 *       <b>版本:</b> 1.0
	 */
	public Integer getTraceCountByDay(Date date) {
		return netbarIdsJdbcTemplate.queryForObject(queryStatsNetbarIdForCount(date), java.lang.Integer.class);
	}

	/**
	 * 
	 * <b>描述:</b>按照指定日期分页获取轨迹数据<br>
	 * 
	 * @param date
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午3:22:56 <br>
	 *       <b>版本:</b> 1.0
	 */
	public List<TraceRecord> getTraceListByPage(Date date, int currentPage, int pageSize) {
		// DB2 between and == >= and <
		return netbarIdsJdbcTemplate.query(queryStatsNetbarIdForDay(date, (currentPage - 1) * pageSize, currentPage * pageSize), new TraceRecordRowMapper());
	}

	/**
	 * 
	 * <b>描述:</b>获取昨天的轨迹列表<br>
	 * 
	 * @return
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午3:23:22 <br>
	 *       <b>版本:</b> 1.0
	 */
	public List<TraceRecord> getYesterdayTraceList() {
		return getTraceListByDay(DateUtils.addDays(new Date(), -1));
	}

	/**
	 * 
	 * <b>描述:</b>获取昨日的轨迹数量<br>
	 * 
	 * @return
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午3:23:38 <br>
	 *       <b>版本:</b> 1.0
	 */
	public Integer getYesterdayTraceCount() {
		return getTraceCountByDay(DateUtils.addDays(new Date(), -1));
	}

	/**
	 * 
	 * <b>描述:</b>分页获取昨日轨迹数据<br>
	 * 
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @Note <br>
	 *       <b>作者:</b> <a href="http://www.9isuper.com" target="_blank">Jimmy
	 *       Zou</a> <br>
	 *       <b>邮件:</b>
	 *       <a href="mailto:Jimmy3389@9isuper.com">Jimmy3389@9isuper.com</a> <br>
	 *       <b>创建日期:</b> 2018年5月19日 下午3:24:40 <br>
	 *       <b>版本:</b> 1.0
	 */
	public List<TraceRecord> getYesterdayTraceListByPage(int currentPage, int pageSize) {
		return getTraceListByPage(DateUtils.addDays(new Date(), -1), currentPage, pageSize);
	}

	class TraceRecordRowMapper implements RowMapper<TraceRecord> {

		@Override
		public TraceRecord mapRow(ResultSet rs, int rowNum) throws SQLException {
			TraceRecord traceRecord = new TraceRecord();
			traceRecord.setTraceId(rs.getString("TRACE_ID"));
			traceRecord.setServiceCode(rs.getString("SERVICE_CODE"));
			traceRecord.setIdCode(rs.getString("R_ID"));
			traceRecord.setIdType(rs.getString("R_ID_TYPE"));
			traceRecord.setVidCode(rs.getString("V_ID_CODE"));
			traceRecord.setVidType(rs.getString("V_ID_TYPE"));
			traceRecord.setLoginAt(rs.getTimestamp("LOGIN_AT"));
			traceRecord.setLogoutAt(rs.getTimestamp("R_LOGOUT_AT"));
			traceRecord.setOfflineAt(rs.getTimestamp("V_OFFLINE_AT"));
			traceRecord.setOnlineAt(rs.getTimestamp("V_ONLINE_AT"));
			traceRecord.setSequence(rs.getInt("RN"));
			return traceRecord;
		}

	}
}

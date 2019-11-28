/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Availability-Monitoring-APIs
 * 可用性监控相关接口，提供创建、查询、修改、删除可用性监控任务等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看可用性监控任务的监控数据
 */
public class DescribeMetricDataAmRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源的uuid
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（早于30d时，将被重置为30d）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     */
    private String startTime;

    /**
     * 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     */
    private String endTime;

    /**
     * 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     */
    private String timeInterval;


    /**
     * get 资源的uuid
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（早于30d时，将被重置为30d）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（早于30d时，将被重置为30d）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     *
     * @return
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     *
     * @param timeInterval
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }


    /**
     * set 资源的uuid
     *
     * @param resourceId
     */
    public DescribeMetricDataAmRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 查询时间范围的开始时间， UTC时间，格式：2016-12-11T00:00:00+0800（早于30d时，将被重置为30d）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param startTime
     */
    public DescribeMetricDataAmRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询时间范围的结束时间， UTC时间，格式：2016-12-11T00:00:00+0800（为空时，将由startTime与timeInterval计算得出）（注意在url中+要转译为%2B故url中为2016-12-11T00:00:00%2B0800）
     *
     * @param endTime
     */
    public DescribeMetricDataAmRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 时间间隔：1h，6h，12h，1d，3d，7d，14d，固定时间间隔，timeInterval 与 endTime 至少填一项
     *
     * @param timeInterval
     */
    public DescribeMetricDataAmRequest timeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }


}
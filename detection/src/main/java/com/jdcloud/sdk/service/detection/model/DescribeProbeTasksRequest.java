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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.detection.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询可用性监控任务列表
 */
public class DescribeProbeTasksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前所在页，默认为1
     */
    private Long pageNumber;

    /**
     * 页面大小，默认为20；取值范围[1, 100]
     */
    private Long pageSize;

    /**
     * 根据探测任务的名称查询，支持模糊查询
     */
    private String name;

    /**
     * 根据探测任务的类型查询，1、http 2、telnet
     */
    private Long type;

    /**
     * 查询的可用率、响应时间的时间间隔，为空时默认查询最新点,最大不超过30天，支持分钟级别,小时级别，天级别，例如：1m、1h、1d
     */
    private String timeInterval;

    /**
     * 是否查询可用率、响应时间
     */
    private Boolean withStats;

    /**
     * 是否包含被删除的task
     */
    private Boolean withDeleted;

    /**
     * 任务状态：1为启用，0为禁用。默认为查所有的
     */
    private Long enabled;

    /**
     * taskId - taskId，精确匹配，支持多个
name - task名称或探测地址，糊模匹配，支持单个
     */
    private List<Filter> filters;


    /**
     * get 当前所在页，默认为1
     *
     * @return
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 页面大小，默认为20；取值范围[1, 100]
     *
     * @return
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 根据探测任务的名称查询，支持模糊查询
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 根据探测任务的名称查询，支持模糊查询
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 根据探测任务的类型查询，1、http 2、telnet
     *
     * @return
     */
    public Long getType() {
        return type;
    }

    /**
     * set 根据探测任务的类型查询，1、http 2、telnet
     *
     * @param type
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * get 查询的可用率、响应时间的时间间隔，为空时默认查询最新点,最大不超过30天，支持分钟级别,小时级别，天级别，例如：1m、1h、1d
     *
     * @return
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 查询的可用率、响应时间的时间间隔，为空时默认查询最新点,最大不超过30天，支持分钟级别,小时级别，天级别，例如：1m、1h、1d
     *
     * @param timeInterval
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    /**
     * get 是否查询可用率、响应时间
     *
     * @return
     */
    public Boolean getWithStats() {
        return withStats;
    }

    /**
     * set 是否查询可用率、响应时间
     *
     * @param withStats
     */
    public void setWithStats(Boolean withStats) {
        this.withStats = withStats;
    }

    /**
     * get 是否包含被删除的task
     *
     * @return
     */
    public Boolean getWithDeleted() {
        return withDeleted;
    }

    /**
     * set 是否包含被删除的task
     *
     * @param withDeleted
     */
    public void setWithDeleted(Boolean withDeleted) {
        this.withDeleted = withDeleted;
    }

    /**
     * get 任务状态：1为启用，0为禁用。默认为查所有的
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 任务状态：1为启用，0为禁用。默认为查所有的
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get taskId - taskId，精确匹配，支持多个
name - task名称或探测地址，糊模匹配，支持单个
     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set taskId - taskId，精确匹配，支持多个
name - task名称或探测地址，糊模匹配，支持单个
     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * set 当前所在页，默认为1
     *
     * @param pageNumber
     */
    public DescribeProbeTasksRequest pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
     *
     * @param pageSize
     */
    public DescribeProbeTasksRequest pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 根据探测任务的名称查询，支持模糊查询
     *
     * @param name
     */
    public DescribeProbeTasksRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 根据探测任务的类型查询，1、http 2、telnet
     *
     * @param type
     */
    public DescribeProbeTasksRequest type(Long type) {
        this.type = type;
        return this;
    }

    /**
     * set 查询的可用率、响应时间的时间间隔，为空时默认查询最新点,最大不超过30天，支持分钟级别,小时级别，天级别，例如：1m、1h、1d
     *
     * @param timeInterval
     */
    public DescribeProbeTasksRequest timeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * set 是否查询可用率、响应时间
     *
     * @param withStats
     */
    public DescribeProbeTasksRequest withStats(Boolean withStats) {
        this.withStats = withStats;
        return this;
    }

    /**
     * set 是否包含被删除的task
     *
     * @param withDeleted
     */
    public DescribeProbeTasksRequest withDeleted(Boolean withDeleted) {
        this.withDeleted = withDeleted;
        return this;
    }

    /**
     * set 任务状态：1为启用，0为禁用。默认为查所有的
     *
     * @param enabled
     */
    public DescribeProbeTasksRequest enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set taskId - taskId，精确匹配，支持多个
name - task名称或探测地址，糊模匹配，支持单个
     *
     * @param filters
     */
    public DescribeProbeTasksRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * add item to taskId - taskId，精确匹配，支持多个
name - task名称或探测地址，糊模匹配，支持单个
     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}
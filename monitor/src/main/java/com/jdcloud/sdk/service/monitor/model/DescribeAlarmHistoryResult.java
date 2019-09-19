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
 * Monitoring Rules APIs
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.DescribedAlarmHistory;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询报警历史
 */
public class DescribeAlarmHistoryResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * alarmHistoryList
     */
    private List<DescribedAlarmHistory> alarmHistoryList;

    /**
     * 总页数
     */
    private Long numberPages;

    /**
     * 总记录数
     */
    private Long numberRecords;

    /**
     * 当前页码
     */
    private Long pageNumber;

    /**
     * 分页大小
     */
    private Long pageSize;


    /**
     * get alarmHistoryList
     *
     * @return
     */
    public List<DescribedAlarmHistory> getAlarmHistoryList() {
        return alarmHistoryList;
    }

    /**
     * set alarmHistoryList
     *
     * @param alarmHistoryList
     */
    public void setAlarmHistoryList(List<DescribedAlarmHistory> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
    }

    /**
     * get 总页数
     *
     * @return
     */
    public Long getNumberPages() {
        return numberPages;
    }

    /**
     * set 总页数
     *
     * @param numberPages
     */
    public void setNumberPages(Long numberPages) {
        this.numberPages = numberPages;
    }

    /**
     * get 总记录数
     *
     * @return
     */
    public Long getNumberRecords() {
        return numberRecords;
    }

    /**
     * set 总记录数
     *
     * @param numberRecords
     */
    public void setNumberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
    }

    /**
     * get 当前页码
     *
     * @return
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * set alarmHistoryList
     *
     * @param alarmHistoryList
     */
    public DescribeAlarmHistoryResult alarmHistoryList(List<DescribedAlarmHistory> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }

    /**
     * set 总页数
     *
     * @param numberPages
     */
    public DescribeAlarmHistoryResult numberPages(Long numberPages) {
        this.numberPages = numberPages;
        return this;
    }

    /**
     * set 总记录数
     *
     * @param numberRecords
     */
    public DescribeAlarmHistoryResult numberRecords(Long numberRecords) {
        this.numberRecords = numberRecords;
        return this;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public DescribeAlarmHistoryResult pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeAlarmHistoryResult pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * add item to alarmHistoryList
     *
     * @param alarmHistoryList
     */
    public void addAlarmHistoryList(DescribedAlarmHistory alarmHistoryList) {
        if (this.alarmHistoryList == null) {
            this.alarmHistoryList = new ArrayList<>();
        }
        this.alarmHistoryList.add(alarmHistoryList);
    }

}
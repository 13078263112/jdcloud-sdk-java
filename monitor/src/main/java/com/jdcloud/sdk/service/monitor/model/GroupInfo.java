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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * groupInfo
 */
public class GroupInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 监控图的展示方式
     */
    private List<Chart> charts;

    /**
     * 分组groupCode
     */
    private String groupCode;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 分组下metric对应的tags
     */
    private Object tags;

    /**
     * 分组的webCode
     */
    private String webCode;


    /**
     * get 监控图的展示方式
     *
     * @return
     */
    public List<Chart> getCharts() {
        return charts;
    }

    /**
     * set 监控图的展示方式
     *
     * @param charts
     */
    public void setCharts(List<Chart> charts) {
        this.charts = charts;
    }

    /**
     * get 分组groupCode
     *
     * @return
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * set 分组groupCode
     *
     * @param groupCode
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * get 分组名称
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * set 分组名称
     *
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * get 分组下metric对应的tags
     *
     * @return
     */
    public Object getTags() {
        return tags;
    }

    /**
     * set 分组下metric对应的tags
     *
     * @param tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }

    /**
     * get 分组的webCode
     *
     * @return
     */
    public String getWebCode() {
        return webCode;
    }

    /**
     * set 分组的webCode
     *
     * @param webCode
     */
    public void setWebCode(String webCode) {
        this.webCode = webCode;
    }


    /**
     * set 监控图的展示方式
     *
     * @param charts
     */
    public GroupInfo charts(List<Chart> charts) {
        this.charts = charts;
        return this;
    }

    /**
     * set 分组groupCode
     *
     * @param groupCode
     */
    public GroupInfo groupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    /**
     * set 分组名称
     *
     * @param groupName
     */
    public GroupInfo groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * set 分组下metric对应的tags
     *
     * @param tags
     */
    public GroupInfo tags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 分组的webCode
     *
     * @param webCode
     */
    public GroupInfo webCode(String webCode) {
        this.webCode = webCode;
        return this;
    }


    /**
     * add item to 监控图的展示方式
     *
     * @param chart
     */
    public void addChart(Chart chart) {
        if (this.charts == null) {
            this.charts = new ArrayList<>();
        }
        this.charts.add(chart);
    }

}
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
 * Monitor API
 * 云托管服务的监控API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看某资源的最后一个监控数据点（目前只支持机柜电流）
 */
public class LastDownsampleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源ID，支持多个resourceId批量查询，每个id用竖线 | 分隔
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * IDC机房ID
     * Required:true
     */
    @Required
    private String idc;

    /**
     * 监控项英文标识(id)
     * Required:true
     */
    @Required
    private String metric;


    /**
     * get 资源ID，支持多个resourceId批量查询，每个id用竖线 | 分隔
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID，支持多个resourceId批量查询，每个id用竖线 | 分隔
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get IDC机房ID
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set IDC机房ID
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }

    /**
     * get 监控项英文标识(id)
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项英文标识(id)
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * set 资源ID，支持多个resourceId批量查询，每个id用竖线 | 分隔
     *
     * @param resourceId
     */
    public LastDownsampleRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set IDC机房ID
     *
     * @param idc
     */
    public LastDownsampleRequest idc(String idc) {
        this.idc = idc;
        return this;
    }

    /**
     * set 监控项英文标识(id)
     *
     * @param metric
     */
    public LastDownsampleRequest metric(String metric) {
        this.metric = metric;
        return this;
    }


}
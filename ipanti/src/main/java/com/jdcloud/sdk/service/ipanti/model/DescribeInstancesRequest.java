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
 * Anti DDos Pro Instance APIs
 * Anti DDos Pro Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询实例列表
 */
public class DescribeInstancesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为 1
     */
    private Integer pageNumber;

    /**
     * 分页大小, 默认为 10, 取值范围[10, 100], 0 表示全量
     */
    private Integer pageSize;

    /**
     * 实例名称，可模糊匹配
     */
    private String name;

    /**
     * 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码, 默认为 1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为 1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小, 默认为 10, 取值范围[10, 100], 0 表示全量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小, 默认为 10, 取值范围[10, 100], 0 表示全量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 实例名称，可模糊匹配
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例名称，可模糊匹配
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码, 默认为 1
     *
     * @param pageNumber
     */
    public DescribeInstancesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小, 默认为 10, 取值范围[10, 100], 0 表示全量
     *
     * @param pageSize
     */
    public DescribeInstancesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 实例名称，可模糊匹配
     *
     * @param name
     */
    public DescribeInstancesRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public DescribeInstancesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}
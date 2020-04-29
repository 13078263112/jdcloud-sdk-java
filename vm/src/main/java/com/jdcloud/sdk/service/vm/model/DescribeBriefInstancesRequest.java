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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vm.model.TagFilter;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量查询云主机信息的轻量接口，不返回云盘、网络、计费、标签等信息。如果不需要关联资源属性，尽量选择使用该接口。&lt;br&gt;
此接口支持分页查询，默认每页20条。

 */
public class DescribeBriefInstancesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * Tag筛选条件
     */
    private List<TagFilter> tags;

    /**
     * instanceId - 云主机ID，精确匹配，支持多个
privateIpAddress - 主网卡内网主IP地址，模糊匹配，支持多个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
name - 云主机名称，模糊匹配，支持单个
imageId - 镜像ID，精确匹配，支持多个
networkInterfaceId - 弹性网卡ID，精确匹配，支持多个
subnetId - 子网ID，精确匹配，支持多个
agId - 使用可用组id，支持单个
faultDomain - 错误域，支持多个
dedicatedHostId - 专有宿主机ID，精确匹配，支持多个
dedicatedPoolId - 专有宿主机池ID，精确匹配，支持多个
instanceType - 实例规格，精确匹配，支持多个
elasticIpAddress - 公网IP地址，精确匹配，支持单个

     */
    private List<Filter> filters;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为20；取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get Tag筛选条件
     *
     * @return
     */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
     * set Tag筛选条件
     *
     * @param tags
     */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
    }

    /**
     * get instanceId - 云主机ID，精确匹配，支持多个
privateIpAddress - 主网卡内网主IP地址，模糊匹配，支持多个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
name - 云主机名称，模糊匹配，支持单个
imageId - 镜像ID，精确匹配，支持多个
networkInterfaceId - 弹性网卡ID，精确匹配，支持多个
subnetId - 子网ID，精确匹配，支持多个
agId - 使用可用组id，支持单个
faultDomain - 错误域，支持多个
dedicatedHostId - 专有宿主机ID，精确匹配，支持多个
dedicatedPoolId - 专有宿主机池ID，精确匹配，支持多个
instanceType - 实例规格，精确匹配，支持多个
elasticIpAddress - 公网IP地址，精确匹配，支持单个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set instanceId - 云主机ID，精确匹配，支持多个
privateIpAddress - 主网卡内网主IP地址，模糊匹配，支持多个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
name - 云主机名称，模糊匹配，支持单个
imageId - 镜像ID，精确匹配，支持多个
networkInterfaceId - 弹性网卡ID，精确匹配，支持多个
subnetId - 子网ID，精确匹配，支持多个
agId - 使用可用组id，支持单个
faultDomain - 错误域，支持多个
dedicatedHostId - 专有宿主机ID，精确匹配，支持多个
dedicatedPoolId - 专有宿主机池ID，精确匹配，支持多个
instanceType - 实例规格，精确匹配，支持多个
elasticIpAddress - 公网IP地址，精确匹配，支持单个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeBriefInstancesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribeBriefInstancesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set Tag筛选条件
     *
     * @param tags
     */
    public DescribeBriefInstancesRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set instanceId - 云主机ID，精确匹配，支持多个
privateIpAddress - 主网卡内网主IP地址，模糊匹配，支持多个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
name - 云主机名称，模糊匹配，支持单个
imageId - 镜像ID，精确匹配，支持多个
networkInterfaceId - 弹性网卡ID，精确匹配，支持多个
subnetId - 子网ID，精确匹配，支持多个
agId - 使用可用组id，支持单个
faultDomain - 错误域，支持多个
dedicatedHostId - 专有宿主机ID，精确匹配，支持多个
dedicatedPoolId - 专有宿主机池ID，精确匹配，支持多个
instanceType - 实例规格，精确匹配，支持多个
elasticIpAddress - 公网IP地址，精确匹配，支持单个

     *
     * @param filters
     */
    public DescribeBriefInstancesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeBriefInstancesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to Tag筛选条件
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to instanceId - 云主机ID，精确匹配，支持多个
privateIpAddress - 主网卡内网主IP地址，模糊匹配，支持多个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/vm_status&quot;&gt;参考云主机状态&lt;/a&gt;
name - 云主机名称，模糊匹配，支持单个
imageId - 镜像ID，精确匹配，支持多个
networkInterfaceId - 弹性网卡ID，精确匹配，支持多个
subnetId - 子网ID，精确匹配，支持多个
agId - 使用可用组id，支持单个
faultDomain - 错误域，支持多个
dedicatedHostId - 专有宿主机ID，精确匹配，支持多个
dedicatedPoolId - 专有宿主机池ID，精确匹配，支持多个
instanceType - 实例规格，精确匹配，支持多个
elasticIpAddress - 公网IP地址，精确匹配，支持单个

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
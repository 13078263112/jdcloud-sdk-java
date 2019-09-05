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
 * 分布式云物理服务器
 * 分布式云物理服务器私有网络操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询私有网络详情
 */
public class DescribeVpcRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID，可调用接口（queryEdCPSRegions）获取分布式云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 私有网络ID
     * Required:true
     */
    @Required
    private String vpcId;


    /**
     * get 地域ID，可调用接口（queryEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（queryEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
     * set 地域ID，可调用接口（queryEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public DescribeVpcRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public DescribeVpcRequest vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


}
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
 * 云物理服务器
 * 云物理服务器负载均衡实例操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询负载均衡实例详情
 */
public class QueryLoadBalancerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 负载均衡实例ID
     * Required:true
     */
    @Required
    private String loadBalancerId;


    /**
     * get 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 负载均衡实例ID
     *
     * @return
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * set 负载均衡实例ID
     *
     * @param loadBalancerId
     */
    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }


    /**
     * set 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public QueryLoadBalancerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 负载均衡实例ID
     *
     * @param loadBalancerId
     */
    public QueryLoadBalancerRequest loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }


}
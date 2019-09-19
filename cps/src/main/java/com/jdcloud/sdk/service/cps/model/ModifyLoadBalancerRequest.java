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
 * 修改负载均衡实例
 */
public class ModifyLoadBalancerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

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
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

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
     * set 名称
     *
     * @param name
     */
    public ModifyLoadBalancerRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public ModifyLoadBalancerRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public ModifyLoadBalancerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 负载均衡实例ID
     *
     * @param loadBalancerId
     */
    public ModifyLoadBalancerRequest loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }


}
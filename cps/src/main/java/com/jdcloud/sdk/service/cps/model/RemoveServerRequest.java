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
 * 云物理服务器后端服务器操作相关的接口
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
 * 移除后端服务器
 */
public class RemoveServerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 服务器组ID
     * Required:true
     */
    @Required
    private String serverGroupId;

    /**
     * 后端服务器ID
     * Required:true
     */
    @Required
    private String serverId;


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
     * get 服务器组ID
     *
     * @return
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    /**
     * set 服务器组ID
     *
     * @param serverGroupId
     */
    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    /**
     * get 后端服务器ID
     *
     * @return
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * set 后端服务器ID
     *
     * @param serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }


    /**
     * set 地域ID，可调用接口（queryCPSLBRegions）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public RemoveServerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 服务器组ID
     *
     * @param serverGroupId
     */
    public RemoveServerRequest serverGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * set 后端服务器ID
     *
     * @param serverId
     */
    public RemoveServerRequest serverId(String serverId) {
        this.serverId = serverId;
        return this;
    }


}
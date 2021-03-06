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
 * Cloud
 * 与云信息相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取指定云信息
 */
public class GetCloudInfoByIdRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云信息ID
     * Required:true
     */
    @Required
    private String cloudId;


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
     * get 云信息ID
     *
     * @return
     */
    public String getCloudId() {
        return cloudId;
    }

    /**
     * set 云信息ID
     *
     * @param cloudId
     */
    public void setCloudId(String cloudId) {
        this.cloudId = cloudId;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GetCloudInfoByIdRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云信息ID
     *
     * @param cloudId
     */
    public GetCloudInfoByIdRequest cloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }


}
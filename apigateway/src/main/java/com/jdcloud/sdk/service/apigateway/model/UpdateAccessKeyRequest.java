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
 * API调用者密钥
 * 关于API调用者密钥操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新密钥
 */
public class UpdateAccessKeyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 描述
     */
    private String description;

    /**
     * 密钥类型
     */
    private String accessKeyType;

    /**
     * Access Key
     */
    private String accessKey;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * access key id
     * Required:true
     */
    @Required
    private String accessKeyId;


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
     * get 密钥类型
     *
     * @return
     */
    public String getAccessKeyType() {
        return accessKeyType;
    }

    /**
     * set 密钥类型
     *
     * @param accessKeyType
     */
    public void setAccessKeyType(String accessKeyType) {
        this.accessKeyType = accessKeyType;
    }

    /**
     * get Access Key
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set Access Key
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
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
     * get access key id
     *
     * @return
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * set access key id
     *
     * @param accessKeyId
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }


    /**
     * set 描述
     *
     * @param description
     */
    public UpdateAccessKeyRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 密钥类型
     *
     * @param accessKeyType
     */
    public UpdateAccessKeyRequest accessKeyType(String accessKeyType) {
        this.accessKeyType = accessKeyType;
        return this;
    }

    /**
     * set Access Key
     *
     * @param accessKey
     */
    public UpdateAccessKeyRequest accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UpdateAccessKeyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set access key id
     *
     * @param accessKeyId
     */
    public UpdateAccessKeyRequest accessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }


}
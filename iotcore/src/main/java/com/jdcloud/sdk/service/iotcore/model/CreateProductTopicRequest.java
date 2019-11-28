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
 * ProductTopic
 * 关于产品Topic信息操作的相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 新建产品Topic
 */
public class CreateProductTopicRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义类目名称, /user/{productKey}/{identifier}/topicShortName
     * Required:true
     */
    @Required
    private String topicShortName;

    /**
     * 设备对该Topic类的操作权限，取值
sub:订阅
pub:发布

     * Required:true
     */
    @Required
    private String topicOperation;

    /**
     * 描述, 0-50个字符
     */
    private String topicDescription;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * IoT Engine实例ID信息
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 产品Key
     * Required:true
     */
    @Required
    private String productKey;


    /**
     * get 自定义类目名称, /user/{productKey}/{identifier}/topicShortName
     *
     * @return
     */
    public String getTopicShortName() {
        return topicShortName;
    }

    /**
     * set 自定义类目名称, /user/{productKey}/{identifier}/topicShortName
     *
     * @param topicShortName
     */
    public void setTopicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
    }

    /**
     * get 设备对该Topic类的操作权限，取值
sub:订阅
pub:发布

     *
     * @return
     */
    public String getTopicOperation() {
        return topicOperation;
    }

    /**
     * set 设备对该Topic类的操作权限，取值
sub:订阅
pub:发布

     *
     * @param topicOperation
     */
    public void setTopicOperation(String topicOperation) {
        this.topicOperation = topicOperation;
    }

    /**
     * get 描述, 0-50个字符
     *
     * @return
     */
    public String getTopicDescription() {
        return topicDescription;
    }

    /**
     * set 描述, 0-50个字符
     *
     * @param topicDescription
     */
    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
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
     * get IoT Engine实例ID信息
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set IoT Engine实例ID信息
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 产品Key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }


    /**
     * set 自定义类目名称, /user/{productKey}/{identifier}/topicShortName
     *
     * @param topicShortName
     */
    public CreateProductTopicRequest topicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
        return this;
    }

    /**
     * set 设备对该Topic类的操作权限，取值
sub:订阅
pub:发布

     *
     * @param topicOperation
     */
    public CreateProductTopicRequest topicOperation(String topicOperation) {
        this.topicOperation = topicOperation;
        return this;
    }

    /**
     * set 描述, 0-50个字符
     *
     * @param topicDescription
     */
    public CreateProductTopicRequest topicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateProductTopicRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set IoT Engine实例ID信息
     *
     * @param instanceId
     */
    public CreateProductTopicRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public CreateProductTopicRequest productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }


}
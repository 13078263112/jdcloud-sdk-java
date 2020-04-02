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
 * kafka实例接口
 * kafka实例的创建、变配、删除、查询接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kafka.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.kafka.model.InstanceSpec;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建一个指定配置的kafka实例
 */
public class CreateInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * kafka实例的相关配置
     * Required:true
     */
    @Required
    private InstanceSpec instance;

    /**
     * 计费信息的相关配置，只有prepaid_by_duration和postpaid_by_duration 2种计费模式
     */
    private ChargeSpec charge;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get kafka实例的相关配置
     *
     * @return
     */
    public InstanceSpec getInstance() {
        return instance;
    }

    /**
     * set kafka实例的相关配置
     *
     * @param instance
     */
    public void setInstance(InstanceSpec instance) {
        this.instance = instance;
    }

    /**
     * get 计费信息的相关配置，只有prepaid_by_duration和postpaid_by_duration 2种计费模式
     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set 计费信息的相关配置，只有prepaid_by_duration和postpaid_by_duration 2种计费模式
     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }

    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set kafka实例的相关配置
     *
     * @param instance
     */
    public CreateInstanceRequest instance(InstanceSpec instance) {
        this.instance = instance;
        return this;
    }

    /**
     * set 计费信息的相关配置，只有prepaid_by_duration和postpaid_by_duration 2种计费模式
     *
     * @param charge
     */
    public CreateInstanceRequest charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public CreateInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}
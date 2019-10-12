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
 * DeviceInfo
 * device管理模块
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除设备
 */
public class RemoveDeviceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备名称
     * Required:true
     */
    @Required
    private String deviceName;

    /**
     * 设备归属的实例所在区域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 产品Key
     * Required:true
     */
    @Required
    private String productKey;


    /**
     * get 设备名称
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 设备归属的实例所在区域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
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
     * set 设备名称
     *
     * @param deviceName
     */
    public RemoveDeviceRequest deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public RemoveDeviceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public RemoveDeviceRequest productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }


}
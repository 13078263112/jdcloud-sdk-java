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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;


/**
 * deviceCredential
 */
public class DeviceCredential  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备Id
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备鉴权标识
     */
    private String identifier;

    /**
     * 设备秘钥
     */
    private String secret;

    /**
     * 所属产品
     */
    private String productKey;


    /**
     * get 设备Id
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备Id
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

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
     * get 设备鉴权标识
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set 设备鉴权标识
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * get 设备秘钥
     *
     * @return
     */
    public String getSecret() {
        return secret;
    }

    /**
     * set 设备秘钥
     *
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * get 所属产品
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 所属产品
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }


    /**
     * set 设备Id
     *
     * @param deviceId
     */
    public DeviceCredential deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public DeviceCredential deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 设备鉴权标识
     *
     * @param identifier
     */
    public DeviceCredential identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * set 设备秘钥
     *
     * @param secret
     */
    public DeviceCredential secret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * set 所属产品
     *
     * @param productKey
     */
    public DeviceCredential productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }


}
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
 * DeployApp
 * DeployApp 部署详情
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotedge.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 部署APP应用
 */
public class DeployAppRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * App内部名称
     * Required:true
     */
    @Required
    private String appName;

    /**
     * App版本
     * Required:true
     */
    @Required
    private String appVersion;

    /**
     * edge名称
     * Required:true
     */
    @Required
    private String edgeName;

    /**
     * App安装变量（默认为空字符串）
     */
    private String env;

    /**
     * 是否特权模式运行(0-否 1-是)
     * Required:true
     */
    @Required
    private Integer privileged;

    /**
     * 硬盘操作卷
     */
    private String volume;

    /**
     * App类型(1-设备服务 2-边缘应用)
     * Required:true
     */
    @Required
    private Integer appType;

    /**
     * 是否使用Edge系统的Host配置(0-否 1-是)
     * Required:true
     */
    @Required
    private Integer useHost;

    /**
     * CPU权重（低-128 中-256 高-512）
     * Required:true
     */
    @Required
    private Integer cpuShares;

    /**
     * 内存限制（0-无限 低-128 中-256 高-512）
     * Required:true
     */
    @Required
    private String memoryLimit;

    /**
     * 重启策略(0-never 1-always 2-onFailure)
     * Required:true
     */
    @Required
    private String restartPolicy;

    /**
     * 部署APP状态(3-更新 其余都是安装)
     * Required:true
     */
    @Required
    private Integer deployAppStatus;

    /**
     * App状态
     */
    private Integer appStatus;

    /**
     * 设备归属的实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 设备归属的实例所在区域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 硬件版本
     * Required:true
     */
    @Required
    private String hardwareId;

    /**
     * OSID
     * Required:true
     */
    @Required
    private String osId;


    /**
     * get App内部名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set App内部名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get App版本
     *
     * @return
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * set App版本
     *
     * @param appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * get edge名称
     *
     * @return
     */
    public String getEdgeName() {
        return edgeName;
    }

    /**
     * set edge名称
     *
     * @param edgeName
     */
    public void setEdgeName(String edgeName) {
        this.edgeName = edgeName;
    }

    /**
     * get App安装变量（默认为空字符串）
     *
     * @return
     */
    public String getEnv() {
        return env;
    }

    /**
     * set App安装变量（默认为空字符串）
     *
     * @param env
     */
    public void setEnv(String env) {
        this.env = env;
    }

    /**
     * get 是否特权模式运行(0-否 1-是)
     *
     * @return
     */
    public Integer getPrivileged() {
        return privileged;
    }

    /**
     * set 是否特权模式运行(0-否 1-是)
     *
     * @param privileged
     */
    public void setPrivileged(Integer privileged) {
        this.privileged = privileged;
    }

    /**
     * get 硬盘操作卷
     *
     * @return
     */
    public String getVolume() {
        return volume;
    }

    /**
     * set 硬盘操作卷
     *
     * @param volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * get App类型(1-设备服务 2-边缘应用)
     *
     * @return
     */
    public Integer getAppType() {
        return appType;
    }

    /**
     * set App类型(1-设备服务 2-边缘应用)
     *
     * @param appType
     */
    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    /**
     * get 是否使用Edge系统的Host配置(0-否 1-是)
     *
     * @return
     */
    public Integer getUseHost() {
        return useHost;
    }

    /**
     * set 是否使用Edge系统的Host配置(0-否 1-是)
     *
     * @param useHost
     */
    public void setUseHost(Integer useHost) {
        this.useHost = useHost;
    }

    /**
     * get CPU权重（低-128 中-256 高-512）
     *
     * @return
     */
    public Integer getCpuShares() {
        return cpuShares;
    }

    /**
     * set CPU权重（低-128 中-256 高-512）
     *
     * @param cpuShares
     */
    public void setCpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
    }

    /**
     * get 内存限制（0-无限 低-128 中-256 高-512）
     *
     * @return
     */
    public String getMemoryLimit() {
        return memoryLimit;
    }

    /**
     * set 内存限制（0-无限 低-128 中-256 高-512）
     *
     * @param memoryLimit
     */
    public void setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    /**
     * get 重启策略(0-never 1-always 2-onFailure)
     *
     * @return
     */
    public String getRestartPolicy() {
        return restartPolicy;
    }

    /**
     * set 重启策略(0-never 1-always 2-onFailure)
     *
     * @param restartPolicy
     */
    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    /**
     * get 部署APP状态(3-更新 其余都是安装)
     *
     * @return
     */
    public Integer getDeployAppStatus() {
        return deployAppStatus;
    }

    /**
     * set 部署APP状态(3-更新 其余都是安装)
     *
     * @param deployAppStatus
     */
    public void setDeployAppStatus(Integer deployAppStatus) {
        this.deployAppStatus = deployAppStatus;
    }

    /**
     * get App状态
     *
     * @return
     */
    public Integer getAppStatus() {
        return appStatus;
    }

    /**
     * set App状态
     *
     * @param appStatus
     */
    public void setAppStatus(Integer appStatus) {
        this.appStatus = appStatus;
    }

    /**
     * get 设备归属的实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 设备归属的实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
     * get 硬件版本
     *
     * @return
     */
    public String getHardwareId() {
        return hardwareId;
    }

    /**
     * set 硬件版本
     *
     * @param hardwareId
     */
    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    /**
     * get OSID
     *
     * @return
     */
    public String getOsId() {
        return osId;
    }

    /**
     * set OSID
     *
     * @param osId
     */
    public void setOsId(String osId) {
        this.osId = osId;
    }


    /**
     * set App内部名称
     *
     * @param appName
     */
    public DeployAppRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set App版本
     *
     * @param appVersion
     */
    public DeployAppRequest appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * set edge名称
     *
     * @param edgeName
     */
    public DeployAppRequest edgeName(String edgeName) {
        this.edgeName = edgeName;
        return this;
    }

    /**
     * set App安装变量（默认为空字符串）
     *
     * @param env
     */
    public DeployAppRequest env(String env) {
        this.env = env;
        return this;
    }

    /**
     * set 是否特权模式运行(0-否 1-是)
     *
     * @param privileged
     */
    public DeployAppRequest privileged(Integer privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * set 硬盘操作卷
     *
     * @param volume
     */
    public DeployAppRequest volume(String volume) {
        this.volume = volume;
        return this;
    }

    /**
     * set App类型(1-设备服务 2-边缘应用)
     *
     * @param appType
     */
    public DeployAppRequest appType(Integer appType) {
        this.appType = appType;
        return this;
    }

    /**
     * set 是否使用Edge系统的Host配置(0-否 1-是)
     *
     * @param useHost
     */
    public DeployAppRequest useHost(Integer useHost) {
        this.useHost = useHost;
        return this;
    }

    /**
     * set CPU权重（低-128 中-256 高-512）
     *
     * @param cpuShares
     */
    public DeployAppRequest cpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
        return this;
    }

    /**
     * set 内存限制（0-无限 低-128 中-256 高-512）
     *
     * @param memoryLimit
     */
    public DeployAppRequest memoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }

    /**
     * set 重启策略(0-never 1-always 2-onFailure)
     *
     * @param restartPolicy
     */
    public DeployAppRequest restartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * set 部署APP状态(3-更新 其余都是安装)
     *
     * @param deployAppStatus
     */
    public DeployAppRequest deployAppStatus(Integer deployAppStatus) {
        this.deployAppStatus = deployAppStatus;
        return this;
    }

    /**
     * set App状态
     *
     * @param appStatus
     */
    public DeployAppRequest appStatus(Integer appStatus) {
        this.appStatus = appStatus;
        return this;
    }

    /**
     * set 设备归属的实例ID
     *
     * @param instanceId
     */
    public DeployAppRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 设备归属的实例所在区域
     *
     * @param regionId
     */
    public DeployAppRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 硬件版本
     *
     * @param hardwareId
     */
    public DeployAppRequest hardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
        return this;
    }

    /**
     * set OSID
     *
     * @param osId
     */
    public DeployAppRequest osId(String osId) {
        this.osId = osId;
        return this;
    }


}
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

package com.jdcloud.sdk.service.iotedge.model;


/**
 * appOnlineParam
 */
public class AppOnlineParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * App名称
     */
    private String appName;

    /**
     * App描述
     */
    private String appDesc;

    /**
     * App环境变量
     */
    private String appEnv;

    /**
     * App添加卷
     */
    private String appVolume;

    /**
     * 是否使用SSL，0-不使用，1-使用
     */
    private Integer useSSL;

    /**
     * 使用特权运行，0-不使用，1-使用
     */
    private Integer usePrivileged;

    /**
     * 对外发布端口
     */
    private Integer publishPort;


    /**
     * get App名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set App名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get App描述
     *
     * @return
     */
    public String getAppDesc() {
        return appDesc;
    }

    /**
     * set App描述
     *
     * @param appDesc
     */
    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    /**
     * get App环境变量
     *
     * @return
     */
    public String getAppEnv() {
        return appEnv;
    }

    /**
     * set App环境变量
     *
     * @param appEnv
     */
    public void setAppEnv(String appEnv) {
        this.appEnv = appEnv;
    }

    /**
     * get App添加卷
     *
     * @return
     */
    public String getAppVolume() {
        return appVolume;
    }

    /**
     * set App添加卷
     *
     * @param appVolume
     */
    public void setAppVolume(String appVolume) {
        this.appVolume = appVolume;
    }

    /**
     * get 是否使用SSL，0-不使用，1-使用
     *
     * @return
     */
    public Integer getUseSSL() {
        return useSSL;
    }

    /**
     * set 是否使用SSL，0-不使用，1-使用
     *
     * @param useSSL
     */
    public void setUseSSL(Integer useSSL) {
        this.useSSL = useSSL;
    }

    /**
     * get 使用特权运行，0-不使用，1-使用
     *
     * @return
     */
    public Integer getUsePrivileged() {
        return usePrivileged;
    }

    /**
     * set 使用特权运行，0-不使用，1-使用
     *
     * @param usePrivileged
     */
    public void setUsePrivileged(Integer usePrivileged) {
        this.usePrivileged = usePrivileged;
    }

    /**
     * get 对外发布端口
     *
     * @return
     */
    public Integer getPublishPort() {
        return publishPort;
    }

    /**
     * set 对外发布端口
     *
     * @param publishPort
     */
    public void setPublishPort(Integer publishPort) {
        this.publishPort = publishPort;
    }


    /**
     * set App名称
     *
     * @param appName
     */
    public AppOnlineParam appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set App描述
     *
     * @param appDesc
     */
    public AppOnlineParam appDesc(String appDesc) {
        this.appDesc = appDesc;
        return this;
    }

    /**
     * set App环境变量
     *
     * @param appEnv
     */
    public AppOnlineParam appEnv(String appEnv) {
        this.appEnv = appEnv;
        return this;
    }

    /**
     * set App添加卷
     *
     * @param appVolume
     */
    public AppOnlineParam appVolume(String appVolume) {
        this.appVolume = appVolume;
        return this;
    }

    /**
     * set 是否使用SSL，0-不使用，1-使用
     *
     * @param useSSL
     */
    public AppOnlineParam useSSL(Integer useSSL) {
        this.useSSL = useSSL;
        return this;
    }

    /**
     * set 使用特权运行，0-不使用，1-使用
     *
     * @param usePrivileged
     */
    public AppOnlineParam usePrivileged(Integer usePrivileged) {
        this.usePrivileged = usePrivileged;
        return this;
    }

    /**
     * set 对外发布端口
     *
     * @param publishPort
     */
    public AppOnlineParam publishPort(Integer publishPort) {
        this.publishPort = publishPort;
        return this;
    }


}
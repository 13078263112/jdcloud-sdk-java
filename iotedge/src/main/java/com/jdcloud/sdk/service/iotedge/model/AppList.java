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
 * appList
 */
public class AppList  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * App业务编号
     */
    private String appId;

    /**
     * 云翼编译编号
     */
    private String arkId;

    /**
     * APP版本号
     */
    private String appVersion;

    /**
     * 发布时间
     */
    private String releaseTime;

    /**
     * APP状态，0-发布成功，1-发布失败，2-审核通过，3-审核不通过，4-上线，5-下线，99-发布中
     */
    private String appStatus;

    /**
     * 上线时间
     */
    private String onlineTime;

    /**
     * 物模型编号
     */
    private String tmId;

    /**
     * 物模型名称
     */
    private String tmName;


    /**
     * get App业务编号
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set App业务编号
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 云翼编译编号
     *
     * @return
     */
    public String getArkId() {
        return arkId;
    }

    /**
     * set 云翼编译编号
     *
     * @param arkId
     */
    public void setArkId(String arkId) {
        this.arkId = arkId;
    }

    /**
     * get APP版本号
     *
     * @return
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * set APP版本号
     *
     * @param appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * get 发布时间
     *
     * @return
     */
    public String getReleaseTime() {
        return releaseTime;
    }

    /**
     * set 发布时间
     *
     * @param releaseTime
     */
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * get APP状态，0-发布成功，1-发布失败，2-审核通过，3-审核不通过，4-上线，5-下线，99-发布中
     *
     * @return
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * set APP状态，0-发布成功，1-发布失败，2-审核通过，3-审核不通过，4-上线，5-下线，99-发布中
     *
     * @param appStatus
     */
    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    /**
     * get 上线时间
     *
     * @return
     */
    public String getOnlineTime() {
        return onlineTime;
    }

    /**
     * set 上线时间
     *
     * @param onlineTime
     */
    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    /**
     * get 物模型编号
     *
     * @return
     */
    public String getTmId() {
        return tmId;
    }

    /**
     * set 物模型编号
     *
     * @param tmId
     */
    public void setTmId(String tmId) {
        this.tmId = tmId;
    }

    /**
     * get 物模型名称
     *
     * @return
     */
    public String getTmName() {
        return tmName;
    }

    /**
     * set 物模型名称
     *
     * @param tmName
     */
    public void setTmName(String tmName) {
        this.tmName = tmName;
    }


    /**
     * set App业务编号
     *
     * @param appId
     */
    public AppList appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 云翼编译编号
     *
     * @param arkId
     */
    public AppList arkId(String arkId) {
        this.arkId = arkId;
        return this;
    }

    /**
     * set APP版本号
     *
     * @param appVersion
     */
    public AppList appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * set 发布时间
     *
     * @param releaseTime
     */
    public AppList releaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

    /**
     * set APP状态，0-发布成功，1-发布失败，2-审核通过，3-审核不通过，4-上线，5-下线，99-发布中
     *
     * @param appStatus
     */
    public AppList appStatus(String appStatus) {
        this.appStatus = appStatus;
        return this;
    }

    /**
     * set 上线时间
     *
     * @param onlineTime
     */
    public AppList onlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
        return this;
    }

    /**
     * set 物模型编号
     *
     * @param tmId
     */
    public AppList tmId(String tmId) {
        this.tmId = tmId;
        return this;
    }

    /**
     * set 物模型名称
     *
     * @param tmName
     */
    public AppList tmName(String tmName) {
        this.tmName = tmName;
        return this;
    }


}
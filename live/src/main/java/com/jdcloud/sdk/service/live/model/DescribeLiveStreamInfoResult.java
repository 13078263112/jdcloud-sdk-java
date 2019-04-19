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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询直播实时流信息

 */
public class DescribeLiveStreamInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
     */
    private String publishDomain;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 流名称
     */
    private String streamName;

    /**
     * 流状态
  on: 在线流
  off: 非在线流

     */
    private String status;


    /**
     * get 推流域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 流名称
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 流状态
  on: 在线流
  off: 非在线流

     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 流状态
  on: 在线流
  off: 非在线流

     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public DescribeLiveStreamInfoResult publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public DescribeLiveStreamInfoResult appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public DescribeLiveStreamInfoResult streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 流状态
  on: 在线流
  off: 非在线流

     *
     * @param status
     */
    public DescribeLiveStreamInfoResult status(String status) {
        this.status = status;
        return this;
    }


}
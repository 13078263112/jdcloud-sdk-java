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
 * Media Upload
 * 文件上传
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取视频上传地址和凭证
 */
public class CreateVideoUploadTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 视频ID
     */
    private String videoId;

    /**
     * 视频上传地址
     */
    private String uploadUrl;


    /**
     * get 视频ID
     *
     * @return
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * set 视频ID
     *
     * @param videoId
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    /**
     * get 视频上传地址
     *
     * @return
     */
    public String getUploadUrl() {
        return uploadUrl;
    }

    /**
     * set 视频上传地址
     *
     * @param uploadUrl
     */
    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }


    /**
     * set 视频ID
     *
     * @param videoId
     */
    public CreateVideoUploadTaskResult videoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    /**
     * set 视频上传地址
     *
     * @param uploadUrl
     */
    public CreateVideoUploadTaskResult uploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }


}
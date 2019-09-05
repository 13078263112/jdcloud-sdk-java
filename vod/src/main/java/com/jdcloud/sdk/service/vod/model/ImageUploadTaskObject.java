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

package com.jdcloud.sdk.service.vod.model;


/**
 * 图片上传地址和凭证
 */
public class ImageUploadTaskObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片ID
     */
    private String imageId;

    /**
     * 图片上传地址
     */
    private String uploadUrl;


    /**
     * get 图片ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 图片ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 图片上传地址
     *
     * @return
     */
    public String getUploadUrl() {
        return uploadUrl;
    }

    /**
     * set 图片上传地址
     *
     * @param uploadUrl
     */
    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }


    /**
     * set 图片ID
     *
     * @param imageId
     */
    public ImageUploadTaskObject imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 图片上传地址
     *
     * @param uploadUrl
     */
    public ImageUploadTaskObject uploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }


}
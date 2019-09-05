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
 * 视频基础信息
 */
public class VideoBaseInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 视频ID
     */
    private String videoId;

    /**
     * 视频名称
     */
    private String videoName;

    /**
     * 视频描述
     */
    private String description;

    /**
     * categoryId
     */
    private Long categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 标签
     */
    private String tags;

    /**
     * 视频时长
     */
    private Long duration;

    /**
     * 封面地址
     */
    private String coverUrl;


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
     * get 视频名称
     *
     * @return
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * set 视频名称
     *
     * @param videoName
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    /**
     * get 视频描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 视频描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get categoryId
     *
     * @return
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * set categoryId
     *
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * get 分类名称
     *
     * @return
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * set 分类名称
     *
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * get 标签
     *
     * @return
     */
    public String getTags() {
        return tags;
    }

    /**
     * set 标签
     *
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * get 视频时长
     *
     * @return
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * set 视频时长
     *
     * @param duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * get 封面地址
     *
     * @return
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * set 封面地址
     *
     * @param coverUrl
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }


    /**
     * set 视频ID
     *
     * @param videoId
     */
    public VideoBaseInfo videoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    /**
     * set 视频名称
     *
     * @param videoName
     */
    public VideoBaseInfo videoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    /**
     * set 视频描述
     *
     * @param description
     */
    public VideoBaseInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set categoryId
     *
     * @param categoryId
     */
    public VideoBaseInfo categoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * set 分类名称
     *
     * @param categoryName
     */
    public VideoBaseInfo categoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * set 标签
     *
     * @param tags
     */
    public VideoBaseInfo tags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 视频时长
     *
     * @param duration
     */
    public VideoBaseInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * set 封面地址
     *
     * @param coverUrl
     */
    public VideoBaseInfo coverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }


}
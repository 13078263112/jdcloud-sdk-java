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
 * Media Category
 * 分类管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * 下级分类
 */
public class SubCategory  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     */
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类级别
     */
    private Integer level;

    /**
     * 分类描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 分类ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 分类ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 分类名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 分类名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 分类级别
     *
     * @return
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * set 分类级别
     *
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * get 分类描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 分类描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 分类ID
     *
     * @param id
     */
    public SubCategory id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 分类名称
     *
     * @param name
     */
    public SubCategory name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 分类级别
     *
     * @param level
     */
    public SubCategory level(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * set 分类描述
     *
     * @param description
     */
    public SubCategory description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public SubCategory createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public SubCategory updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}
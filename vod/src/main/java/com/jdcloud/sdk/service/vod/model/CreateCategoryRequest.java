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
 * Category
 * 分类管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加分类
 */
public class CreateCategoryRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 父分类ID，取值为 0 或 null 时，表示该分类为一级分类

     */
    private Long parentId;

    /**
     * 分类描述信息
     */
    private String description;


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
     * get 父分类ID，取值为 0 或 null 时，表示该分类为一级分类

     *
     * @return
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * set 父分类ID，取值为 0 或 null 时，表示该分类为一级分类

     *
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * get 分类描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 分类描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * set 分类名称
     *
     * @param name
     */
    public CreateCategoryRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 父分类ID，取值为 0 或 null 时，表示该分类为一级分类

     *
     * @param parentId
     */
    public CreateCategoryRequest parentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * set 分类描述信息
     *
     * @param description
     */
    public CreateCategoryRequest description(String description) {
        this.description = description;
        return this;
    }


}
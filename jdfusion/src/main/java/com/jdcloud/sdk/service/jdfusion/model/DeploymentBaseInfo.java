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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 部署信息
 */
public class DeploymentBaseInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云ID
     */
    private String cloudId;

    /**
     * 版本
     */
    private String version;

    /**
     * 是否只读 0：否 1：是
     */
    private Integer readOnly;

    /**
     * ID
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 更新时间
     */
    private String updatedTime;

    /**
     * 最近一次操作
     */
    private String lastOperation;


    /**
     * get 云ID
     *
     * @return
     */
    public String getCloudId() {
        return cloudId;
    }

    /**
     * set 云ID
     *
     * @param cloudId
     */
    public void setCloudId(String cloudId) {
        this.cloudId = cloudId;
    }

    /**
     * get 版本
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 版本
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 是否只读 0：否 1：是
     *
     * @return
     */
    public Integer getReadOnly() {
        return readOnly;
    }

    /**
     * set 是否只读 0：否 1：是
     *
     * @param readOnly
     */
    public void setReadOnly(Integer readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * get ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 用户ID
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 用户ID
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * set 更新时间
     *
     * @param updatedTime
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * get 最近一次操作
     *
     * @return
     */
    public String getLastOperation() {
        return lastOperation;
    }

    /**
     * set 最近一次操作
     *
     * @param lastOperation
     */
    public void setLastOperation(String lastOperation) {
        this.lastOperation = lastOperation;
    }


    /**
     * set 云ID
     *
     * @param cloudId
     */
    public DeploymentBaseInfo cloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * set 版本
     *
     * @param version
     */
    public DeploymentBaseInfo version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 是否只读 0：否 1：是
     *
     * @param readOnly
     */
    public DeploymentBaseInfo readOnly(Integer readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * set ID
     *
     * @param id
     */
    public DeploymentBaseInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public DeploymentBaseInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public DeploymentBaseInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 用户ID
     *
     * @param userId
     */
    public DeploymentBaseInfo userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public DeploymentBaseInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updatedTime
     */
    public DeploymentBaseInfo updatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * set 最近一次操作
     *
     * @param lastOperation
     */
    public DeploymentBaseInfo lastOperation(String lastOperation) {
        this.lastOperation = lastOperation;
        return this;
    }


}
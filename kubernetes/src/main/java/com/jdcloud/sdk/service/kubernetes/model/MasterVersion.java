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

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;

/**
 * masterVersion
 */
public class MasterVersion  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 集群版本号
     */
    private String version;

    /**
     * 是否默认版本
     */
    private Boolean isDefault;

    /**
     * 默认工作节点版本号
     */
    private String defaultNodeVersion;

    /**
     * 版本状态
     */
    private String versionStatus;

    /**
     * node 节点的配置
     */
    private List<NodeVersion> nodeVersions;


    /**
     * get 集群版本号
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 集群版本号
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 是否默认版本
     *
     * @return
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * set 是否默认版本
     *
     * @param isDefault
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * get 默认工作节点版本号
     *
     * @return
     */
    public String getDefaultNodeVersion() {
        return defaultNodeVersion;
    }

    /**
     * set 默认工作节点版本号
     *
     * @param defaultNodeVersion
     */
    public void setDefaultNodeVersion(String defaultNodeVersion) {
        this.defaultNodeVersion = defaultNodeVersion;
    }

    /**
     * get 版本状态
     *
     * @return
     */
    public String getVersionStatus() {
        return versionStatus;
    }

    /**
     * set 版本状态
     *
     * @param versionStatus
     */
    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }

    /**
     * get node 节点的配置
     *
     * @return
     */
    public List<NodeVersion> getNodeVersions() {
        return nodeVersions;
    }

    /**
     * set node 节点的配置
     *
     * @param nodeVersions
     */
    public void setNodeVersions(List<NodeVersion> nodeVersions) {
        this.nodeVersions = nodeVersions;
    }


    /**
     * set 集群版本号
     *
     * @param version
     */
    public MasterVersion version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 是否默认版本
     *
     * @param isDefault
     */
    public MasterVersion isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * set 默认工作节点版本号
     *
     * @param defaultNodeVersion
     */
    public MasterVersion defaultNodeVersion(String defaultNodeVersion) {
        this.defaultNodeVersion = defaultNodeVersion;
        return this;
    }

    /**
     * set 版本状态
     *
     * @param versionStatus
     */
    public MasterVersion versionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }

    /**
     * set node 节点的配置
     *
     * @param nodeVersions
     */
    public MasterVersion nodeVersions(List<NodeVersion> nodeVersions) {
        this.nodeVersions = nodeVersions;
        return this;
    }


    /**
     * add item to node 节点的配置
     *
     * @param nodeVersion
     */
    public void addNodeVersion(NodeVersion nodeVersion) {
        if (this.nodeVersions == null) {
            this.nodeVersions = new ArrayList<>();
        }
        this.nodeVersions.add(nodeVersion);
    }

}
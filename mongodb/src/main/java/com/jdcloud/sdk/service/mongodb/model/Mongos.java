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

package com.jdcloud.sdk.service.mongodb.model;


/**
 * mongos
 */
public class Mongos  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * mongos节点ID
     */
    private String mongosNodeId;

    /**
     * mongos节点状态
     */
    private String mongosNodeStatus;

    /**
     * mongos节点名称，mongos-N
     */
    private String mongosNodeName;

    /**
     * mongos节点规格代码
     */
    private String mongosNodeType;

    /**
     * mongos节点域名
     */
    private String mongosNodeDomain;

    /**
     * mongos节点端口
     */
    private String mongosNodePort;

    /**
     * mongos节点所在地域
     */
    private String mongosNodeAzId;

    /**
     * mongos节点的CPU
     */
    private Integer mongosNodeCPU;

    /**
     * mongos节点的Memory
     */
    private Integer mongosNodeMemoryGB;


    /**
     * get mongos节点ID
     *
     * @return
     */
    public String getMongosNodeId() {
        return mongosNodeId;
    }

    /**
     * set mongos节点ID
     *
     * @param mongosNodeId
     */
    public void setMongosNodeId(String mongosNodeId) {
        this.mongosNodeId = mongosNodeId;
    }

    /**
     * get mongos节点状态
     *
     * @return
     */
    public String getMongosNodeStatus() {
        return mongosNodeStatus;
    }

    /**
     * set mongos节点状态
     *
     * @param mongosNodeStatus
     */
    public void setMongosNodeStatus(String mongosNodeStatus) {
        this.mongosNodeStatus = mongosNodeStatus;
    }

    /**
     * get mongos节点名称，mongos-N
     *
     * @return
     */
    public String getMongosNodeName() {
        return mongosNodeName;
    }

    /**
     * set mongos节点名称，mongos-N
     *
     * @param mongosNodeName
     */
    public void setMongosNodeName(String mongosNodeName) {
        this.mongosNodeName = mongosNodeName;
    }

    /**
     * get mongos节点规格代码
     *
     * @return
     */
    public String getMongosNodeType() {
        return mongosNodeType;
    }

    /**
     * set mongos节点规格代码
     *
     * @param mongosNodeType
     */
    public void setMongosNodeType(String mongosNodeType) {
        this.mongosNodeType = mongosNodeType;
    }

    /**
     * get mongos节点域名
     *
     * @return
     */
    public String getMongosNodeDomain() {
        return mongosNodeDomain;
    }

    /**
     * set mongos节点域名
     *
     * @param mongosNodeDomain
     */
    public void setMongosNodeDomain(String mongosNodeDomain) {
        this.mongosNodeDomain = mongosNodeDomain;
    }

    /**
     * get mongos节点端口
     *
     * @return
     */
    public String getMongosNodePort() {
        return mongosNodePort;
    }

    /**
     * set mongos节点端口
     *
     * @param mongosNodePort
     */
    public void setMongosNodePort(String mongosNodePort) {
        this.mongosNodePort = mongosNodePort;
    }

    /**
     * get mongos节点所在地域
     *
     * @return
     */
    public String getMongosNodeAzId() {
        return mongosNodeAzId;
    }

    /**
     * set mongos节点所在地域
     *
     * @param mongosNodeAzId
     */
    public void setMongosNodeAzId(String mongosNodeAzId) {
        this.mongosNodeAzId = mongosNodeAzId;
    }

    /**
     * get mongos节点的CPU
     *
     * @return
     */
    public Integer getMongosNodeCPU() {
        return mongosNodeCPU;
    }

    /**
     * set mongos节点的CPU
     *
     * @param mongosNodeCPU
     */
    public void setMongosNodeCPU(Integer mongosNodeCPU) {
        this.mongosNodeCPU = mongosNodeCPU;
    }

    /**
     * get mongos节点的Memory
     *
     * @return
     */
    public Integer getMongosNodeMemoryGB() {
        return mongosNodeMemoryGB;
    }

    /**
     * set mongos节点的Memory
     *
     * @param mongosNodeMemoryGB
     */
    public void setMongosNodeMemoryGB(Integer mongosNodeMemoryGB) {
        this.mongosNodeMemoryGB = mongosNodeMemoryGB;
    }


    /**
     * set mongos节点ID
     *
     * @param mongosNodeId
     */
    public Mongos mongosNodeId(String mongosNodeId) {
        this.mongosNodeId = mongosNodeId;
        return this;
    }

    /**
     * set mongos节点状态
     *
     * @param mongosNodeStatus
     */
    public Mongos mongosNodeStatus(String mongosNodeStatus) {
        this.mongosNodeStatus = mongosNodeStatus;
        return this;
    }

    /**
     * set mongos节点名称，mongos-N
     *
     * @param mongosNodeName
     */
    public Mongos mongosNodeName(String mongosNodeName) {
        this.mongosNodeName = mongosNodeName;
        return this;
    }

    /**
     * set mongos节点规格代码
     *
     * @param mongosNodeType
     */
    public Mongos mongosNodeType(String mongosNodeType) {
        this.mongosNodeType = mongosNodeType;
        return this;
    }

    /**
     * set mongos节点域名
     *
     * @param mongosNodeDomain
     */
    public Mongos mongosNodeDomain(String mongosNodeDomain) {
        this.mongosNodeDomain = mongosNodeDomain;
        return this;
    }

    /**
     * set mongos节点端口
     *
     * @param mongosNodePort
     */
    public Mongos mongosNodePort(String mongosNodePort) {
        this.mongosNodePort = mongosNodePort;
        return this;
    }

    /**
     * set mongos节点所在地域
     *
     * @param mongosNodeAzId
     */
    public Mongos mongosNodeAzId(String mongosNodeAzId) {
        this.mongosNodeAzId = mongosNodeAzId;
        return this;
    }

    /**
     * set mongos节点的CPU
     *
     * @param mongosNodeCPU
     */
    public Mongos mongosNodeCPU(Integer mongosNodeCPU) {
        this.mongosNodeCPU = mongosNodeCPU;
        return this;
    }

    /**
     * set mongos节点的Memory
     *
     * @param mongosNodeMemoryGB
     */
    public Mongos mongosNodeMemoryGB(Integer mongosNodeMemoryGB) {
        this.mongosNodeMemoryGB = mongosNodeMemoryGB;
        return this;
    }


}
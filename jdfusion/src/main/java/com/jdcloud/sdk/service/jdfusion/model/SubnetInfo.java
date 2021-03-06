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
 * 子网属性信息
 */
public class SubnetInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Subnet的Id
     */
    private String id;

    /**
     * 子网所属VPC的Id
     */
    private String vpcId;

    /**
     * 子网名称
     */
    private String subnetName;

    /**
     * 子网网段
     */
    private String cidrBlock;

    /**
     * 子网可用ip数量
     */
    private Integer availableIpCount;

    /**
     * 子网描述信息
     */
    private String description;

    /**
     * 子网的结束地址
     */
    private String endIp;

    /**
     * 子网关联的路由表Id
     */
    private String routeTableId;

    /**
     * 子网的起始地址
     */
    private String startIp;

    /**
     * 所属云提供商ID
     */
    private String cloudID;

    /**
     * 可用区
     */
    private String az;

    /**
     * 子网创建时间
     */
    private String createdTime;


    /**
     * get Subnet的Id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set Subnet的Id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 子网所属VPC的Id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 子网所属VPC的Id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网名称
     *
     * @return
     */
    public String getSubnetName() {
        return subnetName;
    }

    /**
     * set 子网名称
     *
     * @param subnetName
     */
    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    /**
     * get 子网网段
     *
     * @return
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * set 子网网段
     *
     * @param cidrBlock
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * get 子网可用ip数量
     *
     * @return
     */
    public Integer getAvailableIpCount() {
        return availableIpCount;
    }

    /**
     * set 子网可用ip数量
     *
     * @param availableIpCount
     */
    public void setAvailableIpCount(Integer availableIpCount) {
        this.availableIpCount = availableIpCount;
    }

    /**
     * get 子网描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 子网描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 子网的结束地址
     *
     * @return
     */
    public String getEndIp() {
        return endIp;
    }

    /**
     * set 子网的结束地址
     *
     * @param endIp
     */
    public void setEndIp(String endIp) {
        this.endIp = endIp;
    }

    /**
     * get 子网关联的路由表Id
     *
     * @return
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * set 子网关联的路由表Id
     *
     * @param routeTableId
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * get 子网的起始地址
     *
     * @return
     */
    public String getStartIp() {
        return startIp;
    }

    /**
     * set 子网的起始地址
     *
     * @param startIp
     */
    public void setStartIp(String startIp) {
        this.startIp = startIp;
    }

    /**
     * get 所属云提供商ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get 可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 子网创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 子网创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * set Subnet的Id
     *
     * @param id
     */
    public SubnetInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 子网所属VPC的Id
     *
     * @param vpcId
     */
    public SubnetInfo vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网名称
     *
     * @param subnetName
     */
    public SubnetInfo subnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * set 子网网段
     *
     * @param cidrBlock
     */
    public SubnetInfo cidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * set 子网可用ip数量
     *
     * @param availableIpCount
     */
    public SubnetInfo availableIpCount(Integer availableIpCount) {
        this.availableIpCount = availableIpCount;
        return this;
    }

    /**
     * set 子网描述信息
     *
     * @param description
     */
    public SubnetInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 子网的结束地址
     *
     * @param endIp
     */
    public SubnetInfo endIp(String endIp) {
        this.endIp = endIp;
        return this;
    }

    /**
     * set 子网关联的路由表Id
     *
     * @param routeTableId
     */
    public SubnetInfo routeTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * set 子网的起始地址
     *
     * @param startIp
     */
    public SubnetInfo startIp(String startIp) {
        this.startIp = startIp;
        return this;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public SubnetInfo cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public SubnetInfo az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 子网创建时间
     *
     * @param createdTime
     */
    public SubnetInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


}
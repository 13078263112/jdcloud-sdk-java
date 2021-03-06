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

package com.jdcloud.sdk.service.es.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * instance
 */
public class Instance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 实例版本，目前支持5.6.9和6.5.4两个版本
     */
    private String instanceVersion;

    /**
     * 实例状态，running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中
     */
    private String instanceStatus;

    /**
     * 实例的配置信息
     */
    private InstanceClass instanceClass;

    /**
     * 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     */
    private String createTime;

    /**
     * AZ信息，各AZ编码详见：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/restrictions
     */
    private String azId;

    /**
     * 所属VPC的ID
     */
    private String vpcId;

    /**
     * 所属子网的ID
     */
    private String subnetId;

    /**
     * 计费信息
     */
    private Charge charge;

    /**
     * 内网地址
     */
    private InternalEndpoint internalEndpoint;

    /**
     * deprecated，见internalEndpoint
     */
    private String endpoint;

    /**
     * kibana地址
     */
    private String kibanaUrl;

    /**
     * head地址
     */
    private String headUrl;

    /**
     * 值为v4&amp;v6时支持ipv6和ipv4, 值为空时仅支持ipv4
     */
    private String ipVersion;

    /**
     * Tag信息
     */
    private List<Tag> tags;

    /**
     * 是否开启了专用主节点，true为开启，false为不开启
     */
    private Boolean dedicatedMaster;

    /**
     * 是否开启了协调节点，true为开启，false为不开启
     */
    private Boolean coordinating;

    /**
     * kibana floatIp地址
     */
    private String kibanaFiUrl;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例版本，目前支持5.6.9和6.5.4两个版本
     *
     * @return
     */
    public String getInstanceVersion() {
        return instanceVersion;
    }

    /**
     * set 实例版本，目前支持5.6.9和6.5.4两个版本
     *
     * @param instanceVersion
     */
    public void setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
    }

    /**
     * get 实例状态，running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set 实例状态，running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * get 实例的配置信息
     *
     * @return
     */
    public InstanceClass getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 实例的配置信息
     *
     * @param instanceClass
     */
    public void setInstanceClass(InstanceClass instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get AZ信息，各AZ编码详见：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/restrictions
     *
     * @return
     */
    public String getAzId() {
        return azId;
    }

    /**
     * set AZ信息，各AZ编码详见：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/restrictions
     *
     * @param azId
     */
    public void setAzId(String azId) {
        this.azId = azId;
    }

    /**
     * get 所属VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 所属VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 所属子网的ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 所属子网的ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 计费信息
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    /**
     * get 内网地址
     *
     * @return
     */
    public InternalEndpoint getInternalEndpoint() {
        return internalEndpoint;
    }

    /**
     * set 内网地址
     *
     * @param internalEndpoint
     */
    public void setInternalEndpoint(InternalEndpoint internalEndpoint) {
        this.internalEndpoint = internalEndpoint;
    }

    /**
     * get deprecated，见internalEndpoint
     *
     * @return
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * set deprecated，见internalEndpoint
     *
     * @param endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * get kibana地址
     *
     * @return
     */
    public String getKibanaUrl() {
        return kibanaUrl;
    }

    /**
     * set kibana地址
     *
     * @param kibanaUrl
     */
    public void setKibanaUrl(String kibanaUrl) {
        this.kibanaUrl = kibanaUrl;
    }

    /**
     * get head地址
     *
     * @return
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * set head地址
     *
     * @param headUrl
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    /**
     * get 值为v4&amp;v6时支持ipv6和ipv4, 值为空时仅支持ipv4
     *
     * @return
     */
    public String getIpVersion() {
        return ipVersion;
    }

    /**
     * set 值为v4&amp;v6时支持ipv6和ipv4, 值为空时仅支持ipv4
     *
     * @param ipVersion
     */
    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    /**
     * get Tag信息
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * get 是否开启了专用主节点，true为开启，false为不开启
     *
     * @return
     */
    public Boolean getDedicatedMaster() {
        return dedicatedMaster;
    }

    /**
     * set 是否开启了专用主节点，true为开启，false为不开启
     *
     * @param dedicatedMaster
     */
    public void setDedicatedMaster(Boolean dedicatedMaster) {
        this.dedicatedMaster = dedicatedMaster;
    }

    /**
     * get 是否开启了协调节点，true为开启，false为不开启
     *
     * @return
     */
    public Boolean getCoordinating() {
        return coordinating;
    }

    /**
     * set 是否开启了协调节点，true为开启，false为不开启
     *
     * @param coordinating
     */
    public void setCoordinating(Boolean coordinating) {
        this.coordinating = coordinating;
    }

    /**
     * get kibana floatIp地址
     *
     * @return
     */
    public String getKibanaFiUrl() {
        return kibanaFiUrl;
    }

    /**
     * set kibana floatIp地址
     *
     * @param kibanaFiUrl
     */
    public void setKibanaFiUrl(String kibanaFiUrl) {
        this.kibanaFiUrl = kibanaFiUrl;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public Instance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public Instance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例版本，目前支持5.6.9和6.5.4两个版本
     *
     * @param instanceVersion
     */
    public Instance instanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }

    /**
     * set 实例状态，running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中
     *
     * @param instanceStatus
     */
    public Instance instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set 实例的配置信息
     *
     * @param instanceClass
     */
    public Instance instanceClass(InstanceClass instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param createTime
     */
    public Instance createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set AZ信息，各AZ编码详见：https://docs.jdcloud.com/cn/jcs-for-elasticsearch/restrictions
     *
     * @param azId
     */
    public Instance azId(String azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set 所属VPC的ID
     *
     * @param vpcId
     */
    public Instance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 所属子网的ID
     *
     * @param subnetId
     */
    public Instance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public Instance charge(Charge charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set 内网地址
     *
     * @param internalEndpoint
     */
    public Instance internalEndpoint(InternalEndpoint internalEndpoint) {
        this.internalEndpoint = internalEndpoint;
        return this;
    }

    /**
     * set deprecated，见internalEndpoint
     *
     * @param endpoint
     */
    public Instance endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * set kibana地址
     *
     * @param kibanaUrl
     */
    public Instance kibanaUrl(String kibanaUrl) {
        this.kibanaUrl = kibanaUrl;
        return this;
    }

    /**
     * set head地址
     *
     * @param headUrl
     */
    public Instance headUrl(String headUrl) {
        this.headUrl = headUrl;
        return this;
    }

    /**
     * set 值为v4&amp;v6时支持ipv6和ipv4, 值为空时仅支持ipv4
     *
     * @param ipVersion
     */
    public Instance ipVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public Instance tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 是否开启了专用主节点，true为开启，false为不开启
     *
     * @param dedicatedMaster
     */
    public Instance dedicatedMaster(Boolean dedicatedMaster) {
        this.dedicatedMaster = dedicatedMaster;
        return this;
    }

    /**
     * set 是否开启了协调节点，true为开启，false为不开启
     *
     * @param coordinating
     */
    public Instance coordinating(Boolean coordinating) {
        this.coordinating = coordinating;
        return this;
    }

    /**
     * set kibana floatIp地址
     *
     * @param kibanaFiUrl
     */
    public Instance kibanaFiUrl(String kibanaFiUrl) {
        this.kibanaFiUrl = kibanaFiUrl;
        return this;
    }


    /**
     * add item to Tag信息
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}